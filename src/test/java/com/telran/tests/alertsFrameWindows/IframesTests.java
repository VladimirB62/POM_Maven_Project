package com.telran.tests.alertsFrameWindows;

import com.telran.pages.HomePage;
import com.telran.pages.SidePanelPage;
import com.telran.pages.alertsFrameWindows.FramesPage;
import com.telran.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframesTests extends TestBase {

    @BeforeMethod
    public void emsurePrecondition() {
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanelPage(driver).selectFrames();
    }

    @Test
    public void returnListOfIframesTests(){
        new FramesPage(driver).returnListOfIFrames();
    }

    @Test
    public void switchToIframeByIndexTest(){
        new FramesPage(driver).switchToIframeByIndex(1);
    }

    @Test
    public void switchTOIFraneByIdTest() {
        new FramesPage(driver).switchTOIFraneById();
    }


}
