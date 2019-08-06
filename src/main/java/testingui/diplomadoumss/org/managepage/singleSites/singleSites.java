package testingui.diplomadoumss.org.managepage.singleSites;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;


public class SingleSites extends BasePage {
    @FindBy(xpath = "//*[@id='content']/form/div/div[1]/div[2]/ul/li[2]/a")
    private WebElement singleSiteExpansion;

    @FindBy(xpath = "//select[@name='spa_module']")
    private WebElement selectModuleName;

    @FindBy(xpath = "//select[@name='spa_status']")
    private WebElement selectStatus;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement buttomSubmit;

    public SingleSites() {
        avoidToUse(2);
    }

    public SingleSites getSingleSiteExpasion() {
        clickWebElement(singleSiteExpansion);
        return this;
    }

    public SingleSites selectModuleName(String value) {
        selectWebElementSelector(selectModuleName, value);
        return this;
    }

    public SingleSites selectStatus(String value) {
        selectWebElementSelector(selectStatus, value);
        return this;
    }

    public void clickOnSubmitButtom() {
        clickWebElement(buttomSubmit);
    }

}
