package com.rozetka.locators.product_list_page_locators;

import org.openqa.selenium.By;

public enum ProductListPageLocators {

    PRODUCTS(By.xpath("//a[@class='goods-tile__picture ng-star-inserted']")),
    PRODUCTS_TITLE(By.xpath("//h1[@class='catalog-heading ng-star-inserted']")),
    RELOAD_FIELD(By.xpath("//span[@class='sidebar-block__toggle-title'][1]"));

    private final By path;

    ProductListPageLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
