package testingui.diplomadoumss.org.managepage.Themes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class Themes extends BasePage {

    @FindBy(xpath = "//*[@id=content']/form/div/div[1]/div[2]/ul/li[6]/a")
    private WebElement themesExpand;

    @FindBy(xpath = "//select[@name='pt_date_format']")
    private WebElement themeSelector;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement buttomSubmit;

    public Themes() {
        avoidToUse(2);
    }

    public Themes getThemesExpand() {
        clickWebElement(themesExpand);
        return this;
    }

    public Themes selectThemes(String value) {
        selectWebElementSelector(themeSelector, value);
        return this;
    }

    public void clickButtomSubmit() {
        clickWebElement(buttomSubmit);
    }
}
