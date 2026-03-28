package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenuScreen extends BaseScreen{

    public MenuScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Menu\")")
    private WebElement assertionMenu;

    public boolean isMenuTitleVisible() {
        wait.until(ExpectedConditions.visibilityOf(assertionMenu));
        return assertionMenu.isDisplayed();
    }
}
