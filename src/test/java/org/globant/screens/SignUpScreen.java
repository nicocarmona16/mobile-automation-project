package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Page Object representing the Sign-Up screen of the application.
 */
public class SignUpScreen extends BaseScreen{

    public SignUpScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "input-email")
    private WebElement inputEmail;

    @AndroidFindBy(accessibility = "input-password")
    private WebElement inputPassword;

    @AndroidFindBy(accessibility = "input-repeat-password")
    private WebElement inputRepeatPassword;

    @AndroidFindBy(accessibility = "button-SIGN UP")
    private WebElement btnSignUp;

    @AndroidFindBy(id = "android:id/message")
    private WebElement successMessage;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement btnOkSuccess;

    /**
     * Enter the email address
     */
    public SignUpScreen enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOf(inputEmail));
        inputEmail.sendKeys(email);
        return this;
    }

    /**
     * Enters the password
     */
    public SignUpScreen enterPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }

    /**
     * Enter the confirmation password
     */
    public SignUpScreen enterRepeatPassword(String password) {
        inputRepeatPassword.sendKeys(password);
        return this;
    }

    /**
     * Click the Sign-Up button to submit the form
     */
    public SignUpScreen clickSignUpButton() {
        btnSignUp.click();
        return this;
    }

    /**
     * Verifies if the success message is displayed
     */
    public boolean isSignUpSuccessful() {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        return successMessage.isDisplayed();
    }

    /**
     * Clicks OK on the success popup
     */
    public void clickOkOnSuccessDialog() {
        wait.until(ExpectedConditions.visibilityOf(btnOkSuccess));
        btnOkSuccess.click();
    }
}
