package com.rozetka.locators.product_page_locators;

import org.openqa.selenium.By;

public enum ProductPageLocators {

    PRODUCT_DESCRIPTION(By.xpath("//h1[@class='product__title']")),
    FEEDBACKS_BUTTON(By.xpath("//a[@class='tabs__link' and text()=' Відгуки ']")),
    RELOAD_FIELD(By.xpath("//div[@class='product-comments__cta-heading']")),
    WRITE_FEEDBACK_BUTTON(By.xpath("//button[@class='button button--medium button--gray']"));

    private final By path;

    ProductPageLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
