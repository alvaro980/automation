package testingui.diplomadoumss.org.managepage.TravelHopeFlights;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;
import static testingui.diplomadoumss.org.manageevents.Event.fillWebElement;
import static testingui.diplomadoumss.org.manageevents.Event.selectWebElementSelector;

public class Flights extends BasePage {
    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Travelhope Flights')]")
    private WebElement flightlinkExpansion;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='TravelhopeFlights']//a[contains(text(), 'Settings')]")
    private WebElement flightSettingsExpansion;

    @FindBy(xpath = "//input[@id='api_endpoint']")
    private WebElement inputApiEnpoint;

    @FindBy(xpath = "//input[@id='ota_id']")
    private WebElement inputOtaId;

    @FindBy(xpath = "//select[@id='api_environment']")
    private WebElement selectExpansion;

    @FindBy(xpath = "//button[@class='btn btn-primary' and contains(text(), 'Submit')]")
    private WebElement buttomSubmit;

    public Flights() {
        avoidToUse(2);
    }

    public Flights clickTravelHopeHotels() {
        clickWebElement(flightlinkExpansion);
        return this;
    }

    public Flights clickTravelHopeHotelsSettings() {
        clickWebElement(flightSettingsExpansion);
        return this;
    }

    public Flights fillApiEnpointInput(String value) {
        fillWebElement(inputApiEnpoint, value);
        return this;
    }

    public Flights fillOtaidInput(String value) {
        fillWebElement(inputOtaId, value);
        return this;
    }

    public Flights selectExpansionSelector(String value) {
        selectWebElementSelector(selectExpansion, value);
        return this;
    }

    public Flights clickButtomSubmit() {
        clickWebElement(buttomSubmit);
        return this;
    }

}
