package com.dante.subjects.config;

import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.Form;
import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.core.state.Identification;
import com.crawljax.forms.FormInput;
import com.crawljax.stateabstractions.visual.imagehashes.DHashStateVertexFactory;
import com.crawljax.stateabstractions.visual.imagehashes.PerceptualImageHashStateVertexFactory;
import com.dante.subjects.ApplicationNames;
import com.dante.subjects.Config;
import com.dante.suitegenerator.SuiteGeneratorConfig;
import com.dante.tedd.extraction.DependencyGraphExtractionConfig;
import com.dante.utils.Properties;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DimeshiftConfig extends Config {

    private static final String url = "http://localhost:3000";
    private static final int waitTimeAfterReload = 2500;

    public DimeshiftConfig() {
        super(ApplicationNames.Name.DIMESHIFT.getName());
    }

    @Override
    public CrawljaxConfiguration.CrawljaxConfigurationBuilder getCrawljaxConfig() {

        CrawljaxConfiguration.CrawljaxConfigurationBuilder builder = this.crawljaxCommonConfig(url,
                Properties.MAX_RUNTIME, 1500, waitTimeAfterReload);

        builder.setConsiderCandidateElementsOnce(CrawljaxConfiguration.CandidateElementsMode.fired);

//        builder.setStateVertexFactory(new DHashStateVertexFactory());
        builder.setStateVertexFactory(new PerceptualImageHashStateVertexFactory());

        builder.crawlRules().click("button", "a");

        // input type submit
        builder.crawlRules().click("input")
                .withAttribute("type", "submit");
        // input type button
        builder.crawlRules().click("input")
                .withAttribute("type", "button");
        // transaction item
//        builder.crawlRules().click("div")
//                .withAttribute("class", "list-group-item item");
        // click only first transaction item
        builder.crawlRules().click("div")
                .underXPath("(/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1])[1]");


        // dimeshift link
        builder.crawlRules().dontClick("a")
                .underXPath("/html[1]/body[1]/footer[1]/div[1]/p[1]/a[1]".toUpperCase());
        // screenshots links
        builder.crawlRules().dontClick("A")
                .underXPath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/a[1]".toUpperCase());
        builder.crawlRules().dontClick("A")
                .underXPath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/a[1]".toUpperCase());
        builder.crawlRules().dontClick("A")
                .underXPath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/a[1]".toUpperCase());
        builder.crawlRules().dontClick("A")
                .underXPath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[4]/a[1]".toUpperCase());
        // demo button
        builder.crawlRules().dontClick("input")
                .underXPath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/p[1]/input[1]".toUpperCase());
        // github
        builder.crawlRules().dontClick("a")
                .underXPath("/html[1]/body[1]/footer[1]/div[1]/div[1]/a[1]".toUpperCase());
        // contact
        builder.crawlRules().dontClick("a")
                .underXPath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]".toUpperCase());
        // api
        builder.crawlRules().dontClick("a")
                .underXPath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[5]/a[1]".toUpperCase());
        // change language
        builder.crawlRules().dontClick("a")
                .underXPath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[10]/a[1]".toUpperCase());
        // settings after login
        builder.crawlRules().dontClick("a")
                .underXPath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]".toUpperCase());
        // import button (with class, I hope it does not impact any other element)
        builder.crawlRules().dontClick("a")
                .withAttribute("class", "btn btn-default btn-xs");
        // logout button
        builder.crawlRules().dontClick("a")
                .underXPath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/a[1]".toUpperCase());
//                .underXPath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/h3[1]/span[2]/a[1]".toUpperCase());
//        // register on sign in modal
//        builder.crawlRules().dontClick("a")
//                .underXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[3]/a[1]");
//        // register on menu
//        builder.crawlRules().dontClick("a")
//                .underXPath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/a[1]");
//        // register on restore password modal
//        builder.crawlRules().dontClick("a")
//                .underXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/a[1]");



        InputSpecification inputSpecification = new InputSpecification();


        Form signInForm = new Form();
        FormInput usernameSignInInput = signInForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "input_username"));
        usernameSignInInput.inputValues("asd@asd.com","foo@bar.com");
