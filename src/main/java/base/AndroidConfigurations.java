package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import helpers.ServerChecker;
import org.testng.annotations.Parameters;

public class AndroidConfigurations extends AndroidCapsFile {


    @BeforeSuite
//    @Parameters({"deviceName"})
    public void configurations(String deviceName) throws IOException, InterruptedException {

//        ServerChecker.serverChecker();
//        ServerChecker.service.start();
//        new ProcessBuilder("emulator", "-avd", "" + deviceName + "").start();

        AndroidDriver driver = capabilities();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

//    @AfterSuite
//    public void closeServer() {
//
//        ServerChecker.service.stop();
//    }
}