package testingui.diplomadoumss.org.stepsdefinitions;

import com.sun.tools.javah.Gen;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.general.General;
import testingui.diplomadoumss.org.managepage.login.Login;

public class GeneralStepdefs {
    private Login login;
    private Dashboard dashboard;
    private General general;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'General' link$")
    public void clickGeneralLink() {
        dashboard.clickGeneralExpand();
        general = dashboard.initializeGeneral();
    }

    @And("^click TravelHope General > Settings link$")
    public void clickTravelHopeGeneralSettingsLink() {
        general.clickOnSettings();
    }

    @And("^fill the input 'Business Name' with \"([^\"]*)\"$")
    public void fillTheInputBusinessNameWith(String name) throws Throwable {
        general.fillBussinessName(name);
    }

    @And("^fill the input 'Site URL' with \"([^\"]*)\"$")
    public void fillTheInputSiteURLWith(String url) throws Throwable {
        general.fillSiteUrl(url);
    }

    @And("^fill the input 'License Key' with \"([^\"]*)\"$")
    public void fillTheInputLicenseKeyWith(String key) throws Throwable {
        general.fillLicenceKey(key);
    }

    @And("^fill the input 'Copyrights' with \"([^\"]*)\"$")
    public void fillTheInputCopyrightsWith(String copyRights) throws Throwable {
        general.fillCopyRights(copyRights);
    }

    @And("^fill the input 'Home Title' with \"([^\"]*)\"$")
    public void fillTheInputHomeTitleWith(String tittle) throws Throwable {
        general.fillHomeTittle(tittle);
    }

    @And("^fill the input 'Default Keywords' with \"([^\"]*)\"$")
    public void fillTheInputDefaultKeywordsWith(String keywords) throws Throwable {
        general.fillDefaultKeywords(keywords);
    }

    @And("^fill the input 'Default Description' with \"([^\"]*)\"$")
    public void fillTheInputDefaultDescriptionWith(String des) throws Throwable {
        general.fillDefaultDescription(des);
    }

    @And("^fill the input 'Google Map API' with \"([^\"]*)\"$")
    public void fillTheInputGoogleMapAPIWith(String map) throws Throwable {
        general.fillGoogleMapAPI(map);
    }

    @And("^fill the input 'Tracking & Analytics' with \"([^\"]*)\"$")
    public void fillTheInputTrackingAnalyticsWith(String tracking) throws Throwable {
        general.fillTrackingDefault(tracking);
    }

    @Then("^click in the buttom submit$")
    public void clickInTheButtomSubmit() {
        general.clickBottomSubmit();
    }
}
