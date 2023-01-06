package com.rozetka;

import com.rozetka.pages.home_page.HomePage;
import com.rozetka.pages.login_page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.rozetka.constants.Constant.Urls.LOGIN_PAGE;
import static com.rozetka.credentials.PrivateInformation.Credentials.EMAIL;
import static com.rozetka.credentials.PrivateInformation.Credentials.PASSWORD;

public class LogoutTest extends BaseTest {

    @Test
    public void loginIntoAccount() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(LOGIN_PAGE);
        loginPage
                .enterEmail(EMAIL)
                .enterPassword(PASSWORD)
                .clickLoginButton()
                .clickCaptchaButton()
                .clickLoginButtonConfirm();
    }

    @Test
    public void logoutValid() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getCookie(), EMAIL);
        homePage.clickLogoutButton();
        Assert.assertEquals(homePage.getCookie(), "deleted");
    }
}
