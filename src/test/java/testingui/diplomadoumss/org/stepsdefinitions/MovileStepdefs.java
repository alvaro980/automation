package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

public class MovileStepdefs {
    private Login login;
    private Dashboard dashboard;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'General' link on 'Left Panel' page$")
    public void clickGeneralLinkOnLeftPanelPage() throws Throwable {
        dashboard.clickGeneralExpand();
    }

    @And("^fill \"([^\"]*)\" email field on 'Login' page$")
    public void fillEmailFieldOnLoginPage(String email) throws Throwable {
        login.setEmail(email);
    }

    @And("^fill \"([^\"]*)\" password field on 'Login' page$")
    public void fillPasswordFieldOnLoginPage(String password) throws Throwable {
        login.setPassword(password);
    }

    @And("^click 'mobile' tab$")
    public void clickMobileTab() {

    }

    @And("^fill 'Api key' input with \"([^\"]*)\"$")
    public void fillApiKeyInputWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^fill 'MObile Section Footer' with \"([^\"]*)\"$")
    public void fillMObileSectionFooterWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^fill 'URL' input with \"([^\"]*)\"$")
    public void fillURLInputWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^click in the bottom submit on 'server mobile' tab$")
    public void clickInTheBottomSubmitOnServerMobileTab() {
    }
}
