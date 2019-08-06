package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.TravelHopeFlights.Flights;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

public class FlightsStepdefs {
    private Login login;
    private Dashboard dashboard;
    private Flights flights;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click \"([^\"]*)\" link$")
    public void clickLink(String arg0) throws Throwable {
        dashboard.clickGeneralExpand();
        flights = dashboard.initializeFlights();
        flights.clickTravelHopeHotels();
    }

    @And("^click TravelHope Flights > Settings link$")
    public void clickTravelHopeFlightsSettingsLink() {
        flights.clickTravelHopeHotelsSettings();
    }

    @And("^fill the input API Endpoint with \"([^\"]*)\"$")
    public void fillTheInputAPIEndpointWith(String endpoint) throws Throwable {
        flights.fillApiEnpointInput(endpoint);
    }

    @And("^fill the input OTA ID with \"([^\"]*)\"$")
    public void fillTheInputOTAIDWith(String id) throws Throwable {
        flights.fillOtaidInput(id);
    }

    @And("^select the option \"([^\"]*)\" in API Environment$")
    public void selectTheOptionInAPIEnvironment(String selector) throws Throwable {
        flights.selectExpansionSelector(selector);
    }

    @Then("^click in the bottom submit$")
    public void clickInTheBottomSubmit() {
        flights.clickButtomSubmit();
    }
}
