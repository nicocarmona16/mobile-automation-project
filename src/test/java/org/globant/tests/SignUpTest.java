package org.globant.tests;

import net.datafaker.Faker;
import org.globant.screens.LoginScreen;
import org.globant.screens.NavigationScreen;
import org.globant.screens.SignUpScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test class for validating the Sign-Up functionality
 */
public class SignUpTest extends BaseTest{

    private SignUpScreen signUpScreen;

    /**
     * Precondition: Navigates to the Sign-Up section before executing the test
     */
    @BeforeMethod
    public void navigateToSignUp() {
        NavigationScreen navigationScreen = new NavigationScreen(appiumDriver);
        LoginScreen loginScreen = navigationScreen.clickLogin();
        signUpScreen = loginScreen.clickSignUpTab();
    }

    /**
     * Scenario 2: Successful Sign Up
     * Fills out the signup form with random data and verifies success
     */
    @Test(testName = "Successful Sign Up with random data")
    public void testSuccessfulSignUp() {
        Faker faker = new Faker();
        String randomEmail = faker.internet().emailAddress();
        String randomPassword = faker.internet().password(8, 15, true, true, true);

        signUpScreen
                .enterEmail(randomEmail)
                .enterPassword(randomPassword)
                .enterRepeatPassword(randomPassword)
                .clickSignUpButton();

        Assert.assertTrue(signUpScreen.isSignUpSuccessful(), "The signup success message isn't displayed");
        signUpScreen.clickOkOnSuccessDialog();
    }
}
