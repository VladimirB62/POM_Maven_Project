package com.telran.pages.widgets;

import com.telran.pages.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ToolTipsPage extends PageBase {

    public ToolTipsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id ="toolTipButton")
    WebElement toolTipButton;

    @FindBy(css = ".tooltip-inner")
    WebElement buttonToolTip;

    public ToolTipsPage hoverToolTipWithAttribute() {
        click(toolTipButton);

        String actualToolTip = buttonToolTip.getText();
        System.out.println("Retrived tooltip as: " + actualToolTip);
        String expectedToolTip = "You hovered over the Button";
        if(actualToolTip.equals(expectedToolTip)){
            System.out.println("PASS");
        }else System.out.println("FAIL");
        return this;
    }

    @FindBy(xpath = "//a[.='Contrary']")
    WebElement contraryTexToolTipsLink;

    @FindBy(id = "contraryTexToolTip")
    WebElement contraryTexToolTipId;

    @FindBy(xpath = "//a[.='1.10.32']")
    WebElement sectionToolTipLink;

    @FindBy(id = "sectionToolTip")
    WebElement sectionToolTipId;

    public ToolTipsPage findTextToolTips() {
        hideAd();
        pause(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(contraryTexToolTipsLink).perform();
        pause(500);
        String actualToolTip = contraryTexToolTipId.getText();
        System.out.println("Retrived tooltip as: " + actualToolTip);
        String expectedToolTip = "You hovered over the Contrary";
        if (actualToolTip.equals(expectedToolTip)) System.out.println("pass");
        else System.out.println("fail");

        actions.moveToElement(sectionToolTipLink).perform();
        pause(500);
        String actualToolTip1 = sectionToolTipId.getText();
        System.out.println("Retrived tooltip as: " + actualToolTip1);
        String expectedToolTip1 = "You hovered over the 1.10.32";
        if (actualToolTip1.equals(expectedToolTip1)) System.out.println("pass");
        else System.out.println("fail");
        return this;
    }


}
