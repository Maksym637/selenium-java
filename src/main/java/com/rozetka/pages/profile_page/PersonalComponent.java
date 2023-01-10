package com.rozetka.pages.profile_page;

import com.rozetka.locators.profile_page_locators.PersonalDataLocators;
import com.rozetka.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalComponent extends BasePage {

    public PersonalComponent(WebDriver driver) {
        super(driver);
    }

    public WebElement getEditButton() {
        waitForElementToBeClickable(PersonalDataLocators.EDIT_BUTTON.getPath());
        return driver.findElement(PersonalDataLocators.EDIT_BUTTON.getPath());
    }

    public PersonalComponent clickEditButton() {
        getEditButton().click();
        return this;
    }

    public WebElement getFirstName() {
        waitForElementToAppear(PersonalDataLocators.FIRST_NAME.getPath());
        return driver.findElement(PersonalDataLocators.FIRST_NAME.getPath());
    }

    public PersonalComponent enterFirstName(String firstName) {
        getFirstName().click();
        getFirstName().clear();
        getFirstName().sendKeys(firstName);
        return this;
    }

    public WebElement getLastName() {
        waitForElementToAppear(PersonalDataLocators.LAST_NAME.getPath());
        return driver.findElement(PersonalDataLocators.LAST_NAME.getPath());
    }

    public PersonalComponent enterLastName(String lastName) {
        getLastName().click();
        getLastName().clear();
        getLastName().sendKeys(lastName);
        return this;
    }

    public WebElement getMiddleNameForReload() {
        waitForElementToAppear(PersonalDataLocators.MIDDLE_NAME.getPath());
        return driver.findElement(PersonalDataLocators.MIDDLE_NAME.getPath());
    }

    public WebElement getSaveButton() {
        waitForElementToBeClickable(PersonalDataLocators.SAVE_BUTTON.getPath());
        return driver.findElement(PersonalDataLocators.SAVE_BUTTON.getPath());
    }

    public PersonalComponent clickSaveButton() {
        getSaveButton().click();
        getMiddleNameForReload();
        return this;
    }
}
