package com.rozetka.home_page_test;

import com.rozetka.base_test.BaseTest;
import com.rozetka.pages.home_page.HomePage;
import com.rozetka.pages.home_page.LeftBarComponent;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageTest extends BaseTest {

    @Test
    @Issue("28")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test case verifies that the text on the left panel elements is" +
                 "\ntranslated into the chosen language after switching the language toggle.")
    public void fromUkrainianToRussian() {
        HomePage homePage = new HomePage(driver);
        LeftBarComponent leftBarFirstClick, leftBarSecondClick;

        leftBarFirstClick = homePage.clickHamburgerButton();

        Assert.assertEquals(leftBarFirstClick.getLanguageText(), "Мова");
        Assert.assertEquals(leftBarFirstClick.getCityText(), "Місто");

        leftBarFirstClick.clickRuButton();

        leftBarSecondClick = homePage.clickHamburgerButton();

        Assert.assertEquals(leftBarSecondClick.getLanguageText(), "Язык");
        Assert.assertEquals(leftBarSecondClick.getCityText(), "Город");
    }
}
