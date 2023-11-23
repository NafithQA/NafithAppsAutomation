package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;


public class AndroidConfigurations {

//    public static AppiumDriver driver;
    public static AndroidDriver driver;

    @BeforeSuite(alwaysRun = true)
    public static AppiumDriver capabilities() throws IOException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

//		App Path
        File appDir = new File("src");
        File app = new File(appDir, "app (7).apk");

        capabilities.setCapability("newCommandTimeout", 100000);
//       capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_XL");
         capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SM_A217F");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability("appPackage", "com.nafith.nstar.nstar");
        capabilities.setCapability("appActivity", "MainActivity");
        capabilities.setCapability("appWaitDuration", "20000");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
        capabilities.setCapability("clearSystemFiles", true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
}