package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.extensions.WebElementExtensions.*;

public class RedditPage extends SearchResultsPage {

    @FindBy(id = "SHORTCUT_FOCUSABLE_DIV")
    private WebElement redditContentArea;

    public void assertIAmOnRedditPage() {
        weElementIsDisplayed(redditContentArea);
        validatePageTitle("reddit:");
        validatePageUrl("https://www.reddit.com");
        validatePageSource("Reddit");
    }
}
