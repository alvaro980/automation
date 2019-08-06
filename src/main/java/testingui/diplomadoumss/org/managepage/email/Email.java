package testingui.diplomadoumss.org.managepage.email;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class Email extends BasePage {

    @FindBy(xpath = "//*[@id=content']/form/div/div[1]/div[2]/ul/li[5]/a")
    private WebElement emailExpansion;

    @FindBy(xpath = "//select[@name='defmailer']")
    private WebElement selectorMailer;

    @FindBy(xpath = "//input[@name='fromemail']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@type='text' and @class='form-control testemailtxt']")
    private WebElement testEmailReceiverInput;

    @FindBy(xpath = "//div[@class='col-md-4']//span[@class='btn btn-sm btn-primary testEmail']") // from here
    private WebElement testMailButtom;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement submitButtom;

    public Email() {
        avoidToUse(2);
    }

    public Email clickEmailExpansion() {
        clickWebElement(emailExpansion);
        return this;
    }

    public Email selectMailer(String value) {
        selectWebElementSelector(selectorMailer, value);
        return this;
    }

    public Email fillTextReceiverInput(String value) {
        fillWebElement(testEmailReceiverInput, value);
        return this;
    }

    public Email fillEmailInput(String value) {
        fillWebElement(emailInput, value);
        return this;
    }

    public void clickOnTestEmail() {
        clickWebElement(testEmailReceiverInput);
    }

    public void clickOnSubmitButtom() {
        clickWebElement(submitButtom);
    }
}
