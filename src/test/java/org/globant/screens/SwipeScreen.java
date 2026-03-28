package org.globant.screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;

/**
 * Page Object representing the Swipe screen of the application
 * Contains methods to interact with the carousel cards and perform scroll actions
 */
public class SwipeScreen extends BaseScreen {

    public SwipeScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe horizontal\")")
    private WebElement assertionSwipe;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"FULLY OPEN SOURCE\")")
    private WebElement card1;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"GREAT COMMUNITY\")")
    private WebElement card2;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"JS.FOUNDATION\")")
    private WebElement card3;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"SUPPORT VIDEOS\")")
    private WebElement card4;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"EXTENDABLE\")")
    private WebElement card5;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"COMPATIBLE\")")
    private WebElement card6;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"You found me!!!\")")
    private WebElement secretText;

    /**
     * Verifies if the Swipe screen title is visible
     * @return true if the title is displayed, otherwise false
     */
    public boolean isSwipeTitleVisible() {
        wait.until(ExpectedConditions.visibilityOf(assertionSwipe));
        return assertionSwipe.isDisplayed();
    }

    /**
     * Verifies if Card 1 is visible on the screen
     * @return true if visible, otherwise false
     */
    public boolean isCard1Visible() {
        try {
            wait.until(ExpectedConditions.visibilityOf(card1));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Verifies if Card 6 (the last card) is visible on the screen
     * @return true if visible, otherwise false
     */
    public boolean isCard6Visible() {
        try {
            wait.until(ExpectedConditions.visibilityOf(card6));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Verifies if the secret text at the bottom is visible
     * @return true if visible, otherwise false
     */
    public boolean isSecretTextVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOf(secretText));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Generic method to check if a specific card is hidden
     * @param card The WebElement representing the card to check
     * @return true if the card is completely hidden, otherwise false
     */
    private boolean isCardHidden(WebElement card) {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ZERO);
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(2));
            shortWait.until(ExpectedConditions.invisibilityOf(card));
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }

    public boolean isCard1Hidden() { return isCardHidden(card1); }
    public boolean isCard2Hidden() { return isCardHidden(card2); }
    public boolean isCard3Hidden() { return isCardHidden(card3); }
    public boolean isCard4Hidden() { return isCardHidden(card4); }
    public boolean isCard5Hidden() { return isCardHidden(card5); }

    /**
     * Performs a horizontal swipe
     * @return This SwipeScreen instance for method chaining
     */
    public SwipeScreen swipeHorizontal() {
        int screenWidth = driver.manage().window().getSize().width;
        int screenHeight = driver.manage().window().getSize().height;

        int startX = (int) (screenWidth * 0.92);
        int endX = (int) (screenWidth * 0.01);
        int startY = screenHeight / 2;

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endX, startY));
        swipe.addAction(new org.openqa.selenium.interactions.Pause(finger, Duration.ofMillis(200)));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(swipe));
        try { Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    /**
     * Scrolls down vertically
     * @return This SwipeScreen instance for method chaining.
     */
    public SwipeScreen scrollDownToSecretText() {
        String uiAutomatorScript = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"You found me!!!\"))";
        driver.findElement(AppiumBy.androidUIAutomator(uiAutomatorScript));
        return this;
    }
}