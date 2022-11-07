package com.telran.pages.elements;

import com.telran.pages.PageBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TextBoxPage extends PageBase {

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;


    public TextBoxPage keyBoardEvent() {

        Actions actions = new Actions(driver);
        type(userName, "Gus Hiddink");
        type(userEmail, "gushiddink@gmail.com");
        typeWithJSExecutor(currentAddress, "Alteotting 84503", 0, 200);
        //select the current address
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        //copy the current address
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        //press tab key to switch focus to permanent address
        actions.sendKeys(Keys.TAB).perform();
        //past the address in the permanent address field
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

//        var cAddress = currentAddress.getAttribute("value");
//        System.out.println("Value of attribute:  " + cAddress);
//
//        var pAddress = permanentAddress.getAttribute("value");
//        System.out.println("Value of attribute:  " + pAddress);
//        Assert.assertEquals(cAddress,pAddress);

        return this;
    }

    public String getAttribute() {
        return currentAddress.getAttribute("value");
    }
}
