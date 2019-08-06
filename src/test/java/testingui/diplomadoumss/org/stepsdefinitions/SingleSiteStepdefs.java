package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.managepage.singleSites.SingleSites;

public class SingleSiteStepdefs {
    private Login login;
    private Dashboard dashboard;
    private SingleSites singleSites;


    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'singleSite' link$")
    public void clickSingleSiteLink() {
        dashboard.clickGeneralExpand();
        singleSites = dashboard.initializeSingleSite();
        singleSites.getSingleSiteExpasion();
    }

    @And("^select \"([^\"]*)\" on status option$")
    public void selectOnStatusOption(String status) throws Throwable {
        singleSites.selectStatus(status);
    }

    @And("^select \"([^\"]*)\" on module name option$")
    public void selectOnModuleNameOption(String name) throws Throwable {
        singleSites.selectModuleName(name);
    }

    @Then("^click in the bottom submit in single site tab$")
    public void clickInTheBottomSubmitInSingleSiteTab() {
        singleSites.clickOnSubmitButtom();
    }
}
