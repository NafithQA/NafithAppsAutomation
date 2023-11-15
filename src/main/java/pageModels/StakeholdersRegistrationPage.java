package pageModels;

import helpers.Functions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class StakeholdersRegistrationPage {
    Functions functions = new Functions();
    public StakeholdersRegistrationPage(AndroidDriver driver) {PageFactory.initElements(driver, this);}
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public WebElement allowButton;
    @FindBy(xpath = "//android.widget.Button[@content-desc='English']")
    public WebElement LanguageButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Next']")
    public WebElement nextButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Jordan']")
    public WebElement jordan_Button;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Trucking Services']")
    public WebElement truckingCompanyButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Let's Start\"]")
    public WebElement letsStartButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Register Now']")
    public WebElement subscribeNowButton;

    @FindBy(xpath = "//android.view.View[@content-desc='JO(+962)']")
    public WebElement countryKeyDropDownList;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc='OMN(+968)']")
    public WebElement jordanCountryCodeButton;
    @FindBy(xpath = "(//android.widget.ImageView)[1]")
    public WebElement phoneNumberField;
    @FindBy(xpath= "(//android.widget.EditText)[2]")
    public WebElement passwordField;
    @FindBy(xpath = "(//android.widget.Button)[2]")
    public WebElement createAccountButton;
    @FindBy(xpath= "//android.widget.Button[@content-desc='Register Your Activity']")
    public WebElement registerCompanyButton;
    @FindBy(xpath= "//android.view.View[@content-desc='Individuals']")
    public WebElement registerTypeButton;
    @FindBy(xpath= "//android.view.View[@content-desc='Transportation']")
    public WebElement businessTypeButton;
    @FindBy(className= "(//android.widget.EditText)[1]")
    public WebElement commercialNameAR;
    @FindBy(xpath= "(//android.widget.EditText)[2]")
    public WebElement commercialNameEn;
    @FindBy(xpath= "(//android.widget.EditText)[3]")
    public WebElement commercialRegNum;
    @FindBy(xpath= "//android.widget.EditText")
    public WebElement emailField;
    @FindBy(xpath= "(//android.view.View)[22]")
    public WebElement countryDropDownList;
    @FindBy(xpath= "(//android.widget.EditText)[2]")
    public WebElement governorateField;
    @FindBy(xpath= "(//android.widget.EditText)[3]")
    public WebElement addressField;
    @FindBy(xpath= "//android.widget.ImageView")
    public WebElement attachmentPhoto;
    @FindBy(xpath= "//android.view.View[@content-desc=\"Choose from gallery\"]")
    public WebElement chooseFromGalleryAttach;
    @FindBy(xpath= "(//android.widget.ImageView)[4]")
    public WebElement chooseAttachments;
    @FindBy(xpath= "//android.widget.Button[@content-desc='Done']")
    public WebElement doneButton;
    @FindBy(xpath= "//android.widget.ImageView[@content-desc='Account']")
    public WebElement accountButton;
    @FindBy(xpath=  "//android.widget.ImageView[@content-desc='Login']")
    public WebElement loginPage;
    @FindBy(xpath=  "(//android.widget.EditText)[2]")
    public WebElement loginPasswordField;
    @FindBy(xpath=  "//android.widget.Button[@content-desc='Login']")
    public WebElement loginButton;
    public void clickOnAllowButton() {
        functions.waitForElementToBeVisible(allowButton);
        allowButton.click();
    }
    public void clickOnNextButton() throws InterruptedException {
        Thread.sleep(1000);
        functions.waitForElementToBeVisible(nextButton);
        nextButton.click();
    }
    public void clickOnJordan_Button() {
        functions.waitForElementToBeVisible(jordan_Button);
        jordan_Button.click();
    }
    public void clickOnTruckingCompanyButton() {
        functions.waitForElementToBeVisible(truckingCompanyButton);
        truckingCompanyButton.click();
    }
    public void clickOnLetsStartButton() throws InterruptedException {
        functions.waitForElementToBeVisible(letsStartButton);
        letsStartButton.click();
    }
    public void clickOnSubscribeNowButton() {
        functions.waitForElementToBeVisible(subscribeNowButton);
        subscribeNowButton.click();
    }
    public void clickOnCountryKeyDropDownList() {
        functions.waitForElementToBeVisible(countryKeyDropDownList);
        countryKeyDropDownList.click();
    }
    public void clickOnJordanCountryCodeButton() {
        functions.waitForElementToBeVisible(jordanCountryCodeButton);
        jordanCountryCodeButton.click();
    }
    public void clickOnPhoneNumberField() {
        functions.waitForElementToBeVisible(phoneNumberField);
        phoneNumberField.click();
    }
    public WebElement fillInPhoneNumberField(){
        functions.waitForElementToBeVisible(phoneNumberField);
        return phoneNumberField;
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
    public void clickOnRegisterCompanyButton() {
        functions.waitForElementToBeVisible(registerCompanyButton);
        registerCompanyButton.click();
    }
    public void clickOnRegistrationTypeButton() {
        functions.waitForElementToBeVisible(registerTypeButton);
        registerTypeButton.click();
    }
    public void clickOnBusinessTypeButton() {
        functions.waitForElementToBeVisible(businessTypeButton);
        businessTypeButton.click();
    }

    public void clickOnCommercialNameArabic(){
        functions.waitForElementToBeVisible(commercialNameAR);
        commercialNameAR.click();
    }
    public void fillInCommercialNameArField(String commercialNameAr) {
        functions.waitForElementToBeVisible(commercialNameAR);
        commercialNameAR.sendKeys(commercialNameAr);
    }
    public void clickOnCommercialNameEnglish() {
        functions.waitForElementToBeVisible(commercialNameEn);
        commercialNameEn.click();
    }
    public void fillInCommercialNameEnField(String CommercialNameEn) {
        functions.waitForElementToBeVisible(commercialNameEn);
        commercialNameEn.sendKeys(CommercialNameEn);
    }
    public void clickOnCommercialRegNum() {
        functions.waitForElementToBeVisible(commercialRegNum);
        commercialRegNum.click();
    }
    public void fillInCommercialRegNum(String commercialRegNumField) {
        functions.waitForElementToBeVisible(commercialRegNum);
        commercialRegNum.sendKeys(commercialRegNumField);
    }
    public void clickOnEmail() {
        functions.waitForElementToBeVisible(emailField);
        emailField.click();
    }
    public void fillInEmail(String Email) {
        functions.waitForElementToBeVisible(emailField);
        emailField.sendKeys(Email);
    }
    public void clickOnCountryDropDownList() {
        functions.waitForElementToBeVisible(countryDropDownList);
        countryDropDownList.click();
    }
    public void clickOnGovernorate() {
        functions.waitForElementToBeVisible(governorateField);
        governorateField.click();
    }
    public void fillInGovernorate(String Email) {
        functions.waitForElementToBeVisible(governorateField);
        governorateField.sendKeys(Email);
    }
    public void clickOnAddress() {
        functions.waitForElementToBeVisible(addressField);
        addressField.click();
    }
    public void clickOnaAttachment1() {
        functions.waitForElementToBeVisible(attachmentPhoto);
        attachmentPhoto.click();
    }
    public void clickOnChooseFromGallery() {
        functions.waitForElementToBeVisible(chooseFromGalleryAttach);
        chooseFromGalleryAttach.click();
    }
    public void clickOnChooseAttachments() {
        functions.waitForElementToBeVisible(chooseAttachments);
        chooseAttachments.click();
    }
    public void clickOnDoneButton() throws InterruptedException {
//        Thread.sleep(2000);
        functions.waitForElementToBeVisible(doneButton);
        doneButton.click();
    }


    public void clickOnAccountButton() {
        functions.waitForElementToBeVisible(accountButton);
        accountButton.click();
    }
    public void clickOnLoginPage() {
        functions.waitForElementToBeVisible(loginPage);
        loginPage.click();
    }
    public void clickOnLoginPasswordField() {
        functions.waitForElementToBeVisible(loginPasswordField);
        loginPasswordField.click();
    }
    public void fillInLoginPasswordField(String phoneNumber) {
        functions.waitForElementToBeVisible(loginPasswordField);
        loginPasswordField.sendKeys(phoneNumber);
    }
    public void clickOnLoginButton() {
        functions.waitForElementToBeVisible(loginButton);
        loginButton.click();
    }



}
