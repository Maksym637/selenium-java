package com.rozetka.pages.home_page;

import com.rozetka.locators.home_page_locators.HomePageLocators;
import com.rozetka.pages.base_page.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHamburgerButton() {
        waitForElementToBeClickable(HomePageLocators.HAMBURGER_BUTTON.getPath());
        return driver.findElement(HomePageLocators.HAMBURGER_BUTTON.getPath());
    }

    @Step("Move to the left top hamburger button and click on it.")
    public LeftBarComponent clickHamburgerButton() {
        getHamburgerButton().click();
        return new LeftBarComponent(driver);
    }

    public WebElement getListGoods() {
        waitForElementToAppear(HomePageLocators.LIST_GOODS.getPath());
        return driver.findElement(HomePageLocators.LIST_GOODS.getPath());
    }

    public String getListGoodsText() {
        return getListGoods().getText();
    }

    public List<WebElement> getViewedProducts() {
        waitForElementsToAppear(HomePageLocators.VIEWED_PRODUCT.getPath());
        return driver.findElements(HomePageLocators.VIEWED_PRODUCT.getPath());
    }

    @Step("Get viewed products collection.")
    public List<String> getViewedProductsList() {
        List<String> viewedProducts;
        viewedProducts = getViewedProducts()
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        Collections.reverse(viewedProducts);
        return viewedProducts;
    }

    public String getCookie() {
        return driver.manage().getCookieNamed("login").getValue();
    }

    public WebElement getLogoutButton() {
        waitForElementToBeClickable(HomePageLocators.LOGOUT_BUTTON.getPath());
        return driver.findElement(HomePageLocators.LOGOUT_BUTTON.getPath());
    }

    @Step("Scroll down and on the left side, navigate" +
          "\to the 'Вихід' button and click on it.")
    public HomePage clickLogoutButton() {
        getLogoutButton().click();
        return this;
    }
}
