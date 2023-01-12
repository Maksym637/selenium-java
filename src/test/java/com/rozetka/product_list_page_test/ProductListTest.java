package com.rozetka.product_list_page_test;

import com.rozetka.base_test.BaseTest;
import com.rozetka.pages.home_page.HomePage;
import com.rozetka.pages.product_list_page.ProductListPage;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com.rozetka.constants.Constant.Urls.COMPUTERS_PAGE;
import static com.rozetka.constants.Constant.Urls.HOME_PAGE;

public class ProductListTest extends BaseTest {

    private static final int TOTAL_PRODUCTS_TO_VIEW = 3;

    @Test
    @Issue("31")
    @Severity(SeverityLevel.MINOR)
    @Description("We need to check whether the viewed item is added to the" +
                 "\nsection 'Переглянуті товари'.")
    public void productsInViewedSection() {
        ProductListPage productListPage = new ProductListPage(driver);

        List<String> viewedProducts = new ArrayList<>();
        List<String> viewedProductsSection;

        for (int i = 0; i < TOTAL_PRODUCTS_TO_VIEW; i++) {
            productListPage.open(COMPUTERS_PAGE);
            viewedProducts.add(productListPage.clickProduct(i).getProductDescriptionText());
        }

        HomePage homePage = new HomePage(driver);
        homePage.open(HOME_PAGE);
        viewedProductsSection = homePage.getViewedProductsList();

        Assert.assertEquals(viewedProducts, viewedProductsSection);
    }
}
