package mainTests;

import base.AndroidConfigurations;
import helpers.Functions;
import org.testng.annotations.Test;
import screensObjects.AndroidObjects;

public class Tests extends AndroidConfigurations {

    @Test(enabled = true)
    public void randomScenario() throws InterruptedException {

        Functions functions = new Functions();

        AndroidObjects androidObjects = new AndroidObjects(driver);
        androidObjects.clickOnAllowButton();
        androidObjects.clickOnArabicLanguageButton();
        androidObjects.clickOnNextButton();
        androidObjects.clickOnJordan_AR_Button();
        androidObjects.clickOnNextButton();
        androidObjects.clickOnTransportationCompanyButton_AR();
        androidObjects.clickOnNextButton();
        androidObjects.clickOnNextButton();
        androidObjects.clickOnLetsStartButton();
        androidObjects.clickOnSubscribeNowButton_AR();
        androidObjects.clickOnCountryKeyDropDownList();
        androidObjects.clickOnJordanCountryCodeButton();

        androidObjects.clickOnPhoneNumberField();
        String phoneNumber = String.valueOf(functions.generateRandomNumber(9));
        androidObjects.fillInPhoneNumberField(phoneNumber);

        androidObjects.clickOnPasswordField();
        String password = functions.generateRandomPassword();
        androidObjects.fillInPasswordField(password);

        driver.navigate().back();
        androidObjects.clickOnCreateAccountButton();

        Thread.sleep(5000);
    }
}
