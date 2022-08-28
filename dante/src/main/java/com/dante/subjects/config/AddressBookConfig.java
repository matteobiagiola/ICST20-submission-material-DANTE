package com.dante.subjects.config;

import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.Form;
import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.core.state.Identification;
import com.crawljax.forms.FormInput;
import com.dante.subjects.ApplicationNames;
import com.dante.subjects.Config;
import com.dante.suitegenerator.SuiteGeneratorConfig;
import com.dante.tedd.extraction.DependencyGraphExtractionConfig;
import com.dante.utils.Properties;


public class AddressBookConfig extends Config {

    private static final String url = "http://localhost/addressbook-mod/addressbook/";
    private static final int waitTimeAfterReload = 3000;

    public AddressBookConfig() {
        super(ApplicationNames.Name.ADDRESSBOOK.getName());
    }

    @Override
    public CrawljaxConfiguration.CrawljaxConfigurationBuilder getCrawljaxConfig() {

        CrawljaxConfiguration.CrawljaxConfigurationBuilder builder = this.crawljaxCommonConfig(url,
                Properties.MAX_RUNTIME, 2000, waitTimeAfterReload);

        builder.crawlRules().clickDefaultElements();

        // Exchange suppport links in the index page
        builder.crawlRules().dontClick("a").withText("Exchange suppport");

        // send e-Mail button
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "Send e-Mail");
        // php-addressbook page on sourceforge.net
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "http://sourceforge.net/projects/php-addressbook/");
        // donations pages
        builder.crawlRules().dontClick("a")
                .withText("v8.2.5");

        InputSpecification inputSpecification = new InputSpecification();

        Form loginForm = new Form();
        FormInput usernameInput = loginForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.name, "user"));
        usernameInput.inputValues("admin");
        FormInput passwordInput = loginForm.inputField(FormInput.InputType.PASSWORD,
                new Identification(Identification.How.name, "pass"));
        passwordInput.inputValues("admin");
        inputSpecification.setValuesInForm(loginForm).beforeClickElement("input").withText("Login");

        Form newEntryForm = new Form();

        FormInput username = newEntryForm.inputField(FormInput.InputType.TEXT, new Identification(Identification.How.name, "firstname"));
        username.inputValues("John");

        FormInput password = newEntryForm.inputField(FormInput.InputType.TEXT, new Identification(Identification.How.name, "lastname"));
        password.inputValues("Doe");

        FormInput address = newEntryForm.inputField(FormInput.InputType.TEXTAREA, new Identification(Identification.How.name, "address"));
        address.inputValues("1165 The Castings");

        FormInput email = newEntryForm.inputField(FormInput.InputType.TEXT, new Identification(Identification.How.name, "email"));
        email.inputValues("jdoe@example.com");

        FormInput bday = newEntryForm.inputField(FormInput.InputType.SELECT, new Identification(Identification.How.name, "bday"));
        bday.inputValues("18");

        FormInput bmonth = newEntryForm.inputField(FormInput.InputType.SELECT, new Identification(Identification.How.name, "bmonth"));
        bmonth.inputValues("August");

        FormInput byear = newEntryForm.inputField(FormInput.InputType.TEXT, new Identification(Identification.How.name, "byear"));
        byear.inputValues("August");

        inputSpecification.setValuesInForm(newEntryForm).beforeClickElement("input").withAttribute("value", "Enter");

        Form newUserForm = new Form();

        FormInput usernameNewUserForm = newUserForm.inputField(FormInput.InputType.TEXT, new Identification(Identification.How.name, "email"));
        usernameNewUserForm.inputValues("jdoe@example.com");

        FormInput passwordNewUserForm = newUserForm.inputField(FormInput.InputType.TEXT, new Identification(Identification.How.name, "password"));
        passwordNewUserForm.inputValues("123456");

        inputSpecification.setValuesInForm(newUserForm).beforeClickElement("input").withAttribute("value", "Sign-Up");


        builder.crawlRules().setInputSpec(inputSpecification);
        builder.crawlRules().setDisableIdAndNameIdentification(true);
        builder.setHandleSameFormInputsOncePerState(true);

        return builder;

    }

    @Override
    public SuiteGeneratorConfig getSuiteGeneratorConfig() {
        return this.testSuiteGeneratorCommonConfig(url, waitTimeAfterReload);
    }

    @Override
    public DependencyGraphExtractionConfig getDependencyGraphExtractionConfig() {
        throw new UnsupportedOperationException("Not supported yet");
    }
}
