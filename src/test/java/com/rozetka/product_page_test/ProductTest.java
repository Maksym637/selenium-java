package com.rozetka.product_page_test;

import com.rozetka.pages.product_list_page.ProductListPage;
import com.rozetka.pages.product_page.FeedbackComponent;
import com.rozetka.precondition_test.LoginPreconditionTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.rozetka.constants.Constant.Urls.NOTEBOOKS_PAGE;

public class ProductTest extends LoginPreconditionTest {

    private static final int PRODUCT_NUMBER = 0;
    private static final String COMMENT_TO_LEAVE = "Якісний товар !";

    @Test
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
