package org.globant.tests;

import org.globant.screens.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test(testName = "Navigation through all bottom menu tabs")
    public void testBottomNavigation() {

        NavigationScreen navigationScreen = new NavigationScreen(appiumDriver);
        HomeScreen homeScreen = new HomeScreen(appiumDriver);
        Assert.assertTrue(homeScreen.isHomeTitleVisible(), "The main element of Home isn't visible");

        WebScreen webScreen = navigationScreen.clickWeb();
        Assert.assertTrue(webScreen.isWebScreenLoaded(), "The Web search button isn't visible");

        LoginScreen loginScreen = navigationScreen.clickLogin();
        Assert.assertTrue(loginScreen.isLoginButtonVisible(), "The Login button isn't visible");

        FormsScreen formsScreen = navigationScreen.clickForms();
        Assert.assertTrue(formsScreen.isFormsTitleVisible(), "The Forms title isn't visible");

        SwipeScreen swipeScreen = navigationScreen.clickSwipe();
        Assert.assertTrue(swipeScreen.isSwipeTitleVisible(), "The Swipe title isn't visible");

        DragScreen dragScreen = navigationScreen.clickDrag();
        Assert.assertTrue(dragScreen.isDragTitleVisible(), "The Drag title isn't visible");

        MenuScreen menuScreen = navigationScreen.clickMenu();
        Assert.assertTrue(menuScreen.isMenuTitleVisible(), "The menu title isn't visible");
    }
}
