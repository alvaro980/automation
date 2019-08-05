package testingui.diplomadoumss.org.managepage.general;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;
import static testingui.diplomadoumss.org.manageevents.Event.fillWebElement;

public class General extends BasePage {

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), ' general')]")
    private WebElement generalLinkExpansion;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='menu-ui']//li[1]//a[contains(text(), 'Settings')]")
    private WebElement generalSettingsExpansion;

    @FindBy(xpath = "//input[@id='hlogo' and @class='btn btn-default' and @name='hlogo']")
    private WebElement inputBussinessLogo;

    @FindBy(xpath = "//input[@id='favimage' and @class='btn btn-default' and @name='favimg']")
    private WebElement inputFaviconLogo;

    @FindBy(xpath = "//input[@type='text' and @name='site_title']") // from here
    private WebElement inputBussinessName;

    @FindBy(xpath = "//input[@type='text' and @name='site_url']")
    private WebElement inputSiteUrl;

    @FindBy(xpath = "//input[@type='text' and @name='license']")
    private WebElement inputLicenceKey;

    @FindBy(xpath = "//input[@type='text' and @name='copyright']")
    private WebElement inputCopyrights;

    @FindBy(xpath = "//input[@type='text' and @name='slogan']")
    private WebElement inputHomeTittle;

    @FindBy(xpath = "//input[@type='text' and @name='keywords']")
    private WebElement inputKeyboard;

    @FindBy(xpath = "//textarea[@name='meta_description']")
    private WebElement textareaDefaultDescription;

    @FindBy(xpath = "//input[@name='mapapi' and @class='form-control']")
    private WebElement inputGoogleMapAPI;

    @FindBy(xpath = "//textarea[@name='gacode' and @class='form-control']")
    private WebElement textAreaTrackingAndAnalitics;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement buttomSubmit;

    public General() {
        avoidToUse(2);
    }

    public General fillBussinessName(String value) {
        fillWebElement(inputBussinessName, value);
        return this;
    }

    public General fillSiteUrl(String value) {
        fillWebElement(inputSiteUrl, value);
        return this;
    }

    public General fillLicenceKey(String value) {
        fillWebElement(inputLicenceKey, value);
        return this;
    }

    public General fillCopyRights(String value) {
        fillWebElement(inputCopyrights, value);
        return this;
    }

    public General fillHomeTittle(String value) {
        fillWebElement(inputHomeTittle, value);
        return this;
    }

    public General fillDefaultKeywords(String value) {
        fillWebElement(inputKeyboard, value);
        return this;
    }

    public General fillDefaultDescription(String value) {
        fillWebElement(textareaDefaultDescription, value);
        return this;
    }

    public General fillGoogleMapAPI(String value) {
        fillWebElement(inputGoogleMapAPI, value);
        return this;
    }

    public General fillTrackingDefault(String value) {
        fillWebElement(textAreaTrackingAndAnalitics, value);
        return this;
    }

    public void clickButtomSubmit() {
        clickWebElement(buttomSubmit);
    }
}
