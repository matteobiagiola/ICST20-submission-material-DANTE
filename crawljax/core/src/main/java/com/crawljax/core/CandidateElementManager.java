package com.crawljax.core;

import com.crawljax.browser.EmbeddedBrowser;
import com.crawljax.condition.ConditionTypeChecker;
import com.crawljax.condition.crawlcondition.CrawlCondition;
import com.crawljax.condition.eventablecondition.EventableConditionChecker;
import com.crawljax.core.state.Identification;
import net.jcip.annotations.GuardedBy;
import org.w3c.dom.Element;

import javax.inject.Inject;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * The class is a ExtractorManager for the CandidateElements. It basically implements the
 * ExtractorManager.
 */
public class CandidateElementManager implements ExtractorManager {
	/**
	 * Use the AtomicInteger to prevent Problems when increasing.
	 */
	private final AtomicInteger counter = new AtomicInteger();

	/**
	 * Use the AtomicInteger to prevent Problems when increasing.
	 */
	private final AtomicInteger counterFired = new AtomicInteger();

	/**
	 * Use the ConcurrentLinkedQueue to prevent Thread problems when checking and storing
	 * checkedElements.
	 */
	private final Collection<String> elements = new ConcurrentLinkedQueue<>();

	/**
	 * Use the ConcurrentLinkedQueue to prevent Thread problems when checking and storing
	 * firedElements.
	 */
	private final Collection<String> firedElements = new ConcurrentLinkedQueue<>();

	/**
	 * The eventableConditionChecker where to load the EventableConditions from into the new
	 * Candidates.
	 */
	private final EventableConditionChecker eventableConditionChecker;

	/**
	 * The CrawlConditionChecker to use in the {@link #checkCrawlCondition(EmbeddedBrowser)}
	 * operation.
	 */
	private final ConditionTypeChecker<CrawlCondition> crawlConditionChecker;

	/**
	 * Used to lock the elements when adding multiple elements.
	 */
	private final Object elementsLock = new Object();

	/**
	 * Create a new CandidateElementManager.
	 *
	 * @param eventableConditionChecker the EventableConditionChecker to use
	 * @param crawlConditionChecker     the CrawlConditionChecker to use
	 */
	@Inject
	public CandidateElementManager(EventableConditionChecker eventableConditionChecker,
			ConditionTypeChecker<CrawlCondition> crawlConditionChecker) {
		this.eventableConditionChecker = eventableConditionChecker;
		this.crawlConditionChecker = crawlConditionChecker;
	}

	/**
	 * increase the number of checked elements, as a statistics measure to know how many elements
	 * were actually examined. Its thread safe by using the AtomicInteger
	 *
	 * @see java.util.concurrent.atomic.AtomicInteger
	 */
	@Override
	public void increaseElementsCounter() {
		counter.getAndIncrement();
	}

	/**
	 * increase the number of fired elements, as a statistics measure to know how many elements
	 * were actually examined. Its thread safe by using the AtomicInteger
	 *
	 * @see java.util.concurrent.atomic.AtomicInteger
	 */
	@Override
	public void increaseElementsFiredCounter() { counterFired.getAndIncrement(); }

	/**
	 * Check if a given element is already checked, preventing duplicate work. This is implemented
	 * in a ConcurrentLinkedQueue to support thread-safety
	 *
	 * @param element the to search for if its already checked
	 * @return true if the element is already checked
	 */
	@Override
	public boolean isChecked(String element) {
		return elements.contains(element);
	}

	/**
	 * Check if a given element is already fired, preventing duplicate work. This is implemented
	 * in a ConcurrentLinkedQueue to support thread-safety
	 *
	 * @param element the to search for if its already fired
	 * @param identification of the element to search
	 * @return true if the element is already fired
	 */
	@Override
	public boolean isFired(Element element, Identification identification) {
		return firedElements.contains(CandidateElement.getElementId(element, identification));
//		return firedElements.contains(candidateElement.getUniqueString());
	}

	/**
	 * Mark a given element as checked to prevent duplicate work. An element is only added when it
	 * is not already in the set of checked elements.
	 *
	 * @param element the element that is checked
	 * @return true if !contains(element.uniqueString)
	 */
	@GuardedBy("elementsLock")
	@Override
	public boolean markChecked(CandidateElement element) {
		String generalString = element.getGeneralString();
		String uniqueString = element.getUniqueString();
		synchronized (elementsLock) {
			if (elements.contains(uniqueString)) {
				return false;
			} else {
				elements.add(generalString);
				elements.add(uniqueString);
				return true;
			}
		}
	}

	/**
	 * Mark a given element as fired to prevent duplicate work. An element is only added when it
	 * is not already in the set of fired elements.
	 *
	 * @param element the element that is fired
	 * @return true if !contains(element.uniqueString)
	 */
	@GuardedBy("elementsLock")
	@Override
	public boolean markFired(CandidateElement element) {
		String id = CandidateElement.getElementId(element.getElement(),
				element.getIdentification());
		synchronized (elementsLock) {
			if (firedElements.contains(id)) {
				return false;
			} else {
				firedElements.add(id);
				return true;
			}
		}
	}

	/**
	 * Return internal counter for the examined elements.
	 *
	 * @return the number of ExaminedElements
	 */
	@Override
	public int numberOfExaminedElements() {
		return counter.get();
	}

	/**
	 * Return internal counter for the fired elements.
	 *
	 * @return the number of FiredElements
	 */
	@Override
	public int numberOfFiredElements() {
		return counterFired.get();
	}

	/**
	 * @return the eventableConditionChecker
	 */
	@Override
	public EventableConditionChecker getEventableConditionChecker() {
		return eventableConditionChecker;
	}

	/**
	 * Check if one or more CrawlConditions matches the current state in the browser.
	 *
	 * @param browser the browser to execute in the CrawlConditions.
	 * @return true if one or more CrawlConditions stratifies or non is specified.
	 */
	@Override
	public boolean checkCrawlCondition(EmbeddedBrowser browser) {
		return crawlConditionChecker.getFailedConditions(browser).isEmpty();
	}

}
