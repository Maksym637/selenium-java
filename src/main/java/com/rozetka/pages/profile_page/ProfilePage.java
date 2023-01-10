package com.rozetka.pages.profile_page;

import com.rozetka.locators.profile_page_locators.ProfilePageLocators;
import com.rozetka.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage extends BasePage {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUserNames() {
        waitForElementToAppear(ProfilePageLocators.USER_NAMES.getPath());
        return driver.findElement(ProfilePageLocators.USER_NAMES.getPath());
    }

    public String[] getUserNamesText() {
        return getUserNames().getText().split(" ");
    }

    public WebElement getProfileSection() {
        waitForElementToBeClickable(ProfilePageLocators.PROFILE_SECTION.getPath());
        return driver.findElement(ProfilePageLocators.PROFILE_SECTION.getPath());
    }

    public PersonalComponent clickProfileSection() {
        getProfileSection().click();
        return new PersonalComponent(driver);
    }
}
