package org.globant.tests;

import net.datafaker.Faker;
import org.globant.screens.LoginScreen;
import org.globant.screens.NavigationScreen;
import org.globant.screens.SignUpScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test class for validating the Login functionality
 */
public class LoginTest extends BaseTest{

    private LoginScreen loginScreen;
    private String validEmail;
    private String validPassword;

    /**
     * Precondition: User is on the Login section, with a previously created user
     */
    @BeforeMethod
    public void setupUserAndNavigateToLogin() {
        Faker faker = new Faker();
        validEmail = faker.internet().emailAddress();
        validPassword = faker.internet().password(8, 15, true, true, true);

        NavigationScreen navigationScreen = new NavigationScreen(appiumDriver);
        loginScreen = navigationScreen.clickLogin();

        SignUpScreen signUpScreen = loginScreen.clickSignUpTab();
        signUpScreen
                .enterEmail(validEmail)
                .enterPassword(validPassword)
                .enterRepeatPassword(validPassword)
                .clickSignUpButton();

        signUpScreen.clickOkOnSuccessDialog();
        loginScreen.tapLoginTab();
    }

    /**
     * Scenario 3: Successful Login
     * Fills out the login form and verifies success
     */
    @Test(testName = "Successful Login with previously created user")
    public void testSuccessfulLogin() {
        loginScreen
                .enterEmail(validEmail)
                .enterPassword(validPassword)
                .clickLoginButton();

        Assert.assertTrue(loginScreen.isLoginSuccessful(), "The login success message isn't displayed");
        loginScreen.clickOkOnSuccessDialog();
    }
}
