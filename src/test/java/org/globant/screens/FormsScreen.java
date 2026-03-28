package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FormsScreen extends BaseScreen{

    public FormsScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Form components\")")
    private WebElement assertionForms;

    public boolean isFormsTitleVisible() {
        wait.until(ExpectedConditions.visibilityOf(assertionForms));
        return assertionForms.isDisplayed();
    }
}
