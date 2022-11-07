package com.telran.pages.elements;

import com.telran.pages.PageBase;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Collection;

public class UploadPage extends PageBase {

    public UploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "uploadFile")
    WebElement uploadFile;

    @FindBy(id = "uploadedFilePath")
    WebElement uploadedFilePath;


    public UploadPage perfomKeyEventUsingRobot() {
        clickWithRectangle(uploadFile,12,2);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        //code to enter d1
        robot.keyPress(KeyEvent.VK_SHIFT);
        pause(1000);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_X);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_ENTER);

        return this;
    }

    public String getPath() {
        return uploadedFilePath.getText();
    }

    public UploadPage perfomMouseEventUsingRobot() {
        pause(500);
        clickWithRectangle(uploadFile, 12, 2);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {

        }

        Dimension i = driver.manage().window().getSize();
        System.out.println("Dimension x and y: " + i.getWidth() + " " + i.getHeight());
        int x = i.getWidth() / 2 + 500;
        int y = i.getHeight() / 10 + 250;

        robot.mouseMove(x,y);
        pause(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        pause(1000);

        robot.keyPress(KeyEvent.VK_ENTER);
        pause(1000);


        return this;
    }
}
