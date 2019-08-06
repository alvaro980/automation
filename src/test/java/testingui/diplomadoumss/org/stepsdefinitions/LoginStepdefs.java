package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.TravelHopeFlights.Flights;
import testingui.diplomadoumss.org.managepage.airports.Airports;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.general.General;
import testingui.diplomadoumss.org.managepage.login.Login;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class LoginStepdefs {
    private Login login;
    private Dashboard dashboard;
    private Airports airports = new Airports();

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

    @Then("^verify the \"([^\"]*)\" label button is displayed on 'Login' page$")
    public void verifyTheLabelButtonIsDisplayedOnLoginPage(String loginLabelButton) throws Throwable {
        String loginLabelButtonCurrent = login.getLoginLabelButton();

        Assert.assertEquals(loginLabelButtonCurrent, loginLabelButton, "Login page is verifying the 'LOGIN' label button.");
    }

    @Then("^verify the \"([^\"]*)\" option li is displayed on 'Left Panel' page$")
    public void verifyTheOptionLiIsDisplayedOnLeftPanelPage(String currenciesLinkName) throws Throwable {
        String optionLiCurrencies = login.getCurrenciesLiOption();
        Assert.assertEquals((login.isCurrenciesOptionVisible()), Boolean.TRUE, "Currencies option is verifying the allowed option");
    }

    @And("^click 'Currencies' link belows 'General' options$")
    public void clickCurrenciesLinkBelowsGeneralOptions() throws Throwable {
        dashboard.clickCurrenciesOption();
    }

    @And("^click 'Flights' link on 'Left Panel' page$")
    public void clickFlightsLinkOnLeftPanelPage() throws Throwable {
        dashboard.clickFligthsExpand();
    }

    @Then("^verify that \"([^\"]*)\" option li is displayed on 'Left Panel' page$")
    public void verifyThatOptionLiIsDisplayedOnLeftPanelPage(String arg0) throws Throwable {
        Assert.assertEquals((airports.isFlightsOptionVisible()), Boolean.TRUE, "Airports option is verifying the allowed option");
    }

    @And("^click 'Airports' link belows 'Flights' options$")
    public void clickAirportsLinkBelowsFlightsOptions() throws Throwable {
        dashboard.clickAirportsOption();
    }

    @Then("^verify main airports are present in column Country$")
    public void verifyMainAirportsArePresentInColumnCountry() throws Throwable {
        Boolean arePresentAirports = airports.arePresentMainAirports();
        Assert.assertEquals(arePresentAirports, Boolean.TRUE);
    }

}
