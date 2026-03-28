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

    @AndroidFindBy(accessibility = "button-login-container")
    private WebElement tabLogin;

    @AndroidFindBy(accessibility = "input-email")
    private WebElement inputEmail;

    @AndroidFindBy(accessibility = "input-password")
    private WebElement inputPassword;

    @AndroidFindBy(accessibility = "button-LOGIN")
    private WebElement btnLoginSubmit;

    @AndroidFindBy(id = "android:id/message")
    private WebElement successMessage;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement btnOkSuccess;

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
     * @return A new instance of {@link SignUpScreen}
     */
    public SignUpScreen clickSignUpTab() {
        wait.until(ExpectedConditions.visibilityOf(tabSignUp));
        tabSignUp.click();
        return new SignUpScreen(driver);
    }

    /**
     * Click on the Login tab to switch back to the login form
     */
    public LoginScreen tapLoginTab() {
        wait.until(ExpectedConditions.visibilityOf(tabLogin));
        tabLogin.click();
        return this;
    }

    /**
     * Enter the email address for login
     */
    public LoginScreen enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOf(inputEmail));
        inputEmail.sendKeys(email);
        return this;
    }

    /**
     * Enter the password for login
     */
    public LoginScreen enterPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }

    /**
     * Click the Login submit button
     */
    public LoginScreen clickLoginButton() {
        btnLoginSubmit.click();
        return this;
    }

    /**
     * Verifies if the success message popup is displayed after login
     */
    public boolean isLoginSuccessful() {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        return successMessage.isDisplayed();
    }

    /**
     * Click OK on the success popup
     */
    public void clickOkOnSuccessDialog() {
        wait.until(ExpectedConditions.visibilityOf(btnOkSuccess));
        btnOkSuccess.click();
    }
}
