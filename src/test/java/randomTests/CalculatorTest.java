package randomTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CalculatorTest {

    public static void main(String[] args) throws Exception {

        // Set the desired capabilities for the appium driver
        DesiredCapabilities capabilities = new DesiredCapabilities();

        //		App Path
        File appDir = new File("src");
        File app = new File(appDir, "nstar-debug.apk");

        capabilities.setCapability("newCommandTimeout", 100000);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PixelXL");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability("appPackage", "com.nafith.nstar.nstar");
        capabilities.setCapability("appActivity", "MainActivity");
        capabilities.setCapability("appWaitDuration", "20000");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
        capabilities.setCapability("clearSystemFiles", true);

        // Create an instance of the appium driver
        AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();
        Thread.sleep(5000);
        // Quit the driver
        driver.quit();
    }
}

