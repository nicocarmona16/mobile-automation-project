package org.globant.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

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

    public HomeScreen clickHome() {
        btnHome.click();
        return new HomeScreen(driver);
    }

    public WebScreen clickWeb() {
        btnWeb.click();
        return new WebScreen(driver);
    }

    public LoginScreen clickLogin() {
        btnLogin.click();
        return new LoginScreen(driver);
    }

    public FormsScreen clickForms() {
        btnForms.click();
        return new FormsScreen(driver);
    }

    public SwipeScreen clickSwipe() {
        btnSwipe.click();
        return new SwipeScreen(driver);
    }

    public DragScreen clickDrag() {
        btnDrag.click();
        return new DragScreen(driver);
    }

    public MenuScreen clickMenu() {
        btnMenu.click();
        return new MenuScreen(driver);
    }
}
