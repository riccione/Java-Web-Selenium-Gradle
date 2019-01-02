package utils.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxWebDriver {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private static void setupFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
    }

    public static WebDriver loadFirefoxDriver(String firefoxArgument) {
        setupFirefoxDriver();

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments(firefoxArgument);

        driver = ThreadLocal.withInitial(() -> new FirefoxDriver(options));
        return driver.get();
    }
}