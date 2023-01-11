package com.rozetka.profile_page_test;

import com.rozetka.pages.profile_page.PersonalComponent;
import com.rozetka.pages.profile_page.ProfilePage;
import com.rozetka.precondition_test.LoginPreconditionTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.rozetka.constants.Constant.Urls.PROFILE_PAGE;

public class ProfileTest extends LoginPreconditionTest {

    private static final String NEW_FIRST_NAME = "НовіДані";
    private static final String NEW_LAST_NAME = "НовіДані";

    @Test
    public void updateProfileValid() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.open(PROFILE_PAGE);

        PersonalComponent renewalPage;

        String oldFirstName = profilePage.getUserNamesText()[0],
                oldLastName = profilePage.getUserNamesText()[1];

        renewalPage = profilePage
                .clickProfileSection()
                .clickEditButton()
                .enterFirstName(NEW_FIRST_NAME)
                .enterLastName(NEW_LAST_NAME)
                .clickSaveButton();

        Assert.assertEquals(profilePage.getUserNamesText()[0], NEW_FIRST_NAME);
        Assert.assertEquals(profilePage.getUserNamesText()[1], NEW_LAST_NAME);

        renewalPage
                .clickEditButton()
                .enterFirstName(oldFirstName)
                .enterLastName(oldLastName)
                .clickSaveButton();

        Assert.assertEquals(profilePage.getUserNamesText()[0], oldFirstName);
        Assert.assertEquals(profilePage.getUserNamesText()[1], oldLastName);
    }
}
