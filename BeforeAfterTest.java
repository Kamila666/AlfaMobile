import com.google.common.collect.ImmutableMap;
import com.sun.glass.events.SwipeGesture;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import javafx.scene.input.SwipeEvent;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BeforeAfterTest extends AppiumDriver {
    public AndroidDriver driver;
    public int DefaultTimeout = 15;

    public BeforeAfterTest(HttpCommandExecutor executor, Capabilities capabilities) {
        super(executor, capabilities);
    }

    @BeforeTest
    public void setup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Galaxy J7");

        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("appPackage", "kz.alfabank.mobile.android.debug");

        capabilities.setCapability("appActivity", "kz.alfabank.mobile.android.presentation.feature.start.splash.SplashActivity");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        System.out.println("Successful");

    }

    public AndroidElement newAndroidWebEl(String id, int timeout) {
        return (AndroidElement) new WebDriverWait(driver, timeout).until(
                ExpectedConditions.elementToBeClickable(MobileBy.id(id))
        );
    }

    public AndroidElement newAndroidText(String text, int timeout) {
        return (AndroidElement) new  WebDriverWait(driver, timeout).until(
                ExpectedConditions.visibilityOfElementLocated(MobileBy.linkText("+text+")));


    }



    public AndroidElement newAndroidXpath(String className,  String TextView) {
        return (AndroidElement) new  WebDriverWait(driver, 10).until(
                ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//"+className+"[@text='"+TextView+"']"))
        );
    }



    public AndroidElement newAndroid(String className) {
        return (AndroidElement) new  WebDriverWait(driver, 10).until(
                ExpectedConditions.visibilityOfElementLocated(MobileBy.className(className))
        );
    }

    public AndroidElement newAndroidIndex(String index, String id) {
        return (AndroidElement) new WebDriverWait(driver, 10).until(
                ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//"+index+"[@id='"+id+"']"))
        );
    }

    public void verticalSwipe()
    {
        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width/2;
        int starty = (int)(height*0.80);
        int endy = (int)(height*0.20);
        driver.swipe(x, starty, x, endy, 500);

    }




    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
