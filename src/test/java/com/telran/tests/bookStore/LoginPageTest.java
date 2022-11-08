package com.telran.tests.bookStore;

import com.telran.data.UserData;
import com.telran.pages.HomePage;
import com.telran.pages.SidePanelPage;
import com.telran.pages.bookStore.LoginPage;
import com.telran.pages.bookStore.ProfilePage;
import com.telran.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).getBookStoreApp();
        new SidePanelPage(driver).clickOnLogin();
    }

    @Test (enabled = false)
    public void loginPositiveTest(){
        new LoginPage(driver).login(UserData.USER_NAME, UserData.USER_PASSWORD);
        new ProfilePage(driver).verifyUserName(UserData.USER_NAME).logout();
    }


    @Test
    @Parameters({"name","password"})
    public void loginPositivTest(String username, String password){
        new LoginPage(driver).login(username,password);
        new ProfilePage(driver).verifyUserName("arsLeon").logout();
    }
}
