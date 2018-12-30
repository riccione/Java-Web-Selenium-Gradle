package utils.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWebDriver {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setupChromeDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public static WebDriver loadChromeDriver(String chromeArgument) {
        setupChromeDriver();

        ChromeDriverService driverService = ChromeDriverService.createDefaultService();

        ChromeOptions options = new ChromeOptions();
        options.addArguments(chromeArgument);

        driver = ThreadLocal.withInitial(() -> new ChromeDriver(driverService, options));
        return driver.get();
    }
}