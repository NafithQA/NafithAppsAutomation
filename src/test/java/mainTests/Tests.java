package mainTests;

import base.AndroidConfigurations;
import org.testng.annotations.Test;
import screensObjects.AndroidObjects;

public class Tests extends AndroidConfigurations {

    @Test(enabled = true)
    public void randomScenario() throws InterruptedException {

        AndroidObjects androidObjects = new AndroidObjects(driver);
        androidObjects.clickOnSkipButton();
        androidObjects.clickOnArabicLanguageButton();
        androidObjects.clickOnNextButton();
        androidObjects.clickOnJordan_AR_Button();

        Thread.sleep(5000);
    }
}
