package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Page Object representing the Webview screen of the application
 */
public class WebScreen extends BaseScreen {

    public WebScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"LOADING...\")")
    private WebElement loadingText;

    @AndroidFindBy(accessibility = "Search (Ctrl+K)")
    private WebElement assertionWeb;

    /**
     * Verifies if the Web screen is successfully loaded
     * It waits for either the loading text or the search button to become visible
     * @return true if the screen is loaded, otherwise throws a TimeoutException.
     */
    public boolean isWebScreenLoaded() {
        wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOf(loadingText),
                ExpectedConditions.visibilityOf(assertionWeb)
        ));
        return true;
    }
}
