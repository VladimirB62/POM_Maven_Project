package com.telran.pages.alertsFrameWindows;

import com.telran.pages.PageBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collection;

public class AlertsPage extends PageBase {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id ="timerAlertButton")
    WebElement timerAlertButtopn;

    public AlertsPage clickOnTimerAlertButton() {
        click(timerAlertButtopn);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
        String alertmessage = myAlert.getText();
        System.out.println(alertmessage);
        myAlert.accept();
        return this;
    }

    @FindBy(id = "confirmButton")
    WebElement confirmButton;

    public AlertsPage clickOnConfirmButton(String text) {
        click(confirmButton);
        if (text != null && text.equals(("OK"))){
            driver.switchTo().alert().accept();
        }else if (text != null && text.equals(("Cancel"))){
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id ="confirmResult")
    WebElement confirmResult;

    public String getConfirmResult() {
        return confirmResult.getText();
    }
    
    @FindBy(id = "promtButton")
    WebElement promtButton;

    public AlertsPage clickMessageAlertButton(String message) {
        clickWithJSExecutor(promtButton, 0, 100);
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
        }
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(id = "promptResult")
    WebElement promptResult;

    public String getConfirmMessageResult() {
        return promptResult.getText();
    }
}
