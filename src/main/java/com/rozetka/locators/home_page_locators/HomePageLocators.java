package com.rozetka.locators.home_page_locators;

import org.openqa.selenium.By;

public enum HomePageLocators {

    LIST_GOODS(By.xpath("//button[@class='button button--medium button--with-icon menu__toggle ng-star-inserted']")),
    LOGOUT_BUTTON(By.xpath("//li//a[contains(text(), 'Вихід')]")),
    HAMBURGER_BUTTON(By.xpath("//button[@class='header__button ng-tns-c95-1']")),
    VIEWED_TITLE(By.xpath("//h2[@class='main-goods__heading ng-star-inserted']")),
    VIEWED_PRODUCT(By.xpath("//a[@class='tile__title']"));

    private final By path;

    HomePageLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
