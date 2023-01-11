package com.rozetka.pages.product_page;

import com.rozetka.locators.product_page_locators.ProductPageLocators;
import com.rozetka.pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getProductDescription() {
        waitForElementToAppear(ProductPageLocators.PRODUCT_DESCRIPTION.getPath());
        return driver.findElement(ProductPageLocators.PRODUCT_DESCRIPTION.getPath());
    }

    public String getProductDescriptionText() {
        return getProductDescription().getText();
    }

    public WebElement getFeedbacks() {
        waitForElementToBeClickable(ProductPageLocators.FEEDBACKS_BUTTON.getPath());
        return driver.findElement(ProductPageLocators.FEEDBACKS_BUTTON.getPath());
    }

    public ProductPage clickFeedbacks() {
        getFeedbacks().click();
        return this;
    }

    public WebElement getWriteFeedback() {
        waitForElementToBeClickable(ProductPageLocators.WRITE_FEEDBACK_BUTTON.getPath());
        return driver.findElement(ProductPageLocators.WRITE_FEEDBACK_BUTTON.getPath());
    }

    public FeedbackComponent clickWriteFeedback() {
        waitForPageReload(ProductPageLocators.RELOAD_FIELD.getPath());
        getWriteFeedback().click();
        return new FeedbackComponent(driver);
    }
}
