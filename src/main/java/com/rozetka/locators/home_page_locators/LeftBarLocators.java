package com.rozetka.locators.home_page_locators;

import org.openqa.selenium.By;

public enum LeftBarLocators {

    RU_BUTTON(By.xpath("//nav//a[contains(text(), 'RU')]")),
    LANGUAGE_TEXT(By.xpath("(//p[@class='side-menu__switch-label ng-tns-c95-1'])[1]")),
    CITY_TEXT(By.xpath("(//p[@class='side-menu__switch-label ng-tns-c95-1'])[2]"));

    private final By path;

    LeftBarLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
