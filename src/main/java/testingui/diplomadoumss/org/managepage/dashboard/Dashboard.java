package testingui.diplomadoumss.org.managepage.dashboard;

import static testingui.diplomadoumss.org.manageevents.Event.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.Themes.Themes;
import testingui.diplomadoumss.org.managepage.TravelHopeFlights.Flights;
import testingui.diplomadoumss.org.managepage.contact.Contact;
import testingui.diplomadoumss.org.managepage.email.Email;
import testingui.diplomadoumss.org.managepage.general.General;
import testingui.diplomadoumss.org.managepage.mobile.Mobile;
import testingui.diplomadoumss.org.managepage.serverInformation.ServerInformation;
import testingui.diplomadoumss.org.managepage.singleSites.SingleSites;
import testingui.diplomadoumss.org.managepage.watermark.Watermark;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Dashboard extends BasePage {

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'general') and @aria-expanded='false']")
    private WebElement generalExpand;

    @FindBy(xpath = "//a[text()='Currencies']")
    private WebElement currenciesOption;

    @FindBy(xpath = "//")
    private WebElement fligthsExpand;

    @FindBy(xpath = "//a[text()='Airports']")
    private WebElement airportsOption;

    public Dashboard() {
//        isWebElementVisible(bookingLink);
        avoidToUse(3);
    }

    public Dashboard clickGeneralExpand() {
        clickWebElement(generalExpand);
        return this;
    }

    public Dashboard clickCurrenciesOption() {
        clickWebElement(currenciesOption);
        return this;
    }

    public Dashboard clickFligthsExpand() {
        clickWebElement(fligthsExpand);
        return this;
    }

    public Dashboard clickAirportsOption() {
        clickWebElement(airportsOption);
        return this;
    }

    public Flights initializeFlights() {
        return new Flights();
    }

    public Contact initializeContact() {
        return new Contact();
    }

    public Email initializeEmail() {
        return new Email();
    }

    public General initializeGeneral() {
        return new General();
    }

    public Mobile initializeMobile() {
        return new Mobile();
    }

    public ServerInformation initializeServer() {
        return new ServerInformation();
    }

    public SingleSites initializeSingleSite() {
        return new SingleSites();
    }

    public Themes initializeThemes() {
        return new Themes();
    }

    public Watermark initializeWatermarl() {
        return new Watermark();
    }
}
