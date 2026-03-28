package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

/**
 * Page Object representing the bottom navigation bar of the application
 */
public class NavigationScreen extends BaseScreen{

    public NavigationScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Home")
    private WebElement btnHome;

    @AndroidFindBy(accessibility = "Webview")
    private WebElement btnWeb;

    @AndroidFindBy(accessibility = "Login")
    private WebElement btnLogin;

    @AndroidFindBy(accessibility = "Forms")
    private WebElement btnForms;

    @AndroidFindBy(accessibility = "Swipe")
    private WebElement btnSwipe;

    @AndroidFindBy(accessibility = "Drag")
    private WebElement btnDrag;

    @AndroidFindBy(accessibility = "Menu")
    private WebElement btnMenu;

    /**
     * Taps on the Home icon in the bottom navigation bar
     * @return A new instance of {@link HomeScreen}
     */
    public HomeScreen clickHome() {
        btnHome.click();
        return new HomeScreen(driver);
    }

    /**
     * Taps on the Webview icon in the bottom navigation bar
     * @return A new instance of {@link WebScreen}
     */
    public WebScreen clickWeb() {
        btnWeb.click();
        return new WebScreen(driver);
    }

    /**
     * Taps on the Login icon in the bottom navigation bar
     * @return A new instance of {@link LoginScreen}
     */
    public LoginScreen clickLogin() {
        btnLogin.click();
        return new LoginScreen(driver);
    }

    /**
     * Taps on the Forms icon in the bottom navigation bar
     * @return A new instance of {@link FormsScreen}
     */
    public FormsScreen clickForms() {
        btnForms.click();
        return new FormsScreen(driver);
    }

    /**
     * Taps on the Swipe icon in the bottom navigation bar
     * @return A new instance of {@link SwipeScreen}
     */
    public SwipeScreen clickSwipe() {
        btnSwipe.click();
        return new SwipeScreen(driver);
    }

    /**
     * Taps on the Drag icon in the bottom navigation bar
     * @return A new instance of {@link DragScreen}
     */
    public DragScreen clickDrag() {
        btnDrag.click();
        return new DragScreen(driver);
    }

    /**
     * Taps on the Menu icon in the bottom navigation bar
     * @return A new instance of {@link MenuScreen}
     */
    public MenuScreen clickMenu() {
        btnMenu.click();
        return new MenuScreen(driver);
    }
}
