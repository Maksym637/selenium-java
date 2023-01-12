package com.rozetka.listener;

import com.rozetka.base_test.BaseTest;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest extends BaseTest implements ITestListener {

    public static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("[TEST SUCCEED : " + getTestMethodName(result) + " ]");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("[TEST SKIPPED : " + getTestMethodName(result) + " ]");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Object testClass = result.getInstance();
        WebDriver driver = ((BaseTest) testClass).getDriver();
        if (driver instanceof WebDriver) {
            saveScreenshotPNG(driver);
        }
        System.out.println("[TEST FAILED : " + getTestMethodName(result) + " ]");
    }

    @Attachment(value = "SCREENSHOT", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
