package com.crawljax.examples.addressbook;

import com.crawljax.core.configuration.Form;
import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.core.state.Identification;
import com.crawljax.core.state.Identification.How;
import com.crawljax.forms.FormInput;
import com.crawljax.forms.FormInput.InputType;

public class AddressbookForms {

    static void login(InputSpecification inputAddressBook) {
        Form loginForm = new Form();

        FormInput username = loginForm.inputField(InputType.TEXT, new Identification(How.name, "user"));
        username.inputValues("admin");

        FormInput password = loginForm.inputField(InputType.TEXT, new Identification(How.name, "pass"));
        password.inputValues("admin");

        inputAddressBook.setValuesInForm(loginForm).beforeClickElement("input").withAttribute("value", "Login");
    }

    static void newEntry(InputSpecification inputAddressBook) {
        Form owner = new Form();

        FormInput username = owner.inputField(InputType.TEXT, new Identification(How.name, "firstname"));
        username.inputValues("John");

        FormInput lastname = owner.inputField(InputType.TEXT, new Identification(How.name, "lastname"));
        lastname.inputValues("Doe");

        FormInput middlename = owner.inputField(InputType.TEXT, new Identification(How.name, "middlename"));
        middlename.inputValues("");

        FormInput nickname = owner.inputField(InputType.TEXT, new Identification(How.name, "nickname"));
        nickname.inputValues("");

        FormInput address = owner.inputField(InputType.TEXTAREA, new Identification(How.name, "address"));
        address.inputValues("1165 The Castings");

        FormInput email = owner.inputField(InputType.TEXT, new Identification(How.name, "email"));
        email.inputValues("jdoe@example.com");

        FormInput email2 = owner.inputField(InputType.TEXT, new Identification(How.name, "email2"));
        email2.inputValues("jdoe@example.com");

        FormInput email3 = owner.inputField(InputType.TEXT, new Identification(How.name, "email3"));
        email3.inputValues("jdoe@example.com");

        FormInput phone_home = owner.inputField(InputType.TEXT, new Identification(How.name, "home"));
        phone_home.inputValues("1234");

        FormInput phone_mobile = owner.inputField(InputType.TEXT, new Identification(How.name, "mobile"));
        phone_mobile.inputValues("5678");

        FormInput phone_work = owner.inputField(InputType.TEXT, new Identification(How.name, "work"));
        phone_work.inputValues("9012");

        FormInput phone_fax = owner.inputField(InputType.TEXT, new Identification(How.name, "fax"));
        phone_fax.inputValues("3456");

        FormInput bday = owner.inputField(InputType.SELECT, new Identification(How.name, "bday"));
        bday.inputValues("18");

        FormInput bmonth = owner.inputField(InputType.SELECT, new Identification(How.name, "bmonth"));
        bmonth.inputValues("August");

        FormInput byear = owner.inputField(InputType.TEXT, new Identification(How.name, "byear"));
        byear.inputValues("1999");

        FormInput phone2 = owner.inputField(InputType.TEXT, new Identification(How.name, "phone2"));
        phone2.inputValues("41076");

        inputAddressBook.setValuesInForm(owner).beforeClickElement("input").withAttribute("value", "Enter");
    }

    public static void newUser(InputSpecification inputAddressBook) {
        Form newUserForm = new Form();

        FormInput username = newUserForm.inputField(InputType.TEXT, new Identification(How.name, "email"));
        username.inputValues("jdoe@example.com");

        FormInput password = newUserForm.inputField(InputType.TEXT, new Identification(How.name, "password"));
        password.inputValues("123456");

        inputAddressBook.setValuesInForm(newUserForm).beforeClickElement("input").withAttribute("value", "Sign-Up");
    }

    public static void searchForm(InputSpecification inputAddressBook) {
        Form newSearchForm = new Form();
        FormInput searchString = newSearchForm.inputField(InputType.TEXT, new Identification(How.name, "searchstring"));
        searchString.inputValues("jdoe@example.com");
        inputAddressBook.setValuesInForm(newSearchForm).beforeClickElement("input").withAttribute("name", "searchstring");
    }

    public static void newGroup(InputSpecification inputAddressBook) {
        Form addGroup = new Form();
        FormInput group_name = addGroup.inputField(InputType.TEXT, new Identification(How.name, "group_name"));
        group_name.inputValues("group 1");
        FormInput group_header = addGroup.inputField(InputType.TEXT, new Identification(How.name, "group_header"));
        group_header.inputValues("group 1 header");
        FormInput group_footer = addGroup.inputField(InputType.TEXT, new Identification(How.name, "group_footer"));
        group_footer.inputValues("group 1 footer");

        inputAddressBook.setValuesInForm(addGroup).beforeClickElement("input")
                .withAttribute("name", "submit")
                .withAttribute("value", "Enter information");
    }
}
