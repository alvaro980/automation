package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.managepage.watermark.Watermark;

public class WatermarkStepdefs {
    private Login login;
    private Dashboard dashboard;
    private Watermark watermark;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'watermark' link$")
    public void clickWatermarkLink() {
        dashboard.clickGeneralExpand();
        watermark = dashboard.initializeWatermarl();
        watermark.getWatermarkExpand();
    }

    @And("^select \"([^\"]*)\" on enable option$")
    public void selectOnEnableOption(String option) throws Throwable {
        watermark.selectEnableOption(option);
    }

    @And("^select \"([^\"]*)\" on Position option$")
    public void selectOnPositionOption(String position) throws Throwable {
        watermark.selectPosition(position);
    }

    @Then("^click in the bottom submit in watermark tab$")
    public void clickInTheBottomSubmitInWatermarkTab() {
        watermark.clickSubmitButtom();
    }
}
