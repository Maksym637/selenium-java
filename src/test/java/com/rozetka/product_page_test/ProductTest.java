package com.rozetka.product_page_test;

import com.rozetka.pages.product_list_page.ProductListPage;
import com.rozetka.pages.product_page.FeedbackComponent;
import com.rozetka.precondition_test.LoginPreconditionTest;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.rozetka.constants.Constant.Urls.NOTEBOOKS_PAGE;

public class ProductTest extends LoginPreconditionTest {

    private static final int PRODUCT_NUMBER = 0;
    private static final String COMMENT_TO_LEAVE = "Якісний товар !";

    @Test
    @Issue("30")
    @Severity(SeverityLevel.NORMAL)
    @Description("We need to verify the functionality of leaving the feedback to" +
                 "\nthe product using valid data.")
    public void leaveFeedbackValid() {
        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.open(NOTEBOOKS_PAGE);

        FeedbackComponent productFeedback;

        productFeedback = productListPage
                .clickProduct(PRODUCT_NUMBER)
                .clickFeedbacks()
                .clickWriteFeedback()
                .clickStarRating()
                .enterComment(COMMENT_TO_LEAVE)
                .clickLeaveFeedback();

        Assert.assertEquals(productFeedback.getThankFiledText(), "Дякуємо!");
        Assert.assertEquals(productFeedback.getProcessingFieldText(), "Ваш відгук");
    }
}
