package com.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

import static com.rozetka.constants.Constant.TimeoutVariables.IMPLICIT_WAIT;
import static com.rozetka.constants.Constant.Urls.HOME_PAGE;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setUpDriver() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        driver.get(HOME_PAGE);
    }

    @AfterClass
    public void tearDownDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
