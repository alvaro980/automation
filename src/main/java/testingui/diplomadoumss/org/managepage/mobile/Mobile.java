package testingui.diplomadoumss.org.managepage.mobile;

import com.sun.org.apache.bcel.internal.generic.MONITORENTER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class Mobile extends BasePage {
    @FindBy(xpath = "//*[@id=content']/form/div/div[1]/div[2]/ul/li[3]/a")
    private WebElement singleSiteExpansion;

    @FindBy(xpath = "//input[@name='mobile[apiKey]']")
    private WebElement inputAPIKEY;

    @FindBy(xpath = "//input[@name='mobile[iosUrl]']")
    private WebElement inputURL;

    @FindBy(xpath = "//input[@name='mobile[androidUrl]']")
    private WebElement inputMobileURL;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement buttomSubmit;

    public Mobile() {
        avoidToUse(2);
    }

    public void clickOnMobileExpand() {
        clickWebElement(singleSiteExpansion);
    }

    public Mobile fillInputAPIKEY(String value) {
        fillWebElement(inputAPIKEY, value);
        return this;
    }

    public Mobile fillSection(String value) {
        fillWebElement(inputURL, value);
        return this;
    }

    public Mobile fillURL(String value) {
        fillWebElement(inputURL, value);
        return this;
    }

    public Mobile fillMobileURL(String value) {
        fillWebElement(inputMobileURL, value);
        return this;
    }

    public void clickOnSubmitButtom() {
        clickWebElement(buttomSubmit);
    }
}
