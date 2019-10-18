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

public class PetclinicConfig extends Config {

    private static final String url = "http://localhost:3000";
    private static final int waitTimeAfterReload = 3000;

    public PetclinicConfig() {
        super(ApplicationNames.Name.PETCLINIC.getName());
    }

    @Override
    public CrawljaxConfiguration.CrawljaxConfigurationBuilder getCrawljaxConfig() {

        CrawljaxConfiguration.CrawljaxConfigurationBuilder builder = this.crawljaxCommonConfig(url,
                Properties.MAX_RUNTIME, 1000, waitTimeAfterReload);

        builder.setConsiderCandidateElementsOnce(CrawljaxConfiguration.CandidateElementsMode.fired);

        builder.crawlRules().click("BUTTON");
        builder.crawlRules().click("A");

        // calendar button
        builder.crawlRules().dontClick("button")
                .withAttribute("class", "mat-icon-button");
//        builder.crawlRules().dontClick("BUTTON")
//                .underXPath("/html[1]/body[1]/app-root[1]/app-visit-add[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/mat-datepicker-toggle[1]/button[1]");
        // home button that slows down the execution
        builder.crawlRules().dontClick("A")
                .underXPath("/html[1]/body[1]/app-root[1]/div[1]/nav[1]/div[1]/div[1]/a[1]");

        InputSpecification inputSpecification = new InputSpecification();

        Form newOwnerForm = new Form();
        FormInput firstNameInput = newOwnerForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-owner-add[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]".toUpperCase()));
        firstNameInput.inputValues("George","Betty","Eduardo","Harold","Peter","Jean","Jeff","Maria","David","Carlos");
        FormInput lastNameInput = newOwnerForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-owner-add[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]".toUpperCase()));
        lastNameInput.inputValues("Franklin","Davis","Rodriquez","Davis","McTavish","Coleman","Black","Escobito","Schroeder","Estaban");
        FormInput addressInput = newOwnerForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "address"));
        addressInput.inputValues("110 W. Liberty St.","638 Cardinal Ave.","2693 Commerce St.","563 Friendly St.","2387 S. Fair Way","105 N. Lake St.","1450 Oak Blvd.","345 Maple St.","2749 Blackhawk Trail","2335 Independence La.");
        FormInput cityInput = newOwnerForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "city"));
        cityInput.inputValues("Madison","Sun Prairie","McFarland","Windsor","Monona","Waunakee");
        FormInput telephoneInput = newOwnerForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "telephone"));
        telephoneInput.inputValues("6085551023","6085551749","6085558763","6085553198","6085552765","6085552654","6085555387","6085557683","6085559435","6085555487");
        inputSpecification.setValuesInForm(newOwnerForm).beforeClickElement("button")
                .withText("Add Owner");

        Form editOwnerForm = new Form();
        firstNameInput = editOwnerForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-owner-edit[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]".toUpperCase()));
        firstNameInput.inputValues("George","Betty","Eduardo","Harold","Peter","Jean","Jeff","Maria","David","Carlos");
        lastNameInput = editOwnerForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-owner-edit[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]".toUpperCase()));
        lastNameInput.inputValues("Franklin","Davis","Rodriquez","Davis","McTavish","Coleman","Black","Escobito","Schroeder","Estaban");
        addressInput = editOwnerForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "address"));
        addressInput.inputValues("110 W. Liberty St.","638 Cardinal Ave.","2693 Commerce St.","563 Friendly St.","2387 S. Fair Way","105 N. Lake St.","1450 Oak Blvd.","345 Maple St.","2749 Blackhawk Trail","2335 Independence La.");
        cityInput = editOwnerForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "city"));
        cityInput.inputValues("Madison","Sun Prairie","McFarland","Windsor","Monona","Waunakee");
        telephoneInput = editOwnerForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "telephone"));
        telephoneInput.inputValues("6085551023","6085551749","6085558763","6085553198","6085552765","6085552654","6085555387","6085557683","6085559435","6085555487");
        inputSpecification.setValuesInForm(editOwnerForm).beforeClickElement("button")
                .withText("Update Owner");

        Form addPetTypeForm = new Form();
        FormInput petTypeNameInput = addPetTypeForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-pettype-list[1]/div[1]/div[1]/div[1]/app-pettype-add[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]".toUpperCase()));
        petTypeNameInput.inputValues("cat","dog","lizard","hamster","snake","bird");
        inputSpecification.setValuesInForm(addPetTypeForm).beforeClickElement("button")
                .withText("Save");

        Form editPetTypeForm = new Form();
        petTypeNameInput = editPetTypeForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-pettype-edit[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]".toUpperCase()));
        petTypeNameInput.inputValues("cat","dog","lizard","hamster","snake","bird");
        inputSpecification.setValuesInForm(editPetTypeForm).beforeClickElement("button")
                .withText("Update");

        Form addPetForm = new Form();
        FormInput petNameInput = addPetForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-pet-add[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]".toUpperCase()));
        petNameInput.inputValues("Leo","Basil","Rosy","Jewel","Iggy","George","Samantha","Max","Lucky","Mulligan","Freddy","Sly");
        FormInput petDateInput = addPetForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.name, "birthDate"));
        petDateInput.inputValues("2000-09-07","2002-08-06","2001-04-17","2000-03-07","2000-11-30","2000-01-20","1995-09-04","1995-09-04","1999-08-06","1997-02-24","2000-03-09","2000-06-24","2002-06-08");
        FormInput petTypeSelect = addPetForm.inputField(FormInput.InputType.SELECT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-pet-add[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/select[1]".toUpperCase()));
        petTypeSelect.inputValues("cat ","dog ","lizard ","hamster ","snake ","bird ");
        inputSpecification.setValuesInForm(addPetForm).beforeClickElement("button")
                .withText("Save Pet");

        Form editPetForm = new Form();
        petNameInput = editPetForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-pet-edit[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]".toUpperCase()));
        petNameInput.inputValues("Leo","Basil","Rosy","Jewel","Iggy","George","Samantha","Max","Lucky","Mulligan","Freddy","Sly");
        petDateInput = editPetForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.name, "birthDate"));
        petDateInput.inputValues("2000-09-07","2002-08-06","2001-04-17","2000-03-07","2000-11-30","2000-01-20","1995-09-04","1995-09-04","1999-08-06","1997-02-24","2000-03-09","2000-06-24","2002-06-08");
        petTypeSelect = editPetForm.inputField(FormInput.InputType.SELECT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-pet-edit[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[2]/select[1]".toUpperCase()));
        petTypeSelect.inputValues("cat ","dog ","lizard ","hamster ","snake ","bird ");
        inputSpecification.setValuesInForm(editPetForm).beforeClickElement("button")
                .withText("Update Pet");

        Form addVisitPetForm = new Form();
        FormInput visitDateInput = addVisitPetForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-visit-add[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]".toUpperCase()));
        visitDateInput.inputValues("2010-03-04","2011-03-04","2009-06-04","2008-09-04");
        FormInput visitDescriptionInput = addVisitPetForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "description"));
        visitDescriptionInput.inputValues("rabies shot","neutered","spayed");
        inputSpecification.setValuesInForm(addVisitPetForm).beforeClickElement("button")
                .withText("Add Visit");

        Form editVisitPetForm = new Form();
        visitDateInput = editVisitPetForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-visit-edit[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]".toUpperCase()));
        visitDateInput.inputValues("2010-03-04","2011-03-04","2009-06-04","2008-09-04");
        visitDescriptionInput = editVisitPetForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "description"));
        visitDescriptionInput.inputValues("rabies shot","neutered","spayed");
        inputSpecification.setValuesInForm(editVisitPetForm).beforeClickElement("button")
                .withText("Update Visit");

        Form addSpecialityForm = new Form();
        FormInput specialityNameInput = addSpecialityForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-specialty-list[1]/div[1]/div[1]/div[1]/app-specialty-add[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]".toUpperCase()));
        specialityNameInput.inputValues("dentistry","radiology","surgery");
        inputSpecification.setValuesInForm(addSpecialityForm).beforeClickElement("button")
                .withText("Save");

        Form editSpecialityForm = new Form();
        specialityNameInput = editSpecialityForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-specialty-edit[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]".toUpperCase()));
        specialityNameInput.inputValues("dentistry","radiology","surgery");
        inputSpecification.setValuesInForm(editSpecialityForm).beforeClickElement("button")
                .withText("Update");

        Form addVetForm = new Form();
        FormInput firstNameVetInput = addVetForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-vet-add[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]".toUpperCase()));
        firstNameVetInput.inputValues("James","Helen","Linda","Rafael","Henry","Sharon");
        FormInput lastNameVetInput = addVetForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-vet-add[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]".toUpperCase()));
        lastNameVetInput.inputValues("Carter","Leary","Douglas","Ortega","Stevens","Jenkins");
        FormInput vetSpecialityInput = addVetForm.inputField(FormInput.InputType.SELECT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-vet-add[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/select[1]".toUpperCase()));
        vetSpecialityInput.inputValues("dentistry","radiology","surgery");
        inputSpecification.setValuesInForm(addVetForm).beforeClickElement("button")
                .withText("Save Vet");

        Form editVetForm = new Form();
        firstNameVetInput = editVetForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-vet-edit[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]".toUpperCase()));
        firstNameVetInput.inputValues("James","Helen","Linda","Rafael","Henry","Sharon");
        lastNameVetInput = editVetForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/app-root[1]/app-vet-edit[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]".toUpperCase()));
        lastNameVetInput.inputValues("Carter","Leary","Douglas","Ortega","Stevens","Jenkins");
        inputSpecification.setValuesInForm(editVetForm).beforeClickElement("button")
                .withText("Update Vet");

        builder.crawlRules().setInputSpec(inputSpecification);

        return builder;

    }

    @Override
    public SuiteGeneratorConfig getSuiteGeneratorConfig() {

        SuiteGeneratorConfig suiteGeneratorConfig = this.testSuiteGeneratorCommonConfig(url, waitTimeAfterReload);

        suiteGeneratorConfig.setSourcemapURL("http://localhost:3000/main.js.map");
        suiteGeneratorConfig.setSrcCodeFolder("src");
        suiteGeneratorConfig.setScriptNameToInclude("main");
        suiteGeneratorConfig.setFiredElementStrategy(true);

        return suiteGeneratorConfig;
    }

    @Override
    public DependencyGraphExtractionConfig getDependencyGraphExtractionConfig() {
        String dependencyGraphOptimized = "1 00 110 0100 10000 000001 0001000 11010000 100101000 0011000000 00000000000 010001000010 0000000000000 00000100000000 101000011010010 0100011001000000 00110000000000000 110001101000110000 0110010001100000000 10010000110000001000 001001000110000000000 0001100000000110000000 00000000011000000000000 101010001001000000000000 1100101011000000000000000 00101110000000100001000000 100100011111000000000000000 0101101100000100000000000000 00000111101011010000000000000 101000000010110000000001000000 0000000001011100000000010000000 01000011000101000000000100000000 000000000011000000000000000000000 1100110110100000110000000000000000 01101010000100100000000000000010000 100010001011000001000001100000001000 0100000010000010010000000000000000000 00000010000101000001100000000000000000 111101100110001000100010110000000000000 0111101001000100011000000000001000000000 10001000010100101000010000000000000000000 001000000000001100001001000000000000000000 0100011010011000010001001000000100000000000 00011000101100010000001010101100000000000000 110010000010111101000000000000010000000000000 1110110010001001000100001100000001000100010000 00001001111011001000110001000010010000100101000 000011100001100000000000000000000000000000000000 0010100101001010000000010000101000000000000000000 11001100000000001000001011110010100000010000000011 011000001000100010000000000100010000000000000000000 1110000001000000001000010001000001000000000000000000 10000000001100000100010000000000000000010000000001000 001001000010011011110100001100010000000000100000000001 0000011010001100001000010010010000001000000000001100010 01101000000000010100000100010000000001000001000001000000 001101100000011010010000010000011110100000010000000000000 1010010000110111000010000000010000000000100000000000000000 10100100110010111101000100101110000100100000000000000000000 011000110000101110000000001010101001001000100010000000000001 0110100000000010010000000100011001000000000001100001000000000 00000110010100000011000011111100000000000010000000010000000000 000000000100101000010000011000000000000000000000000000000000000 0110011110000011000010001000101010101000000001101000000001000000";

        DependencyGraphExtractionConfig dependencyGraphExtractionConfig = new DependencyGraphExtractionConfig();
        dependencyGraphExtractionConfig.setParetoFrontSolution(dependencyGraphOptimized);
        // window strategy
//        dependencyGraphExtractionConfig.setFixedMinimizedTestSuite("00100001100000000000000100000000001110001010100000001000000000000");
        // one by one strategy
        dependencyGraphExtractionConfig.setFixedSelectedTestSuite("11111111111111111111111111111111111110001010100000001000000000000");

        return dependencyGraphExtractionConfig;
    }
}
