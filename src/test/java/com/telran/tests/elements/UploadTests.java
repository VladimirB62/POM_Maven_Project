package com.telran.tests.elements;

import com.telran.pages.HomePage;
import com.telran.pages.SidePanelPage;
import com.telran.pages.elements.UploadPage;
import com.telran.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.event.KeyEvent;

public class UploadTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        new HomePage(driver).getElements();
        new SidePanelPage(driver).selectUploadAndDownload();
    }
    @Test
    public void robotKeyEventTest(){
        new UploadPage(driver).perfomKeyEventUsingRobot();
        Assert.assertTrue(new UploadPage(driver).getPath().contains("D1.txt"));
    }

    @Test
    public void robotMouseEventTest(){
        new UploadPage(driver).perfomMouseEventUsingRobot();
        Assert.assertTrue(new UploadPage(driver).getPath().contains("D1.txt"));
    }
}
