package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.BasePage;
import pages.SearchResultsPage;

import java.util.List;

public class ValidationSteps extends BaseSteps {

    @Then("^I see the page title contains \"([^\"]*)\"$")
    public void i_see_the_page_title_contains(String expectedTitle) {
        instanceOf(BasePage.class).validatePageTitle(expectedTitle);
    }

    @Then("^I see the page Url contains \"([^\"]*)\"$")
    public void iSeeThePageUrlContains(String expectedUrl) {
        instanceOf(BasePage.class).validatePageUrl(expectedUrl);
    }

    @Then("^I see \"([^\"]*)\" in the PageSource$")
    public void iSeeInThePageSource(String expectedPageSource) {
        instanceOf(BasePage.class).validatePageSource(expectedPageSource);
    }

    @And("^I see search results returned$")
    public void iSeeSearchResultsReturned() {
        instanceOf(SearchResultsPage.class).assertSearchResultsDisplayed();
    }

    @Then("^I see$")
    public void iSee(List<String> existsInPageSource) {
        instanceOf(BasePage.class).validateMultipleInPageSource(existsInPageSource);
    }
}