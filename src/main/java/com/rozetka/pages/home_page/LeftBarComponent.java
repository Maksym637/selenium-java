package com.rozetka.pages.home_page;

import com.rozetka.locators.home_page_locators.LeftBarLocators;
import com.rozetka.pages.base_page.BasePage;
import io.qameta.allure.Step;
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

    @Step("Compare the spelling of 'Мова' field.")
    public String getLanguageText() {
        return getLanguage().getText();
    }

    public WebElement getCity() {
        waitForElementToAppear(LeftBarLocators.CITY_TEXT.getPath());
        return driver.findElement(LeftBarLocators.CITY_TEXT.getPath());
    }

    @Step("Compare the spelling of 'Місто' field.")
    public String getCityText() {
        return getCity().getText();
    }

    public WebElement getRuButton() {
        waitForElementToBeClickable(LeftBarLocators.RU_BUTTON.getPath());
        return driver.findElement(LeftBarLocators.RU_BUTTON.getPath());
    }

    @Step("Move to the section 'Мова' and click on the 'RU' button.")
    public LeftBarComponent clickRuButton() {
        getRuButton().click();
        return this;
    }
}
