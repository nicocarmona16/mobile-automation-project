package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Page Object representing the Menu modal of the application
 */
public class MenuScreen extends BaseScreen{

    public MenuScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Menu\")")
    private WebElement assertionMenu;

    /**
     * Verifies if the Menu title is visible
     * @return true if the title is displayed, otherwise throws a TimeoutException
     */
    public boolean isMenuTitleVisible() {
        wait.until(ExpectedConditions.visibilityOf(assertionMenu));
        return assertionMenu.isDisplayed();
    }
}
