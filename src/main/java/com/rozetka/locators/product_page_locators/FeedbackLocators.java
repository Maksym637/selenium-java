package com.rozetka.locators.product_page_locators;

import org.openqa.selenium.By;

public enum FeedbackLocators {

    STAR_RATING(By.xpath("(//span[@class='stars__item ng-star-inserted'])[5]")),
    COMMENT_FIELD(By.id("comment-text")),
    LEAVE_FEEDBACK_BUTTON(By.xpath("//button[@class='button button--medium button--navy']")),
    THANK(By.xpath("//rz-thanks-modal//h4[@class='thanks-modal__heading']")),
    PROCESSING(By.xpath("//rz-thanks-modal//p[@class='thanks-modal__message']"));

    private final By path;

    FeedbackLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
