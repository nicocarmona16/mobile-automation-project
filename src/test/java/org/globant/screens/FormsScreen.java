package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Page Object representing the Forms screen of the application
 */
public class FormsScreen extends BaseScreen{

    public FormsScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Form components\")")
    private WebElement assertionForms;

    /**
     * Verifies if the Forms screen title is visible
     * @return true if the title is displayed, otherwise throws a TimeoutException
     */
    public boolean isFormsTitleVisible() {
        wait.until(ExpectedConditions.visibilityOf(assertionForms));
        return assertionForms.isDisplayed();
    }
}
