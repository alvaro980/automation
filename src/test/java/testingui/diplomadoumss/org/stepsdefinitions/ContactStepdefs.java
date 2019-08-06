package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.contact.Contact;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

public class ContactStepdefs {
    private Login login;
    private Dashboard dashboard;
    private Contact contact;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'contact' tab$")
    public void clickContactTab() {
        dashboard.clickGeneralExpand();
        contact = dashboard.initializeContact();
        contact.clickContactExpand();
    }

    @And("^fill 'Phone number' input with \"([^\"]*)\"$")
    public void fillPhoneNumberInputWith(String value) throws Throwable {
        contact.fillPhoneNumberInput(value);
    }

    @And("^fill 'Email' input with \"([^\"]*)\"$")
    public void fillEmailInputWith(String email) throws Throwable {
        contact.fillContactEmailInput(email);
    }

    @And("^fill 'Address' input with \"([^\"]*)\"$")
    public void fillAddressInputWith(String address) throws Throwable {
        contact.fillTextAreaAddress(address);
    }

    @Then("^click in the bottom submit on 'contact' tab$")
    public void clickInTheBottomSubmitOnContactTab() {
        contact.clickSubmitbuttom();
    }
}
