package testingui.diplomadoumss.org.managepage.contact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;
import static testingui.diplomadoumss.org.manageevents.Event.fillWebElement;
import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;

public class Contact extends BasePage {

    @FindBy(xpath = "//*[@id=content']/form/div/div[1]/div[2]/ul/li[7]/a")
    private WebElement çontactExpand;

    @FindBy(xpath = "//input[@name='contact_phone']")
    private WebElement contactInput;

    @FindBy(xpath = "//input[@name='contact_email']")
    private WebElement contactEmailInput;

    @FindBy(xpath = "//textarea[@name='contact_address']")
    private WebElement textAreaAddress;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement submitButtom;

    public Contact() {
        avoidToUse(2);
    }

    public Contact fillContactExpand() {
        clickWebElement(çontactExpand);
        return this;
    }

    public Contact fillContactInput(String value) {
        fillWebElement(contactInput, value);
        return this;

    }

    public Contact fillContactEmailInput(String value) {
        fillWebElement(contactEmailInput, value);
        return this;
    }

    public Contact fillTextAreaAddress(String value) {
        fillWebElement(textAreaAddress, value);
        return this;
    }

    public void clickSubmitbuttom() {
        clickWebElement(submitButtom);
    }

}
