package testingui.diplomadoumss.org.managepage.serverInformation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class ServerInformation extends BasePage {
    @FindBy(xpath = "//*[@id=content']/form/div/div[1]/div[2]/ul/li[8]/a")
    private WebElement serverInformationExpansion;

    @FindBy(xpath = "//div[@id='SERVER']//a/strong[contains(text(), 'Server OS')]")
    private WebElement textServerOs;

    @FindBy(xpath = "//div[@id='SERVER']//a/strong[contains(text(), ' Browser ')]")
    private WebElement textBroser;

    @FindBy(xpath = "//div[@id='SERVER']//a/strong[contains(text(), ' PHP Version ')]")
    private WebElement textPhpVersion;

    @FindBy(xpath = "//div[@id='SERVER']//a/strong[contains(text(), 'MySQL Version')]")
    private WebElement textMysql;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement buttomSubmit;

    public ServerInformation(){
        avoidToUse(2);
    }
    public void clickOnServerInformationExpansion(){
        clickWebElement(serverInformationExpansion);
    }
    
}
