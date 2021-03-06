package steps;

import cucumber.api.java.en.Given;
import pages.BasePage;

public class BaseScenariosSteps extends BaseSteps {

    @Given("^I am on the (?:base|search) page$")
    public void iAmOnTheBasePage() {
        instanceOf(BasePage.class).navigateToBaseUrl();
    }
}