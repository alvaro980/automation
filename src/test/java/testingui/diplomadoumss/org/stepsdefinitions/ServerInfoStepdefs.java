package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.managepage.serverInformation.ServerInformation;

public class ServerInfoStepdefs {
    private Login login;
    private Dashboard dashboard;
    private ServerInformation serverInformation;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'serverInformation' tab$")
    public void clickServerInformationTab() {
        dashboard.clickGeneralExpand();
        serverInformation = dashboard.initializeServer();
        serverInformation.clickOnServerInformationExpansion();
    }

    @Then("^click in the bottom submit on 'server information' tab$")
    public void clickInTheBottomSubmitOnServerInformationTab() {
        serverInformation.clickButtomSubmit();
    }

    @And("^should appear \"([^\"]*)\" available first option$")
    public void shouldAppearAvailableFirstOption(String text) throws Throwable {
        String value = serverInformation.verifyTextBrowser();
        Assert.assertEquals(value, text);
    }

    @And("^should appear \"([^\"]*)\" available second option$")
    public void shouldAppearAvailableSecondOption(String text) throws Throwable {
        String value = serverInformation.verifyTextMysql();
        Assert.assertEquals(value, text);
    }

    @And("^should appear \"([^\"]*)\" available three option$")
    public void shouldAppearAvailableThreeOption(String text) throws Throwable {
        String value = serverInformation.verifyTextPhpVersion();
        Assert.assertEquals(value, text);
    }

    @And("^should appear \"([^\"]*)\" available four option$")
    public void shouldAppearAvailableFourOption(String text) throws Throwable {
        String value = serverInformation.verifyTextMysql();
        Assert.assertEquals(value, text);
    }
}
