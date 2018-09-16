package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;

import static utils.extensions.WebElementExtensions.weClick;
import static utils.extensions.WebElementExtensions.weElementIsDisplayed;

public class SearchResultsPage extends BasePage {

    @FindBy(how = How.CLASS_NAME, using = "result__a")
    public List<WebElement> searchResultLinks;

    @FindBy(how = How.ID, using = "links")
    public WebElement searchResultsContainer;

    public RedditPage selectFirstListedSearchResult() {
        weClick(searchResultLinks.get(0));
        return instanceOf(RedditPage.class);
    }

    public void assertSearchResultsDisplayed() {
        weElementIsDisplayed(searchResultsContainer);
    }
}
