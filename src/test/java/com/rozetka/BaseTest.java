package com.rozetka;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import static com.rozetka.constants.Constant.TimeoutVariables.IMPLICIT_WAIT;
import static com.rozetka.constants.Constant.Urls.HOME_PAGE;

public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        WebDriverManager.chromedriver().setup();
    }

    public void setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        driver.get(HOME_PAGE);
    }

    @AfterSuite
    public void afterSuite(){
        if(driver != null){
            driver.quit();
        }
    }

//    @AfterMethod
//    public void closeWindow(){
//        afterSuite();
//    }
}
