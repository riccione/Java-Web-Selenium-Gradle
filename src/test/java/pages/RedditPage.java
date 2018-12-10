package pages;

public class RedditPage extends SearchResultsPage {

    public void assertIAmOnRedditPage() {
        validatePageTitle("reddit:");
        validatePageUrl("https://www.reddit.com");
        validatePageSource("Reddit");
    }
}
