package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Page Object representing the Home screen of the application
 */
public class HomeScreen extends BaseScreen{

    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Demo app for the appium-boilerplate\")")
    private WebElement assertionHome;

    /**
     * Verifies if the main Home screen title is visible
     * @return true if the element is displayed, otherwise throws a TimeoutException
     */
    public boolean isHomeTitleVisible() {
        wait.until(ExpectedConditions.visibilityOf(assertionHome));
        return assertionHome.isDisplayed();
    }
}
