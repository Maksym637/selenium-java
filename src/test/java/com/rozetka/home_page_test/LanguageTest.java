package com.rozetka.home_page_test;

import com.rozetka.base_test.BaseTest;
import com.rozetka.pages.home_page.HomePage;
import com.rozetka.pages.home_page.LeftBarComponent;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageTest extends BaseTest {

    @Test
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
