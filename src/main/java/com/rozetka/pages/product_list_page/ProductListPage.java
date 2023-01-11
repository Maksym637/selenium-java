package com.rozetka.pages.product_list_page;

import com.rozetka.locators.product_list_page_locators.ProductListPageLocators;
import com.rozetka.pages.base_page.BasePage;
import com.rozetka.pages.product_page.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductListPage extends BasePage {

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getProductsTitle() {
        waitForElementToAppear(ProductListPageLocators.PRODUCTS_TITLE.getPath());
        return driver.findElement(ProductListPageLocators.PRODUCTS_TITLE.getPath());
    }

    public String getProductsTitleText() {
        return getProductsTitle().getText();
    }

    public List<WebElement> getProducts() {
        waitForElementsToAppear(ProductListPageLocators.PRODUCTS.getPath());
        return driver.findElements(ProductListPageLocators.PRODUCTS.getPath());
    }

    public ProductPage clickProduct(int product_index) {
        waitForPageReload(ProductListPageLocators.RELOAD_FIELD.getPath());
        getProducts().get(product_index).click();
        return new ProductPage(driver);
    }
}