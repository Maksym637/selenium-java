package com.rozetka.pages.login_page;

import com.rozetka.locators.login_page_locators.LoginPageLocators;
import com.rozetka.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmail() {
        waitForElementToAppear(LoginPageLocators.EMAIL.getPath());
        return driver.findElement(LoginPageLocators.EMAIL.getPath());
    }

    public LoginPage enterEmail(String email) {
        getEmail().click();
        getEmail().clear();
        getEmail().sendKeys(email);
        return this;
    }

    public WebElement getPassword() {
        waitForElementToAppear(LoginPageLocators.PASSWORD.getPath());
        return driver.findElement(LoginPageLocators.PASSWORD.getPath());
    }

    public LoginPage enterPassword(String password) {
        getPassword().click();
        getPassword().clear();
        getPassword().sendKeys(password);
        return this;
    }

    public WebElement getLoginButton() {
        waitForElementToBeClickable(LoginPageLocators.SUBMIT_BUTTON.getPath());
        return driver.findElement(LoginPageLocators.SUBMIT_BUTTON.getPath());
    }

    public LoginPage clickLoginButton() {
        getLoginButton().click();
        return this;
    }

    public LoginPage clickLoginButtonConfirm(){
        waitSeconds(1);
        getLoginButton().click();
        return this;
    }

    public WebElement getCaptchaButton() {
        waitForElementToAppear(LoginPageLocators.CAPTCHA_BUTTON.getPath());
        return driver.findElement(LoginPageLocators.CAPTCHA_BUTTON.getPath());
    }

    public LoginPage clickCaptchaButton() {
        getCaptchaButton().click();
        return this;
    }
}
