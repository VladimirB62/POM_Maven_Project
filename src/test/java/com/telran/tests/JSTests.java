package com.telran.tests;

import com.telran.data.UserData;
import com.telran.pages.HomePage;
import com.telran.pages.JSExecutor;
import com.telran.pages.SidePanelPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSTests extends TestBase{



    @Test
    public void registerWithJSETest() {
        new HomePage(driver).getElements();
        new SidePanelPage(driver).selectTextBox();
        new JSExecutor(driver).enterNameAndEmailWithJSE(UserData.USER_NAME, UserData.USER_EMAIL)
                .clickOnSubmitButtonWithJSE();
    }

    @Test
    public void checkBoxWithJSE() {
        //new HomePage(driver).getForms();
        //new SidePanelPage(driver).selectPracticeForm();
        new JSExecutor(driver).checkBoxWithJSE().refreshWithJSE().getTitleWithJSE().getURLPageWithJSE().scrollWithJSE();

    }
}
