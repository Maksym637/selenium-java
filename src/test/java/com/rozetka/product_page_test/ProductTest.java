package com.rozetka.product_page_test;

import com.rozetka.pages.product_list_page.ProductListPage;
import com.rozetka.pages.product_page.FeedbackComponent;
import com.rozetka.precondition_test.LoginPreconditionTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.rozetka.constants.Constant.Urls.NOTEBOOKS_PAGE;

public class ProductTest extends LoginPreconditionTest {

    @Test
    public void leaveFeedbackValid() {
        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.open(NOTEBOOKS_PAGE);

        FeedbackComponent productFeedback;

        int productNumber = 0;
        String comment = "Якісний товар !";

        productFeedback = productListPage
                .clickProduct(productNumber)
                .clickFeedbacks()
                .clickWriteFeedback()
                .clickStarRating()
                .enterComment(comment)
                .clickLeaveFeedback();

        Assert.assertEquals(productFeedback.getThankFiledText(), "Дякуємо!");
        Assert.assertEquals(productFeedback.getProcessingFieldText(), "Ваш відгук");
    }
}
