package com.rozetka.pages.home_page;

import com.rozetka.locators.home_page_locators.LeftBarLocators;
import com.rozetka.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftBarComponent extends BasePage {

    public LeftBarComponent(WebDriver driver) {
        super(driver);
    }

    public WebElement getLanguage() {
        waitForElementToAppear(LeftBarLocators.LANGUAGE_TEXT.getPath());
        return driver.findElement(LeftBarLocators.LANGUAGE_TEXT.getPath());
    }

    public String getLanguageText() {
        return getLanguage().getText();
    }

    public WebElement getCity() {
        waitForElementToAppear(LeftBarLocators.CITY_TEXT.getPath());
        return driver.findElement(LeftBarLocators.CITY_TEXT.getPath());
    }

    public String getCityText() {
        return getCity().getText();
    }

    public WebElement getRuButton() {
        waitForElementToBeClickable(LeftBarLocators.RU_BUTTON.getPath());
        return driver.findElement(LeftBarLocators.RU_BUTTON.getPath());
    }

    public LeftBarComponent clickRuButton() {
        getRuButton().click();
        return this;
    }
}
