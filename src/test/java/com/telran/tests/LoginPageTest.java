package com.telran.tests;

import com.telran.data.UserData;
import com.telran.pages.HomePage;
import com.telran.pages.LoginPage;
import com.telran.pages.ProfilePage;
import com.telran.pages.SidePanelPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).openBookStoreApp();
        new SidePanelPage(driver).clickOnLogin();
    }

    @Test
    public void loginPositivTest(){
        new LoginPage(driver).login(UserData.USER_NAME, UserData.USER_PASSWORD);
        new ProfilePage(driver).verifyUserName("arsLeon").logout();

    }
}
