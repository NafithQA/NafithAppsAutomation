package screensObjects;

import helpers.Functions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AndroidObjects {

    Functions functions = new Functions();

    public AndroidObjects(AppiumDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc='Skip']")
    public WebElement skipButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc='عربي']")
    public WebElement arabicLanguageButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc='التالي']")
    public WebElement nextButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='الأردن']")
    public WebElement jordan_AR_Button;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public WebElement allowButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='شركة نقل']")
    public WebElement transportationCompanyButton_AR;

    @FindBy(xpath = "//android.widget.Button[@content-desc='لنبدأ']")
    public WebElement letsStartButton_AR;

    @FindBy(xpath = "//android.widget.Button[@content-desc='سجّل الآن']")
    public WebElement subscribeNowButton_AR;

    @FindBy(xpath = "//android.view.View[@content-desc=\"OMN(+968)\"]")
    public WebElement countryKeyDropDownList;

    @FindBy(xpath = "(//android.view.View)[6]")
    public WebElement iraqCountryCodeButton;

    @FindBy(xpath = "(//android.view.View)[7]")
    public WebElement jordanCountryCodeButton;

    @FindBy(xpath = "(//android.view.View)[8]")
    public WebElement omanCountryCodeButton;

    @FindBy(xpath = "(//android.widget.ImageView)[1]")
    public WebElement phoneNumberField;

    @FindBy(className = "android.widget.EditText")
    public WebElement passwordField;

    @FindBy(xpath = "(//android.widget.Button)[2]")
    public WebElement createAccountButton;

    public void clickOnSkipButton() {
        functions.waitForElementToBeVisible(skipButton);
        skipButton.click();
    }

    public void clickOnArabicLanguageButton() {
        functions.waitForElementToBeVisible(arabicLanguageButton);
        arabicLanguageButton.click();
    }

    public void clickOnNextButton() {
        functions.waitForElementToBeVisible(nextButton);
        nextButton.click();
    }

    public void clickOnJordan_AR_Button() {
        functions.waitForElementToBeVisible(jordan_AR_Button);
        jordan_AR_Button.click();
    }

    public void clickOnAllowButton() {
        functions.waitForElementToBeVisible(allowButton);
        allowButton.click();
    }

    public void clickOnTransportationCompanyButton_AR() {
        functions.waitForElementToBeVisible(transportationCompanyButton_AR);
        transportationCompanyButton_AR.click();
    }

    public void clickOnLetsStartButton() {
        functions.waitForElementToBeVisible(letsStartButton_AR);
        letsStartButton_AR.click();
    }

    public void clickOnSubscribeNowButton_AR() {
        functions.waitForElementToBeVisible(subscribeNowButton_AR);
        subscribeNowButton_AR.click();
    }

    public void clickOnCountryKeyDropDownList() {
        functions.waitForElementToBeVisible(countryKeyDropDownList);
        countryKeyDropDownList.click();
    }

    public void clickOnIraqCountryCodeButton() {
        functions.waitForElementToBeVisible(iraqCountryCodeButton);
        iraqCountryCodeButton.click();
    }

    public void clickOnJordanCountryCodeButton() {
        functions.waitForElementToBeVisible(jordanCountryCodeButton);
        jordanCountryCodeButton.click();
    }

    public void clickOnOmanCountryCodeButton() {
        functions.waitForElementToBeVisible(omanCountryCodeButton);
        omanCountryCodeButton.click();
    }

    public void clickOnPhoneNumberField() {
        functions.waitForElementToBeVisible(phoneNumberField);
        phoneNumberField.click();
    }

    public void fillInPhoneNumberField(String phoneNumber) {
        functions.waitForElementToBeVisible(phoneNumberField);
        phoneNumberField.sendKeys(phoneNumber);
    }

    public void clickOnPasswordField() {
        functions.waitForElementToBeVisible(passwordField);
        passwordField.click();
    }

    public void fillInPasswordField(String phoneNumber) {
        functions.waitForElementToBeVisible(passwordField);
        passwordField.sendKeys(phoneNumber);
    }

    public void clickOnCreateAccountButton() {
        functions.waitForElementToBeVisible(createAccountButton);
        createAccountButton.click();
    }
}