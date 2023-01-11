package com.rozetka.locators.profile_page_locators;

import org.openqa.selenium.By;

public enum PersonalDataLocators {

    EDIT_BUTTON(By.xpath("//button[@class='button button--medium button--green personal-data__edit']")),
    FIRST_NAME(By.id("firstName")),
    LAST_NAME(By.id("lastName")),
    RELOAD_FIELD(By.xpath("(//p[@class='personal-data__value ng-star-inserted'])[3]")),
    SAVE_BUTTON(By.xpath("//button[@class='button button--medium button--green']"));

    private final By path;

    PersonalDataLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
