package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.email.Email;
import testingui.diplomadoumss.org.managepage.login.Login;

public class EmailStepdefs {
    private Login login;
    private Dashboard dashboard;
    private Email email;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'email' tab$")
    public void clickEmailTab() {
        dashboard.clickGeneralExpand();
        email = dashboard.initializeEmail();
        email.clickEmailExpansion();
    }

    @And("^select \"([^\"]*)\" on 'Mailer' option$")
    public void selectOnMailerOption(String mailer) throws Throwable {
        email.selectMailer(mailer);
    }

    @And("^fill 'Email' with \"([^\"]*)\"$")
    public void fillEmailWith(String em) throws Throwable {
        email.fillEmailInput(em);
    }

    @And("^fill 'Test Email Receiver' with \"([^\"]*)\"$")
    public void fillTestEmailReceiverWith(String em) throws Throwable {
        email.fillTextReceiverInput(em);
    }

    @And("^click on 'Test Email'$")
    public void clickOnTestEmail() {
        email.clickOnTestEmail();
    }

    @Then("^click in the bottom submit on 'email' tab$")
    public void clickInTheBottomSubmitOnEmailTab() {
        email.clickOnSubmitButtom();
    }
}
