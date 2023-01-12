package com.rozetka.pages.product_page;

import com.rozetka.locators.product_page_locators.FeedbackLocators;
import com.rozetka.pages.base_page.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FeedbackComponent extends BasePage {

    public FeedbackComponent(WebDriver driver) {
        super(driver);
    }

    public WebElement getStarRating() {
        waitForElementToAppear(FeedbackLocators.STAR_RATING.getPath());
        return driver.findElement(FeedbackLocators.STAR_RATING.getPath());
    }

    @Step("Evaluate a product with the star rating.")
    public FeedbackComponent clickStarRating() {
        getStarRating().click();
        return this;
    }

    public WebElement getComment() {
        waitForElementToBeClickable(FeedbackLocators.COMMENT_FIELD.getPath());
        return driver.findElement(FeedbackLocators.COMMENT_FIELD.getPath());
    }

    @Step("Fill the 'Коментар' field with the comment.")
    public FeedbackComponent enterComment(String comment) {
        getComment().click();
        getComment().clear();
        getComment().sendKeys(comment);
        return this;
    }

    public WebElement getLeaveFeedback() {
        waitForElementToBeClickable(FeedbackLocators.LEAVE_FEEDBACK_BUTTON.getPath());
        return driver.findElement(FeedbackLocators.LEAVE_FEEDBACK_BUTTON.getPath());
    }

    @Step("Click on the 'Залишити відгук' button.")
    public FeedbackComponent clickLeaveFeedback() {
        getLeaveFeedback().click();
        return this;
    }

    public WebElement getThankField() {
        waitForElementToAppear(FeedbackLocators.THANK.getPath());
        return driver.findElement(FeedbackLocators.THANK.getPath());
    }

    @Step("Get a thank message.")
    public String getThankFiledText() {
        return getThankField().getText();
    }

    public WebElement getProcessingField() {
        waitForElementToAppear(FeedbackLocators.PROCESSING.getPath());
        return driver.findElement(FeedbackLocators.PROCESSING.getPath());
    }

    @Step("Get a processing message.")
    public String getProcessingFieldText() {
        return getProcessingField().getText().substring(0, 10);
    }
}
