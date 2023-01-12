package com.rozetka.pages.product_page;

import com.rozetka.locators.product_page_locators.ProductPageLocators;
import com.rozetka.pages.base_page.BasePage;
import io.qameta.allure.Step;
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

    @Step("Get the product description.")
    public String getProductDescriptionText() {
        return getProductDescription().getText();
    }

    public WebElement getFeedbacks() {
        waitForElementToBeClickable(ProductPageLocators.FEEDBACKS_BUTTON.getPath());
        return driver.findElement(ProductPageLocators.FEEDBACKS_BUTTON.getPath());
    }

    @Step("Click on the 'Відгуки' button.")
    public ProductPage clickFeedbacks() {
        getFeedbacks().click();
        return this;
    }

    public WebElement getWriteFeedback() {
        waitForElementToBeClickable(ProductPageLocators.WRITE_FEEDBACK_BUTTON.getPath());
        return driver.findElement(ProductPageLocators.WRITE_FEEDBACK_BUTTON.getPath());
    }

    @Step("After that press on the 'Написати відгук' button.")
    public FeedbackComponent clickWriteFeedback() {
        waitForPageReload(ProductPageLocators.RELOAD_FIELD.getPath());
        getWriteFeedback().click();
        return new FeedbackComponent(driver);
    }
}
