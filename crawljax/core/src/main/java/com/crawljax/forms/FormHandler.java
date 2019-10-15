package com.crawljax.forms;

import com.crawljax.browser.EmbeddedBrowser;
import com.crawljax.condition.eventablecondition.EventableCondition;
import com.crawljax.core.CandidateElement;
import com.crawljax.core.configuration.CrawlElement;
import com.crawljax.core.configuration.CrawlRules;
import com.crawljax.core.exception.BrowserConnectionException;
import com.crawljax.core.state.Identification;
import com.crawljax.util.DomUtils;
import com.crawljax.util.FSUtils;
import com.crawljax.util.XPathHelper;
import com.google.common.base.Enums;
import com.google.inject.assistedinject.Assisted;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.inject.Inject;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Handles form values and fills in the form input elements with random values of the defined
 * values.
 */
public class FormHandler {
	private static final Logger LOGGER = LoggerFactory.getLogger(FormHandler.class.getName());

	protected final EmbeddedBrowser browser;

	public static final int RANDOM_STRING_LENGTH = 8;

	protected final FormInputValueHelper formInputValueHelper;

	private Set<Identification> inputFieldIdsWithEnterClick;

	@Inject
	public FormHandler(@Assisted EmbeddedBrowser browser, CrawlRules config) {
		this.browser = browser;
		this.inputFieldIdsWithEnterClick = new HashSet<>(config.getInputFieldIdsWithEnterClick());
		this.formInputValueHelper = FormInputValueHelper.getInstance(
				config.getInputSpecification(), config.getFormFillMode(),
				config.isDisableIdAndNameIdentification());
	}

	/**
	 * Fills in the element with the InputValues for input
	 *
	 * @param element the node element
	 * @param input   the input data
	 */
	protected void setInputElementValue(Node element, FormInput input) {

		LOGGER.debug("INPUTFIELD: {} ({})", input.getIdentification(), input.getType());
		if (element == null || input.getInputValues().isEmpty()) {
			return;
		}
		try {

			switch (input.getType()) {
				case NUMBER:
				case TEXT:
				case EMAIL:
				case INPUT:
				case TEXTAREA:
				case PASSWORD:
					handleText(input);
					break;
				case HIDDEN:
					handleHidden(input);
					break;
				case CHECKBOX:
					handleCheckBoxes(input);
					break;
				case RADIO:
					handleRadioSwitches(input);
					break;
				case SELECT:
					handleSelectBoxes(input);
				case DATE:
					handleDate(input);
			}

		} catch (ElementNotVisibleException e) {
			FSUtils.clearCachedLines();
			LOGGER.warn("Element not visible, input not completed.");
		} catch (BrowserConnectionException e) {
			FSUtils.clearCachedLines();
			throw e;
		} catch (RuntimeException e) {
			FSUtils.clearCachedLines();
			LOGGER.error("Could not input element values", e);
		}

		FSUtils.flushCachedLinesOnFile();

	}

	private void handleCheckBoxes(FormInput input) {
		for (InputValue inputValue : input.getInputValues()) {
			boolean check = inputValue.isChecked();

			WebElement inputElement = browser.getWebElement(input.getIdentification());

			if (check && !inputElement.isSelected()) {
				FSUtils.cacheLineToWrite("driver.findElement("
						+ input.getIdentification().getWebDriverByString() + ").click();");
				inputElement.click();
			} else if (!check && inputElement.isSelected()) {
				FSUtils.cacheLineToWrite("driver.findElement("
						+ input.getIdentification().getWebDriverByString() + ").click();");
				inputElement.click();
			}
		}
	}

	private void handleRadioSwitches(FormInput input) {
		for (InputValue inputValue : input.getInputValues()) {
			if (inputValue.isChecked()) {
				WebElement inputElement = browser.getWebElement(input.getIdentification());
				inputElement.click();
				FSUtils.cacheLineToWrite("driver.findElement("
						+ input.getIdentification().getWebDriverByString() + ").click();");
			}
		}
	}

	private void handleDate(FormInput input) {
		String text = input.getInputValues().iterator().next().getValue();
		WebElement inputElement = browser.getWebElement(input.getIdentification());
		inputElement.sendKeys(text);
		FSUtils.cacheLineToWrite("driver.findElement("
				+ input.getIdentification().getWebDriverByString() + ").sendKeys(\"" + text + "\");");
	}

	private void handleSelectBoxes(FormInput input) {
		for (InputValue inputValue : input.getInputValues()) {
			WebElement inputElement = browser.getWebElement(input.getIdentification());
			inputElement.sendKeys(inputValue.getValue());
			FSUtils.cacheLineToWrite("driver.findElement("
					+ input.getIdentification().getWebDriverByString() + ").sendKeys(\"" + inputValue.getValue() + "\");");
		}
	}

