package base;
import helpers.EmailSender;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
public class AndroidConfigurations {

    //  public static AppiumDriver driver;
    public static AndroidDriver driver;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"env"})
    public static AppiumDriver capabilities(String environment) throws IOException {

        String appActivity = null;
        if (environment.equalsIgnoreCase("qa")){
            appActivity = "MainActivity";
        }
        else if (environment.equalsIgnoreCase("live")){
            appActivity = "com.nafith.nstar.MainActivity";
        }

        DesiredCapabilities capabilities = new DesiredCapabilities();

//		App Path
        File appDir = new File("src");
        File app = new File(appDir, "app.apk");
        capabilities.setCapability("newCommandTimeout", 100000);
//       capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_XL");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_New");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability("appPackage", "com.nafith.nstar.nstar");
        capabilities.setCapability("appActivity", appActivity);
        capabilities.setCapability("appWaitDuration", "20000");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
        capabilities.setCapability("clearSystemFiles", true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

    @AfterMethod(alwaysRun = true)
    public void testTearDown() {
        // Driver Close
        if (driver != null) {
            driver.quit();
        }
    }
//    @AfterSuite(alwaysRun = true)
//    public void sendReport() throws InterruptedException {
//
//        Thread.sleep(1000);
//        EmailSender emailSender = new EmailSender();
//        emailSender.sendReportByMail();
//    }
}