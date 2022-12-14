package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//h5[contains(.,'Book Store Application')]")
    WebElement element;
    public SidePanelPage getBookStoreApp() {
        clickWithJSExecutor(element, 0, 600);
        return new SidePanelPage(driver);
    }

    @FindBy(xpath = "//div[.='Alerts, Frame & Windows']")
    WebElement alertsFrameWindows;

    public SidePanelPage getAlertsFrameWindows() {
        clickWithJSExecutor(alertsFrameWindows, 0, 300);
        return new SidePanelPage(driver);
    }

    @FindBy(xpath = "//div[.='Elements']")
    WebElement elements;

    public SidePanelPage getElements() {
        clickWithJSExecutor(elements, 0, 300);
        return new SidePanelPage(driver);

    }

    @FindBy(xpath = "//div[.='Widgets']")
    WebElement widgets;


    public SidePanelPage getWidgets() {
        clickWithJSExecutor(widgets, 0, 300);
        return new SidePanelPage(driver);
    }

    @FindBy(xpath = "//div[.='Interactions']")
    WebElement interactions;

    public SidePanelPage getInteractions() {
        clickWithJSExecutor(interactions, 0, 300);
        return new SidePanelPage(driver);
    }

    @FindBy(xpath = "//div[@class='category-cards']/div[2]")
    WebElement forms;

    public SidePanelPage getForms() {
        clickWithJSExecutor(forms,0,300);
        return  new SidePanelPage(driver);
    }
}
