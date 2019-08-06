package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.managepage.mobile.Mobile;

public class MovileStepdefs {
    private Login login;
    private Dashboard dashboard;
    private Mobile mobile;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'mobile' tab$")
    public void clickMobileTab() {
        dashboard.clickGeneralExpand();
        mobile = dashboard.initializeMobile();
    }

    @And("^fill 'Api key' input with \"([^\"]*)\"$")
    public void fillApiKeyInputWith(String api) throws Throwable {
        mobile.fillInputAPIKEY(api);
    }

    @And("^fill 'MObile Section Footer' with \"([^\"]*)\"$")
    public void fillMObileSectionFooterWith(String url) throws Throwable {
        mobile.fillSection(url);
    }

    @And("^fill 'URL' input with \"([^\"]*)\"$")
    public void fillURLInputWith(String mobileUrl) throws Throwable {
        mobile.fillURL(mobileUrl);
    }

    @Then("^click in the bottom submit on 'server mobile' tab$")
    public void clickInTheBottomSubmitOnServerMobileTab() {
        mobile.clickOnSubmitButtom();
    }
}
