package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Page Object representing the Swipe screen of the application
 */
public class SwipeScreen extends BaseScreen{

    public SwipeScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe horizontal\")")
    private WebElement assertionSwipe;

    /**
     * Verifies if the Swipe screen title is visible
     * @return true if the title is displayed, otherwise throws a TimeoutException
     */
    public boolean isSwipeTitleVisible() {
        wait.until(ExpectedConditions.visibilityOf(assertionSwipe));
        return assertionSwipe.isDisplayed();
    }
}
