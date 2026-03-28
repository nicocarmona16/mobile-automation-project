package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SwipeScreen extends BaseScreen{

    public SwipeScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe horizontal\")")
    private WebElement assertionSwipe;

    public boolean isSwipeTitleVisible() {
        wait.until(ExpectedConditions.visibilityOf(assertionSwipe));
        return assertionSwipe.isDisplayed();
    }
}
