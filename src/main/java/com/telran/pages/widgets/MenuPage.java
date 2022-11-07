package com.telran.pages.widgets;

import com.telran.pages.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends PageBase {

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='Main Item 2']")
    WebElement mainItem2;

    @FindBy(xpath = "//a[.='SUB SUB LIST »']")
        WebElement subSubList;

    @FindBy(xpath = "//a[.='Sub Sub Item 2']")
        WebElement subSubItem2;

    public MenuPage moveToSubMenu() {

        Actions actions = new Actions(driver);
        pause(1000);
        //mouse hover menuOption 'Main Item 2'
        actions.moveToElement(mainItem2).perform();
        System.out.println("Done mouse hover on " + mainItem2.getText());
        //mouse hover menuOption 'SUB SUB LIST'
        actions.moveToElement(subSubList).perform();
        System.out.println("Done mouse hover on " + subSubList.getText());
        //mouse hover menuOption 'SUB SUB Item'
        actions.moveToElement(subSubList).perform();
        System.out.println("Done mouse hover on " + subSubItem2.getText());


        return this;
    }
}
