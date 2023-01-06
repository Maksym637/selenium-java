package com.rozetka.pages.home_page;

import com.rozetka.locators.home_page_locators.HomePageLocators;
import com.rozetka.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHamburgerButton() {
        waitForElementToBeClickable(HomePageLocators.HAMBURGER_BUTTON.getPath());
        return driver.findElement(HomePageLocators.HAMBURGER_BUTTON.getPath());
    }

    public LeftBarComponent clickHamburgerButton() {
        getHamburgerButton().click();
        return new LeftBarComponent(driver);
    }

    public String getCookie() {
        waitSeconds(1);
        return driver.manage().getCookieNamed("login").getValue();
    }

    public WebElement getLogoutButton() {
        waitForElementToBeClickable(HomePageLocators.LOGOUT_BUTTON.getPath());
        return driver.findElement(HomePageLocators.LOGOUT_BUTTON.getPath());
    }

    public HomePage clickLogoutButton() {
        getLogoutButton().click();
        return this;
    }
}