//        usernameSignInInput.inputValues("asd@asd.com");
        FormInput passwordSignInInput = signInForm.inputField(FormInput.InputType.PASSWORD,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[2]/input[1]".toUpperCase()));
        passwordSignInInput.inputValues("adminadmin","foobar123");
//        passwordSignInInput.inputValues("adminadmin");
        inputSpecification.setValuesInForm(signInForm).beforeClickElement("input")
                .withAttribute("id", "signin_modal_form_submit");

        Form signUpForm = new Form();
        FormInput usernameSignUpInput = signUpForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "input_login"));
        usernameSignUpInput.inputValues("foo@bar.com");
        FormInput emailSignUpInput = signUpForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "input_email"));
        emailSignUpInput.inputValues("foo@bar.com");
        FormInput passwordSignUpInput = signUpForm.inputField(FormInput.InputType.PASSWORD,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/input[1]".toUpperCase()));
        passwordSignUpInput.inputValues("foobar123");
        inputSpecification.setValuesInForm(signUpForm).beforeClickElement("input")
                .withAttribute("id", "registration_modal_form_submit");

        Form addAccessForm = new Form();
        FormInput emailAccessInput = addAccessForm.inputField(FormInput.InputType.EMAIL,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/input[1]".toUpperCase()));
        emailAccessInput.inputValues("asd@asd.com");
        inputSpecification.setValuesInForm(addAccessForm).beforeClickElement("input")
                .withAttribute("value", "Give Access");

        Form addEditWalletForm = new Form();
        FormInput walletNameInput = addEditWalletForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/input[1]".toUpperCase()));
        walletNameInput.inputValues("Personal","Yours","Mine","Others","Lucky you");
        FormInput currencyInput = addEditWalletForm.inputField(FormInput.InputType.SELECT,
                new Identification(Identification.How.id, "input_currency"));
        currencyInput.inputValues("United States Dollar");
        inputSpecification.setValuesInForm(addEditWalletForm).beforeClickElement("input")
                .withAttribute("value", "Save");

        Form setTotalForm = new Form();
        FormInput setTotalInput = setTotalForm.inputField(FormInput.InputType.NUMBER,
                new Identification(Identification.How.id, "input_total"));
        setTotalInput.inputValues("1000","100","10","500","5000");
        inputSpecification.setValuesInForm(setTotalForm).beforeClickElement("input")
                .withAttribute("value", "Set");

        Form addIncomeForm = new Form();
        FormInput amountInput = addIncomeForm.inputField(FormInput.InputType.NUMBER,
                new Identification(Identification.How.id, "input_amount"));
        amountInput.inputValues("1000","100","10","500","5000");
        FormInput descriptionInput = addIncomeForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "input_description"));
        descriptionInput.inputValues("description","income description");
        inputSpecification.setValuesInForm(addIncomeForm).beforeClickElement("input")
                .withAttribute("value", "Add");

        Form planForm = new Form();
        FormInput planNameInput = planForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]".toUpperCase()));
        planNameInput.inputValues("plan name", "great plan", "ooooohhh");
        inputSpecification.setValuesInForm(planForm).beforeClickElement("button")
                .withAttribute("id", "button_step1_next");

        Form secondStepPlanForm = new Form();
        FormInput balanceInput = secondStepPlanForm.inputField(FormInput.InputType.NUMBER,
                new Identification(Identification.How.id, "input_goal_balance"));
        balanceInput.inputValues("100");
        FormInput startCurrencyInput = secondStepPlanForm.inputField(FormInput.InputType.SELECT,
                new Identification(Identification.How.id, "input_start_currency"));
        startCurrencyInput.inputValues("United States Dollar");
        FormInput endCurrencyInput = secondStepPlanForm.inputField(FormInput.InputType.SELECT,
                new Identification(Identification.How.id, "input_goal_currency"));
        endCurrencyInput.inputValues("United States Dollar");
        inputSpecification.setValuesInForm(secondStepPlanForm).beforeClickElement("button")
                .withAttribute("id", "button_step2_save");

        Identification addTransactionText =
                new Identification(Identification.How.id, "add_transaction_text");
        Identification addTransactionAmount =
                new Identification(Identification.How.id, "add_transaction_amount");
        Set<Identification> inputFieldIdsWithEnterClick = new HashSet<>();
        inputFieldIdsWithEnterClick.add(addTransactionText);
        inputFieldIdsWithEnterClick.add(addTransactionAmount);
        builder.crawlRules().setInputFieldIdsWithEnterClick(inputFieldIdsWithEnterClick);

        inputSpecification.inputField(new FormInput(FormInput.InputType.TEXT,
                addTransactionText, "transaction"));
        inputSpecification.inputField(new FormInput(FormInput.InputType.NUMBER,
                addTransactionAmount, "20"));

        builder.crawlRules().setInputSpec(inputSpecification);

        builder.crawlRules().setDisableIdAndNameIdentification(true);
        builder.setHandleSameFormInputsOncePerState(true);

        return builder;

    }

    @Override
    public SuiteGeneratorConfig getSuiteGeneratorConfig() {

        SuiteGeneratorConfig suiteGeneratorConfig = this.testSuiteGeneratorCommonConfig(url, waitTimeAfterReload);
        List<String> scriptNamesToExclude = new ArrayList<>();
        scriptNamesToExclude.add("jsmart");
        scriptNamesToExclude.add("backbone");
        scriptNamesToExclude.add("js");
        scriptNamesToExclude.add("bootstrap.clickonmouseover");
        scriptNamesToExclude.add("i18n");
        scriptNamesToExclude.add("underscore-min");
        scriptNamesToExclude.add("bootstrap-tour");
        scriptNamesToExclude.add("button");
        scriptNamesToExclude.add("collapse");
        scriptNamesToExclude.add("dropdown");
        scriptNamesToExclude.add("modal");
        scriptNamesToExclude.add("popover");
        scriptNamesToExclude.add("tooltip");
        scriptNamesToExclude.add("analytics");
        suiteGeneratorConfig.setScriptNamesToExclude(scriptNamesToExclude);
        suiteGeneratorConfig.setFiredElementStrategy(true);

        return suiteGeneratorConfig;
    }

    @Override
    public DependencyGraphExtractionConfig getDependencyGraphExtractionConfig() {
        String dependencyGraphOptimized = "0 00 000 0000 01000 010010 0001000 10000001 101000011 1001001000 00010000000 010010010000 1110000100000 00110000000100 010010000001000 0001000010010000 01010001000000000 000000110000000000 0000110000000000000 01000000000100000000 010000010000010000000 1001000010000000000000 00000000000000000000000 000000010000100101000000 0000010100000000000100000 10000000000011000100000000 000000010000000000000000000 1011100100000001000000000000 00110000010100000000101000000 110100000001000000000001000100 1000001100100001010100000000000 00011010000000000000010000010000 001010010000010001000000000000000 0011110001010110010101010000000110 00001010110100000000010000010000000 000010000000100000000000000010001000 1001011000010001000000000001000000000 01000101010010010100000001000000000000 000110000100100000011000000100000000010 1101010001110011000011000000000001000000 00000010100000001000000010101010000000000 110100101000001010010100000110000101000000 0000000101001010100010000000000000000101000 00101000000001110000100010000000100000000000 011100000000000110010010000000000000001000000 0100010101111000000100000000001000010011000000 00000000001001000110000000000100000000000000000 100000110010010101000101000010100000100000000000 0101101010001001000011010000010101000001000000000 10000000010000000000000000010000000100000000000000 110110010000100000100000000001000000000000000000000 0101000000011000000001000011100000000000000000000010 10100011110000010000000101000000000001000000000000000 001100001001000010111001000001000000000000000000000000 0000000011001000000100101000000000010000000000000000000";

        DependencyGraphExtractionConfig dependencyGraphExtractionConfig = new DependencyGraphExtractionConfig();
        dependencyGraphExtractionConfig.setParetoFrontSolution(dependencyGraphOptimized);
        // window strategy
//        dependencyGraphExtractionConfig.setFixedMinimizedTestSuite("10100011111111011000000000000000000000000000000000000000");
        // one by one strategy
        dependencyGraphExtractionConfig.setFixedMinimizedTestSuite("11111111111111011000000000000000000000000000000000000000");

        return dependencyGraphExtractionConfig;
    }
}
