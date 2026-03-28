package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Page Object representing the Login screen of the application
 */
public class LoginScreen extends BaseScreen {

    public LoginScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "button-LOGIN")
    private WebElement assertionLogin;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign up\")")
    private WebElement tabSignUp;

    /**
     * Verifies if the Login button is visible on the screen
     * @return true if the login button is displayed, otherwise throws a TimeoutException
     */
    public boolean isLoginButtonVisible() {
        wait.until(ExpectedConditions.visibilityOf(assertionLogin));
        return assertionLogin.isDisplayed();
    }

    /**
     * Click on the Sign-Up tab to switch to the registration form
     * @return A new instance of {@link SignUpScreen}.
     */
    public SignUpScreen clickSignUpTab() {
        wait.until(ExpectedConditions.visibilityOf(tabSignUp));
        tabSignUp.click();
        return new SignUpScreen(driver);
    }
}
