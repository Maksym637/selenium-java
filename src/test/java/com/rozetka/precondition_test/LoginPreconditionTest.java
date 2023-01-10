package com.rozetka.precondition_test;

import com.rozetka.base_test.BaseTest;
import com.rozetka.pages.login_page.LoginPage;
import org.testng.annotations.BeforeMethod;

import static com.rozetka.constants.Constant.Urls.LOGIN_PAGE;
import static com.rozetka.credentials.PrivateInformation.Credentials.EMAIL;
import static com.rozetka.credentials.PrivateInformation.Credentials.PASSWORD;

public class LoginPreconditionTest extends BaseTest {

    @BeforeMethod
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
}
