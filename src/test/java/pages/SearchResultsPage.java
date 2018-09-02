package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static utils.extensions.WebElementExtensions.weClick;

public class SearchResultsPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'g')]//div//div//div//h3//a")
    public List<WebElement> searchResults;

    public RedditPage selectFirstListedSearchResult() {
        weClick(searchResults.get(0));
        return instanceOf(RedditPage.class);
    }
}
