package com.rozetka.profile_page_test;

import com.rozetka.pages.profile_page.PersonalComponent;
import com.rozetka.pages.profile_page.ProfilePage;
import com.rozetka.precondition_test.LoginPreconditionTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.rozetka.constants.Constant.Urls.PROFILE_PAGE;

public class ProfileTest extends LoginPreconditionTest {

    @Test
    public void updateProfileValid() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.open(PROFILE_PAGE);

        PersonalComponent renewalPage;

        String oldFirstName = profilePage.getUserNamesText()[0],
                oldLastName = profilePage.getUserNamesText()[1];

        String newFirstName = "НовіДані", newLastName = "НовіДані";

        renewalPage = profilePage
                .clickProfileSection()
                .clickEditButton()
                .enterFirstName(newFirstName)
                .enterLastName(newLastName)
                .clickSaveButton();

        Assert.assertEquals(profilePage.getUserNamesText()[0], newFirstName);
        Assert.assertEquals(profilePage.getUserNamesText()[1], newLastName);

        renewalPage
                .clickEditButton()
                .enterFirstName(oldFirstName)
                .enterLastName(oldLastName)
                .clickSaveButton();

        Assert.assertEquals(profilePage.getUserNamesText()[0], oldFirstName);
        Assert.assertEquals(profilePage.getUserNamesText()[1], oldLastName);
    }
}
