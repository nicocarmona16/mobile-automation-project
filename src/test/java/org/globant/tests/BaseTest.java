package org.globant.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    protected AppiumDriver appiumDriver;

    @BeforeMethod
    public void setUp() {
        appiumDriver = createAppiumDriver();
    }

    @AfterMethod
    public void tearDown() {
        appiumDriver.quit();
    }

    private AppiumDriver createAppiumDriver() {
        try {
            UiAutomator2Options options = new UiAutomator2Options()
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setApp("C:\\Users\\nicolas.carmona\\Desktop\\Training\\04-Mobile\\android.wdio.native.app.v2.2.0.apk");
            URL url = new URL("http://127.0.0.1:4723");
            AppiumDriver appiumDriver1 = new AppiumDriver(url, options);
            appiumDriver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return appiumDriver1;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
