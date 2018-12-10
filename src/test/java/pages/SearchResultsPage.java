package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static utils.extensions.WebElementExtensions.*;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(how = How.CLASS_NAME, using = "result__a")
    public List<WebElement> searchResultLinks;

    @FindBy(how = How.ID, using = "links")
    public WebElement searchResultsContainer;

    public void viewFirstResult() {
        assertSearchResultsDisplayed();
        selectFirstListedSearchResult();
    }

    private RedditPage selectFirstListedSearchResult() {
        weClick(searchResultLinks.get(0));
        return instanceOf(RedditPage.class);
    }

    private void assertSearchResultsDisplayed() {
        weElementIsDisplayed(searchResultsContainer);
    }
}
