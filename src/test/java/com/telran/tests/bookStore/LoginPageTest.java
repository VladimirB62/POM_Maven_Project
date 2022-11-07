package com.telran.tests.bookStore;

import com.telran.data.UserData;
import com.telran.pages.HomePage;
import com.telran.pages.SidePanelPage;
import com.telran.pages.bookStore.LoginPage;
import com.telran.pages.bookStore.ProfilePage;
import com.telran.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).getBookStoreApp();
        new SidePanelPage(driver).clickOnLogin();
    }

    @Test
    public void loginPositivTest(){
        new LoginPage(driver).login(UserData.USER_NAME, UserData.USER_PASSWORD);
        new ProfilePage(driver).verifyUserName("arsLeon").logout();

    }
}