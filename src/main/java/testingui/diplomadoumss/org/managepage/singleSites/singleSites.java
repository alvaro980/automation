package testingui.diplomadoumss.org.managepage.singleSites;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;
import static testingui.diplomadoumss.org.manageevents.Event.fillWebElement;

public class singleSites extends BasePage {
    @FindBy(xpath = "//*[@id='content']/form/div/div[1]/div[2]/ul/li[2]/a")
    private WebElement singleSiteExpansion;

    @FindBy(xpath = "//select[@name='spa_module']")
    private WebElement selectModuleName;

    @FindBy(xpath = "//select[@name='spa_status']")
    private WebElement selectStatus;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement buttomSubmit;

}
