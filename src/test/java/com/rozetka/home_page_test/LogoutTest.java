package com.rozetka.home_page_test;

import com.rozetka.pages.home_page.HomePage;
import com.rozetka.precondition_test.LoginPreconditionTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.rozetka.constants.Constant.Urls.HOME_PAGE;
import static com.rozetka.credentials.PrivateInformation.Credentials.EMAIL;

public class LogoutTest extends LoginPreconditionTest {

    @Test
    public void logoutValid() {
        HomePage homePage = new HomePage(driver);
        homePage.open(HOME_PAGE);

        Assert.assertEquals(homePage.getListGoodsText(), "Каталог");
        Assert.assertEquals(homePage.getCookie(), EMAIL);

        homePage.clickLogoutButton();

        Assert.assertEquals(homePage.getListGoodsText(), "Каталог");
        Assert.assertEquals(homePage.getCookie(), "deleted");
    }
}
