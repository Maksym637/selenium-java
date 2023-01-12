package com.rozetka.base_test;

import com.rozetka.listener.ListenerTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.time.Duration;

import static com.rozetka.constants.Constant.TimeoutVariables.IMPLICIT_WAIT;
import static com.rozetka.constants.Constant.Urls.HOME_PAGE;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

@Listeners({ListenerTest.class})
public class BaseTest {

    protected WebDriver driver;
    protected ChromeOptions options;

    @BeforeClass
    public void setUpDriver() {
        chromedriver().setup();

        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        driver.get(HOME_PAGE);
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterClass
    public void tearDownDriver() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }
}
