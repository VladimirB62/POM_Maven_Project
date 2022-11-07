package com.telran.pages.interactions;

import com.telran.pages.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends PageBase {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "draggable")
    WebElement draggable;

    @FindBy(id = "droppable")
    WebElement droppable;

    public DragAndDropPage actionDragMe() {
        Actions actions = new Actions(driver);
        pause(2000);
        actions.dragAndDrop(draggable,droppable).perform();
        var textTo = droppable.getText();
        if (textTo.equals("Dropped!")){
            System.out.println("PASS: Source is dropped to target as expected");
        }else{
            System.out.println("FAIL: Source couldn't be dropped as expected");
        }

        return this;
    }

    public DragAndDropPage dragAndDropBy() {
        Actions actions = new Actions(driver);

        var xOffSet = draggable.getLocation().getX();
        var yOffSet = draggable.getLocation().getY();
        System.out.println("xOffSet-->" + xOffSet + "yOffSet-->" + yOffSet);

        var xOffSet1 = droppable.getLocation().getX();
        var yOffSet1 = droppable.getLocation().getY();
        System.out.println("xOffSet-->" + xOffSet + "yOffSet-->" + yOffSet);

        pause(2000);

        xOffSet1 = (xOffSet1 - xOffSet) + 30;
        yOffSet1 = (yOffSet1 - yOffSet) + 60;

        pause(1000);

        actions.dragAndDropBy(draggable,xOffSet1,yOffSet1).perform();
        var textTo = droppable.getText();
        if (textTo.equals("Dropped!")){
            System.out.println("PASS: Source is dropped to target as expected");
        }else{
            System.out.println("FAIL: Source couldn't be dropped as expected");
        }

        return this;
    }

    public DragAndDropPage dragAndDropByIndex(int x, int y) {
        Actions actions = new Actions(driver);
        pause(1000);
        actions.dragAndDropBy(draggable, x, y).perform();
        return this;
    }
}
