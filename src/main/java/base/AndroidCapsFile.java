package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class AndroidCapsFile {

    public static AndroidDriver<AndroidElement> driver;

    @BeforeTest(alwaysRun = true)
    public static AndroidDriver<AndroidElement> capabilities() throws IOException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

//		App Path
        File appDir = new File("src");
        File app = new File(appDir, "selendroid-test-app.apk");

        capabilities.setCapability("newCommandTimeout", 100000);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PixelXL");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability("appWaitDuration", "20000");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
        capabilities.setCapability("clearSystemFiles", true);

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        return driver;
    }
}