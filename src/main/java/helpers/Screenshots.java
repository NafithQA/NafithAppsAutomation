package helpers;

import java.io.File;
import java.io.IOException;
import base.AndroidCapsFile;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshots {

	static AndroidDriver<?> SsObject = AndroidCapsFile.driver;

	public static void getScreenshot(String s) throws IOException {

		File screenShot = ((TakesScreenshot) SsObject).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File(
				System.getProperty("user.dir") + "/src/main/java/runReports/failuresScreenshots/" + s + ".jpg"));

	}
}