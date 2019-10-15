package com.dante.subjects.config;

import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.Form;
import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.core.state.Identification;
import com.crawljax.forms.FormInput;
import com.crawljax.stateabstractions.visual.imagehashes.PerceptualImageHashStateVertexFactory;
import com.dante.subjects.ApplicationNames;
import com.dante.subjects.Config;
import com.dante.suitegenerator.SuiteGeneratorConfig;
import com.dante.tedd.extraction.DependencyGraphExtractionConfig;
import com.dante.utils.Properties;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// FIXME
// does not work
public class PagekitConfig extends Config {

    private static final String url = "http://localhost:3000/pagekit/index.php/admin/login";
    private static final int waitTimeAfterReload = 3000;

    public PagekitConfig() {
        super(ApplicationNames.Name.PAGEKIT.getName());
    }

    @Override
    public CrawljaxConfiguration.CrawljaxConfigurationBuilder getCrawljaxConfig() {

        CrawljaxConfiguration.CrawljaxConfigurationBuilder builder = this.crawljaxCommonConfig(url,
                Properties.MAX_RUNTIME, 2000, waitTimeAfterReload);

//        builder.setStateVertexFactory(new PerceptualImageHashStateVertexFactory());

        builder.crawlRules().click("button", "a");

        // input type submit
        builder.crawlRules().click("input")
                .withAttribute("type", "submit");
        // input type button
        builder.crawlRules().click("input")
                .withAttribute("type", "button");
        // menu
        builder.crawlRules().click("i")
                .withAttribute("class","tm-icon-menu");


        // request password link
        builder.crawlRules().dontClick("a")
                .underXPath("/html[1]/body[1]/div[1]/div[1]/form[1]/ul[1]/li[2]/a[1]");
        // remember me checkbox
        builder.crawlRules().dontClick("input")
                .withAttribute("name", "remember_me");
        // update now
        builder.crawlRules().dontClick("a")
                .withText("Update now!");
        // help
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "https://gitter.im/pagekit/pagekit");
        // logout
        builder.crawlRules().dontClick("a")
                .withAttribute("title", "Logout");
        // house link
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "/pagekit/index.php/");
        // system link in menu
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "/pagekit/index.php/admin/system/settings");
        // marketplace link in menu
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "/pagekit/index.php/admin/system/marketplace/extensions");
        // drag handle
        builder.crawlRules().dontClick("a")
                .withAttribute("class", "pk-icon-handle pk-icon-hover uk-sortable-handle");
        // change password
        builder.crawlRules().dontClick("a")
                .withText("Change password");
        // email 1
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "mailto:asd@asd.com");
        // email 2
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "mailto:foo@bar.com");
        // email 3
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "mailto:admin@admin.com");
        // roles links
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "system: manage packages");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "system: software updates");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "system: manage widgets");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "system: manage storage");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "system: manage storage read only");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "system: access settings");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "site: manage site");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "site: maintenance access");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "user: manage users");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "user: manage user permissions");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "system: access admin area");
        // upload
        builder.crawlRules().dontClick("button")
                .withText("Upload");
        // url links
        builder.crawlRules().dontClick("a")
                .withAttribute("target", "_blank");
        // settings in site
        builder.crawlRules().dontClick("a")
                .withAttribute("href","/pagekit/index.php/admin/site/settings");


        InputSpecification inputSpecification = new InputSpecification();

        Form loginForm = new Form();
        FormInput usernameInput = loginForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.name, "credentials[username]"));
        usernameInput.inputValues("admin");
        FormInput passwordInput = loginForm.inputField(FormInput.InputType.PASSWORD,
                new Identification(Identification.How.name, "credentials[password]"));
        passwordInput.inputValues("asdfghjkl123");
        inputSpecification.setValuesInForm(loginForm).beforeClickElement("button").withText("Login");

        Form editUserForm = new Form();
        FormInput usernameEditForm = editUserForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "form-username"));
        usernameEditForm.inputValues("foo","admin","asd");
        FormInput nameEditForm = editUserForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]".toUpperCase()));
        nameEditForm.inputValues("foo","admin","asd");
        FormInput emailEditForm = editUserForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "form-email"));
        emailEditForm.inputValues("foo@bar.com","admin@admin.com","asd@asd.com");
        inputSpecification.setValuesInForm(editUserForm).beforeClickElement("button").withText("Save");

        FormInput searchUserInput = new FormInput(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]".toUpperCase()));
        searchUserInput.inputValues("foo","admin","asd");
        inputSpecification.inputField(searchUserInput);

        Form addUserForm = new Form();
        FormInput usernameAddInput = addUserForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "form-username"));
        usernameAddInput.inputValues("foo","admin","asd");
        FormInput nameAddInput = addUserForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]".toUpperCase()));
        nameAddInput.inputValues("foo","admin","asd");
        FormInput emailAddInput = addUserForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "form-email"));
        emailAddInput.inputValues("foo@bar.com","admin@admin.com","asd@asd.com");
        FormInput passwordAddInput = addUserForm.inputField(FormInput.InputType.PASSWORD,
                new Identification(Identification.How.id, "form-password"));
        passwordAddInput.inputValues("foobar123","asdfghjkl123","adminadmin");
        inputSpecification.setValuesInForm(addUserForm).beforeClickElement("button").withText("Save");

        Form addEditRoleMenuForm = new Form();
        FormInput roleNameInput = addEditRoleMenuForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath, "/html[1]/body[1]/div[4]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]".toUpperCase()));
        roleNameInput.inputValues("role","new role","system admin","it","another menu","new menu","main already exists");
        inputSpecification.setValuesInForm(addEditRoleMenuForm).beforeClickElement("button").withText("Save");

        FormInput searchFileInput = new FormInput(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]".toUpperCase()));
        searchFileInput.inputValues("pagekit-logo-contrast","pagekit-logo","asd");
        inputSpecification.inputField(searchFileInput);

        Form renameImageForm = new Form();
        FormInput nameImageInput = new FormInput(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/div[7]/div[1]/div[1]/div[3]/p[1]/input[1]".toUpperCase()));
        nameImageInput.inputValues("pagekit-logo-contrast.svg","pagekit-logo.svg","asd.svg");
        inputSpecification.setValuesInForm(renameImageForm).beforeClickElement("button").withText("Ok");

        FormInput loginRedirectInput = new FormInput(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "form-redirect"));
        loginRedirectInput.inputValues("@page/1","@user/logout","@user/registration","@user/resetpassword","@user/profile");
        inputSpecification.inputField(loginRedirectInput);

        Form addEditLinkForm = new Form();
        FormInput urlLinkInput = addEditLinkForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "form-url"));
        urlLinkInput.inputValues("@page/1","@user/logout","@user/registration","@user/resetpassword","@user/profile");
        FormInput menuTitleInput = addEditLinkForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "form-menu-title"));
        menuTitleInput.inputValues("link","just a link","new link");
        inputSpecification.setValuesInForm(addEditLinkForm).beforeClickElement("button").withText("Save");

        Form addEditPageForm = new Form();
        FormInput pageTitleInput = addEditPageForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.name, "page[title]"));
        pageTitleInput.inputValues("page","just a page","new page");
        FormInput pageMenuTitleInput = addEditPageForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/main[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]".toUpperCase()));
        pageMenuTitleInput.inputValues("page","just a page","new page");
        inputSpecification.setValuesInForm(addEditPageForm).beforeClickElement("button").withText("Save");

        FormInput searchWidgetInput = new FormInput(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]".toUpperCase()));
        searchWidgetInput.inputValues("Hello, I'm Pagekit","Powered by Pagekit","widget");
        inputSpecification.inputField(searchWidgetInput);

        Form addEditWidgetTextForm = new Form();
        FormInput widgetTextTitleInput = addEditWidgetTextForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/main[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]".toUpperCase()));
        widgetTextTitleInput.inputValues("widget text","new widget text");
        inputSpecification.setValuesInForm(addEditWidgetTextForm).beforeClickElement("button").withText("Save");

        Form addEditWidgetMenuForm = new Form();
        FormInput widgetMenuTitleInput = addEditWidgetMenuForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/main[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]".toUpperCase()));
        widgetMenuTitleInput.inputValues("widget menu","new widget menu");
        inputSpecification.setValuesInForm(addEditWidgetMenuForm).beforeClickElement("button").withText("Save");

        Form addEditWidgetLoginForm = new Form();
        FormInput widgetLoginTitleInput = addEditWidgetLoginForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/main[1]/form[1]/div[2]/div[1]/component[1]/div[1]/div[1]/div[1]/div[1]/input[1]".toUpperCase()));
        widgetLoginTitleInput.inputValues("widget login","new widget login");
        FormInput widgetLoginRedirectInput = addEditWidgetLoginForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/main[1]/form[1]/div[2]/div[1]/component[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]".toUpperCase()));
        widgetLoginRedirectInput.inputValues("@page/1","@user/logout","@user/registration","@user/resetpassword","@user/profile");
        FormInput widgetLogoutRedirectInput = addEditWidgetLoginForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/main[1]/form[1]/div[2]/div[1]/component[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]".toUpperCase()));
        widgetLogoutRedirectInput.inputValues("@page/1","@user/logout","@user/registration","@user/resetpassword","@user/profile");
        inputSpecification.setValuesInForm(addEditWidgetLoginForm).beforeClickElement("button").withText("Save");

        FormInput searchFileSiteInput = new FormInput(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]".toUpperCase()));
        searchFileSiteInput.inputValues("pagekit-logo-contrast","pagekit-logo","asd");
        inputSpecification.inputField(searchFileSiteInput);

        Form folderNameForm = new Form();
        FormInput folderNameInput = folderNameForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/p[1]/input[1]".toUpperCase()));
        folderNameInput.inputValues("folder","new folder");
        inputSpecification.setValuesInForm(folderNameForm).beforeClickElement("button").withText("Ok");

        Form folderNameModalForm = new Form();
        FormInput folderNameModalInput = folderNameModalForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/div[10]/div[1]/div[1]/div[2]/p[1]/input[1]".toUpperCase()));
        folderNameModalInput.inputValues("folder modal","new folder modal");
        inputSpecification.setValuesInForm(folderNameModalForm).beforeClickElement("button").withText("Ok");

        builder.crawlRules().setInputSpec(inputSpecification);
        builder.crawlRules().setDisableIdAndNameIdentification(true);
        builder.setHandleSameFormInputsOncePerState(true);

        return builder;

    }

    @Override
    public SuiteGeneratorConfig getSuiteGeneratorConfig() {

        // TODO

        return this.testSuiteGeneratorCommonConfig(url, waitTimeAfterReload);
    }

    @Override
    public DependencyGraphExtractionConfig getDependencyGraphExtractionConfig() {
        throw new UnsupportedOperationException("Not supported yet");
    }
}
