package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginScreen extends BaseScreen {

    public LoginScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "button-LOGIN")
    private WebElement assertionLogin;

    public boolean isLoginButtonVisible() {
        wait.until(ExpectedConditions.visibilityOf(assertionLogin));
        return assertionLogin.isDisplayed();
    }
}
