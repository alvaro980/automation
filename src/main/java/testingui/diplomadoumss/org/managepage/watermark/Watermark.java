package testingui.diplomadoumss.org.managepage.watermark;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class Watermark extends BasePage {

    @FindBy(xpath = "//*[@id=content']/form/div/div[1]/div[2]/ul/li[4]/a")
    private WebElement watermarkExpansion;

    @FindBy(xpath = "//select[@class='form-control' and @name='wm_status']")
    private WebElement selectorEnable;

    @FindBy(xpath = "//select[@class='form-control' and @name='img_position']")
    private WebElement selectorPosition;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement buttomSubmit;

    public Watermark() {
        avoidToUse(2);
    }

    public void getWatermarkExpand() {
        clickWebElement(watermarkExpansion);
    }

    public Watermark selectEnableOption(String value) {
        selectWebElementSelector(selectorEnable, value);
        return this;
    }

    public Watermark selectPosition(String value) {
        selectWebElementSelector(selectorPosition, value);
        return this;
    }

    public void clickSubmitButtom() {
        clickWebElement(buttomSubmit);
    }

}
