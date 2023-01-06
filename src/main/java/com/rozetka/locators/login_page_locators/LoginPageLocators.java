package com.rozetka.locators.login_page_locators;

import org.openqa.selenium.By;

public enum LoginPageLocators {

    EMAIL(By.id("auth_email")),
    PASSWORD(By.id("auth_pass")),
    SUBMIT_BUTTON(By.xpath("//button[@class='button button--large button--green auth-modal__submit ng-star-inserted']")),
    CAPTCHA_BUTTON(By.id("ngrecaptcha-0"));

    private final By path;

    LoginPageLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
