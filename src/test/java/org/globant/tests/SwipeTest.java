package org.globant.tests;

import org.globant.screens.NavigationScreen;
import org.globant.screens.SwipeScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test class for validating the Swipe functionality
 */
public class SwipeTest extends BaseTest {

    private SwipeScreen swipeScreen;

    /**
     * Precondition: Navigates to the Swipe section before executing the test
     */
    @BeforeMethod
    public void navigateToSwipe() {
        NavigationScreen navigationScreen = new NavigationScreen(appiumDriver);
        swipeScreen = navigationScreen.clickSwipe();
    }

    /**
     * Scenario 4: Swipe Cards
     * Verifies that a horizontal swipe hides the previous cards, the last card is visible, and a vertical swipe reveals the hidden text at the bottom
     */
    @Test(testName = "Swipe horizontal through cards and vertical to find text")
    public void testSwipeCards() {

        Assert.assertTrue(swipeScreen.isSwipeTitleVisible(), "The Swipe title is not visible");

        Assert.assertTrue(swipeScreen.isCard1Visible(), "Card 1 is not visible at the beginning");

        swipeScreen.swipeHorizontal();
        Assert.assertTrue(swipeScreen.isCard1Hidden(), "Card 1 (FULLY OPEN SOURCE) isn't hidden after swipe");

        swipeScreen.swipeHorizontal();
        Assert.assertTrue(swipeScreen.isCard2Hidden(), "Card 2 (GREAT COMMUNITY) isn't hidden after swipe");

        swipeScreen.swipeHorizontal();
        Assert.assertTrue(swipeScreen.isCard3Hidden(), "Card 3 (JS.FOUNDATION) isn't hidden after swipe");

        swipeScreen.swipeHorizontal();
        Assert.assertTrue(swipeScreen.isCard4Hidden(), "Card 4 (SUPPORT VIDEOS) isn't hidden after swipe");

        swipeScreen.swipeHorizontal();
        Assert.assertTrue(swipeScreen.isCard5Hidden(), "Card 5 (EXTENDABLE) isn't hidden after swipe");

        Assert.assertTrue(swipeScreen.isCard6Visible(), "Card 6 (COMPATIBLE) isn't visible at the end of the carousel");

        swipeScreen.scrollDownToSecretText();
        Assert.assertTrue(swipeScreen.isSecretTextVisible(), "The secret text 'You found me!!!' isn't found");
    }
}