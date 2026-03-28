package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeScreen extends BaseScreen{

    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    private WebElement assertionHome;

    public boolean isHomeTitleVisible() {
        wait.until(ExpectedConditions.visibilityOf(assertionHome));
        return assertionHome.isDisplayed();
    }
}
