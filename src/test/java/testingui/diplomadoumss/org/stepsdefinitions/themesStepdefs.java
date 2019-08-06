package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.Themes.Themes;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

public class themesStepdefs {
    private Login login;
    private Dashboard dashboard;
    private Themes themes;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'theme' link$")
    public void clickThemeLink() {
        dashboard.clickGeneralExpand();
        themes = dashboard.initializeThemes();
        themes.getThemesExpand();

    }

    @And("^select \"([^\"]*)\" on theme option$")
    public void selectOnThemeOption(String theme) throws Throwable {
        themes.selectThemes(theme);
    }

    @Then("^click in the bottom submit on theme tab$")
    public void clickInTheBottomSubmitOnThemeTab() {
        themes.clickButtomSubmit();
    }
}
