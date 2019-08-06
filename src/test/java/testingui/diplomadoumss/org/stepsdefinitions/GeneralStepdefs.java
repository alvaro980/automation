package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

public class GeneralStepdefs {
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

    @And("^click 'General' link$")
    public void clickGeneralLink() {

    }

    @And("^click TravelHope General > Settings link$")
    public void clickTravelHopeGeneralSettingsLink() {

    }

    @And("^fill the input 'Business Name' with \"([^\"]*)\"$")
    public void fillTheInputBusinessNameWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^fill the input 'Site URL' with \"([^\"]*)\"$")
    public void fillTheInputSiteURLWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^fill the input 'License Key' with \"([^\"]*)\"$")
    public void fillTheInputLicenseKeyWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^fill the input 'Copyrights' with \"([^\"]*)\"$")
    public void fillTheInputCopyrightsWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^fill the input 'Home Title' with \"([^\"]*)\"$")
    public void fillTheInputHomeTitleWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^fill the input 'Default Keywords' with \"([^\"]*)\"$")
    public void fillTheInputDefaultKeywordsWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^fill the input 'Default Description' with \"([^\"]*)\"$")
    public void fillTheInputDefaultDescriptionWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^fill the input 'Google Map API' with \"([^\"]*)\"$")
    public void fillTheInputGoogleMapAPIWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^fill the input 'Tracking & Analytics' with \"([^\"]*)\"$")
    public void fillTheInputTrackingAnalyticsWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^click in the buttom submit$")
    public void clickInTheButtomSubmit() {
    }
}