	private void handleText(FormInput input) {
		String text = input.getInputValues().iterator().next().getValue();
		if (null == text || text.length() == 0) {
			return;
		}
		WebElement inputElement = browser.getWebElement(input.getIdentification());

		FSUtils.cacheLineToWrite("driver.findElement("
				+ input.getIdentification().getWebDriverByString() + ").clear();");

		inputElement.clear();
		if(this.inputFieldIdsWithEnterClick.isEmpty()
				|| !this.inputFieldIdsWithEnterClick.contains(input.getIdentification())) {
			FSUtils.cacheLineToWrite("driver.findElement("
					+ input.getIdentification().getWebDriverByString() + ").sendKeys(\"" + text + "\");");
			inputElement.sendKeys(text);
		} else {
			FSUtils.cacheLineToWrite("driver.findElement("
					+ input.getIdentification().getWebDriverByString() + ").sendKeys(\"" + text + "\");");
			FSUtils.cacheLineToWrite("driver.findElement("
					+ input.getIdentification().getWebDriverByString() + ").sendKeys(Keys.ENTER);");
			inputElement.sendKeys(text);
			inputElement.sendKeys(Keys.ENTER);
		}
	}

	/**
	 * Enter information into the hidden input field.
	 *
	 * @param input The input to enter into the hidden field.
	 */
	private void handleHidden(FormInput input) {
		String text = input.getInputValues().iterator().next().getValue();
		if (null == text || text.length() == 0) {
			return;
		}
		WebElement inputElement = browser.getWebElement(input.getIdentification());
		JavascriptExecutor js = (JavascriptExecutor) browser.getWebDriver();
		js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", inputElement,
				"value", text);
		FSUtils.cacheLineToWrite("js.executeScript(\"arguments[0].setAttribute(arguments[1], arguments[2]);\", driver.findElement(\""
				+ input.getIdentification().getWebDriverByString() + "\"), \"value\", \"" + text + "\"");
	}

	/**
	 * @return all input element in dom
	 */
	private List<Node> getInputElements(Document dom) {
		List<Node> nodes = new ArrayList<>();
		try {
			NodeList nodeList = XPathHelper.evaluateXpathExpression(dom, "//INPUT");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node candidate = nodeList.item(i);
				Node typeAttribute = candidate.getAttributes().getNamedItem("type");
				//FIXME I don't know why if typeAttribute is not null it is not added to the node list
				if (typeAttribute == null
						|| (Enums
						.getIfPresent(FormInput.InputType.class,
								typeAttribute.getNodeValue().toUpperCase())
						.isPresent())) {

					nodes.add(nodeList.item(i));
				} else if(typeAttribute.getNodeValue().equals("date")) {
					nodes.add(nodeList.item(i));
				}
			}
			nodeList = XPathHelper.evaluateXpathExpression(dom, "//TEXTAREA");
			for (int i = 0; i < nodeList.getLength(); i++) {
				nodes.add(nodeList.item(i));
			}
			nodeList = XPathHelper.evaluateXpathExpression(dom, "//SELECT");
			for (int i = 0; i < nodeList.getLength(); i++) {
				nodes.add(nodeList.item(i));
			}

			return nodes;
		} catch (XPathExpressionException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return nodes;
	}

	public Set<CrawlElement> getFormSubmitButtons() {
		return formInputValueHelper.getFormSubmitButtons();
	}

	/**
	 * @return a list of form inputs.
	 */
	public List<FormInput> getFormInputs() {

		final List<FormInput> formInputs = new ArrayList<>();
		try {
			Document dom = DomUtils.asDocument(browser.getStrippedDom());
			List<Node> nodes = getInputElements(dom);
			for (Node node : nodes) {
				FormInput formInput =
						formInputValueHelper.getFormInputWithIndexValue(browser, node, 0);
				if (formInput != null) {
					formInputs.add(formInput);
				}
			}
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return formInputs;
	}

	/**
	 * Fills in form/input elements.
	 *
	 * @param formInputs form input list.
	 */
	public void handleFormElements(List<FormInput> formInputs) {
		try {
			Document dom = DomUtils.asDocument(browser.getStrippedDomWithoutIframeContent());
			for (FormInput input : formInputs) {
				LOGGER.debug("Filling in: " + input);
				setInputElementValue(formInputValueHelper.getBelongingNode(input, dom), input);
			}
		} catch (IOException | XPathExpressionException e) {
			LOGGER.error(e.getMessage(), e);
		}

	}

	/**
	 * @param sourceElement      the form element
	 * @param eventableCondition the belonging eventable condition for sourceElement
	 * @return a list with Candidate elements for the inputs.
	 */
	public List<CandidateElement> getCandidateElementsForInputs(Element sourceElement,
			EventableCondition eventableCondition) {

		return formInputValueHelper.getCandidateElementsForInputs(browser, sourceElement,
				eventableCondition);
	}

}
