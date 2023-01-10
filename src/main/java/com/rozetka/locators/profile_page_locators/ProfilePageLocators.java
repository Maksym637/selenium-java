package com.rozetka.locators.profile_page_locators;

import org.openqa.selenium.By;

public enum ProfilePageLocators {

    USER_NAMES(By.xpath("//p[@class='cabinet-user__name']")),
    PROFILE_SECTION(By.xpath("//h3[@class='personal-section__heading']"));

    private final By path;

    ProfilePageLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
