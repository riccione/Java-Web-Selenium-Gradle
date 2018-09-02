package steps;

import cucumber.api.java.en.And;
import pages.SearchResultsPage;

public class ReturnClickSteps extends BaseSteps {

    @And("^I select the first returned result$")
    public void iSelectTheFirstReturnedResult() throws Throwable {
        instanceOf(SearchResultsPage.class).selectFirstListedSearchResult();
    }
}
