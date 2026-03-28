package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Page Object representing the Drag and Drop screen of the application
 */
public class DragScreen extends BaseScreen{

    public DragScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drag and Drop\")")
    private WebElement assertionDrag;

    /**
     * Verifies if the Drag and Drop screen title is visible
     * @return true if the title is displayed, otherwise throws a TimeoutException
     */
    public boolean isDragTitleVisible() {
        wait.until(ExpectedConditions.visibilityOf(assertionDrag));
        return assertionDrag.isDisplayed();
    }
}
