package com.rozetka.pages.profile_page;

import com.rozetka.locators.profile_page_locators.PersonalDataLocators;
import com.rozetka.pages.base_page.BasePage;
import io.qameta.allure.Step;
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

    @Step("Click on the 'Редагувати' button.")
    public PersonalComponent clickEditButton() {
        getEditButton().click();
        return this;
    }

    public WebElement getFirstName() {
        waitForElementToAppear(PersonalDataLocators.FIRST_NAME.getPath());
        return driver.findElement(PersonalDataLocators.FIRST_NAME.getPath());
    }

    @Step("Fill your new first name in the field 'Ім'я'.")
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

    @Step("Fill your new last name in the field 'Прізвище'.")
    public PersonalComponent enterLastName(String lastName) {
        getLastName().click();
        getLastName().clear();
        getLastName().sendKeys(lastName);
        return this;
    }

    public WebElement getSaveButton() {
        waitForElementToBeClickable(PersonalDataLocators.SAVE_BUTTON.getPath());
        return driver.findElement(PersonalDataLocators.SAVE_BUTTON.getPath());
    }

    @Step("After that click on the 'Зберегти' button.")
    public PersonalComponent clickSaveButton() {
        getSaveButton().click();
        waitForPageReload(PersonalDataLocators.RELOAD_FIELD.getPath());
        return this;
    }
}
