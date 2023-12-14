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
    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Clearance Services']")
    public WebElement clearanceServicesButton;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=' Insurance Services']")
    public WebElement insuranceServicesButton;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Forwarding Services']")
    public WebElement forwardingServicesButton;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Cargo owner']")
    public WebElement cargoOwnerButton;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Let's Start\"]")
    public WebElement letsStartButton;
    @FindBy(xpath = "//android.widget.Button[@content-desc='Register Now']")
    public WebElement subscribeNowButton;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Provide your logistics services\n" +
            "Find out now\"]")
    public WebElement logisticsServicesFindOutButton;
    @FindBy(xpath = "//android.widget.Button[@content-desc='Create Account']")
    public WebElement createAccountVisitorButton;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Provide your logistics services\n" +
            "Find out now\"]")
    public WebElement provideLogisticsServicesFindOutButton;
    @FindBy(xpath = "//android.view.View[@content-desc='JO(+962)']")
    public WebElement countryKeyDropDownList;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Jordan']")
    public WebElement jordanCountryCodeButton;
    @FindBy(xpath = "(//android.widget.ImageView)[1]")
    public WebElement phoneNumberField;
    @FindBy(xpath= "(//android.widget.EditText)[2]")
    public WebElement passwordField;
    @FindBy(xpath = "(//android.widget.Button)[2]")
    public WebElement createAccountButton;
    @FindBy(xpath= "//android.widget.Button[@content-desc=\"Register Now\"]")
    public WebElement registerCompanyButton;
    @FindBy(xpath= "//android.widget.Button[@content-desc=\"Register Activity\"]")
    public WebElement registerYourActivityButton;
     @FindBy(xpath= "(//android.widget.EditText)[1]")
    public WebElement commercialNameAR;
    @FindBy(xpath= "//android.widget.EditText[1]")
    public WebElement fillCommercialNameAR;
    @FindBy(xpath= "(//android.widget.EditText)[2]")
    public WebElement commercialNameEn;
    @FindBy(xpath= "(//android.widget.EditText)[3]")
    public WebElement commercialRegNum;
    @FindBy(xpath= "(//android.widget.EditText)[2]")
    public WebElement emailField;
    @FindBy(xpath= "(//android.view.View)[16]")
    public WebElement countryDropDownList;
    @FindBy(xpath= "(//android.widget.EditText)[4]")
    public WebElement governorateText;
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
    @FindBy(xpath= "//android.widget.Button[@content-desc='Register']")
    public WebElement registerButton;
    @FindBy(xpath= "//android.view.View[@content-desc='Individual']")
    public WebElement individualButton;
    @FindBy(xpath= "//android.widget.Button[@content-desc='Back to home page']")
    public WebElement backToHomePageButton;
    @FindBy(xpath= "//android.widget.ImageView[@content-desc='Account']")
    public WebElement accountButton;
    @FindBy(xpath=  "//android.widget.ImageView[@content-desc='Login']")
    public WebElement loginPage;
    @FindBy(xpath=  "(//android.widget.EditText)[2]")
    public WebElement loginPasswordField;
    @FindBy(xpath=  "//android.widget.Button[@content-desc='Login']")
    public WebElement loginButton;
    @FindBy(xpath=  "//android.view.View[@content-desc='Trucking Services']")
    public WebElement truckingCompanyBusinessActivityButton;
    @FindBy(xpath=  "//android.view.View[@content-desc='Clearance Services']")
    public WebElement clearanceServicesBusinessActivityButton;
    @FindBy(xpath=  "//android.view.View[@content-desc=' Insurance Services']")
    public WebElement insuranceServicesBusinessActivityButton;
    @FindBy(xpath=  "//android.view.View[@content-desc='Forwarding Services']")
    public WebElement forwardingServicesBusinessActivityButton;
    @FindBy(xpath=  "//android.view.View[@content-desc='Cargo owner']")
    public WebElement cargoOwnerBusinessActivityButton;
    @FindBy(xpath=  "//android.widget.ImageView[@content-desc='My service settings\n" +
            "Edit the services I provide']")
    public WebElement myServicesPageButton;
    @FindBy(xpath=  "//android.widget.ImageView[@content-desc='Locate the company']")
    public WebElement companyLocationOnTheMapButton;
    @FindBy(id=  "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public WebElement allowLocationButton;
    @FindBy(xpath=  "//android.widget.Button[@content-desc='Confirm the location']")
    public WebElement confirmTheLocationButton;
    @FindBy(xpath=  "//android.widget.Button[@content-desc='Save Settings']")
    public WebElement saveSettingButton;
    @FindBy(xpath=  "//android.widget.ImageView[@content-desc='Search']")
    public WebElement searchPage;
    @FindBy(xpath=  "//android.widget.ImageView[@content-desc='Forwarding Services']")
    public WebElement ForwardingServicesButton;
    @FindBy(xpath=  "//android.widget.ImageView[@content-desc='Trucking Services']")
    public WebElement truckingServicesButton;
    @FindBy(xpath=  "//android.widget.ImageView[@content-desc='Category']")
    public WebElement CategoryButton;
    @FindBy(xpath=  "//android.view.View[@content-desc='Air freight']")
    public WebElement airFrightTypeButton;
    @FindBy(xpath=  "//android.widget.Button[@content-desc='Show results']")
    public WebElement showResultButton;
    @FindBy(xpath=  "//android.view.View[@content-desc='Usage Type\n" + "Choose']")
    public WebElement usageTypeButton;
    @FindBy(xpath=  "//android.widget.Button[@content-desc='Cement Tanker']")
    public WebElement selectUsageTypeButton;
    @FindBy(xpath=  "//android.widget.Button[@content-desc='Choose']")
    public WebElement chooseButton;
    @FindBy(xpath=  "//android.view.View[@content-desc='2']")
    public WebElement numberOfAxlesButton;
    @FindBy(xpath=  "//android.view.View[@content-desc='2']")
    public WebElement SeekBar;
    @FindBy(xpath=  "//android.widget.ImageView[1]")
    public WebElement SearchBox;
    @FindBy(xpath=  "//android.view.View[@content-desc=\"Cement Tanker\"])[2]")
    public WebElement ChooseFromSearchBox;

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
    public void clickOnClearanceServicesButton() {
        functions.waitForElementToBeVisible(clearanceServicesButton);
        clearanceServicesButton.click();
    }
    public void clickOnInsuranceServicesButton() {
        functions.waitForElementToBeVisible(insuranceServicesButton);
        insuranceServicesButton.click();
    }
    public void clickOnForwardingServicesButton() {
        functions.waitForElementToBeVisible(forwardingServicesButton);
        forwardingServicesButton.click();
    }
    public void clickOnCargoOwnerButton() {
        functions.waitForElementToBeVisible(cargoOwnerButton);
        cargoOwnerButton.click();
    }
    public void clickOnLetsStartButton() throws InterruptedException {
        functions.waitForElementToBeVisible(letsStartButton);
        letsStartButton.click();
    }
    public void clickOnSubscribeNowButton() {
        functions.waitForElementToBeVisible(subscribeNowButton);
        subscribeNowButton.click();
    }
    public void clickOnLogisticsServicesFindOutButton() {
        functions.waitForElementToBeVisible(logisticsServicesFindOutButton);
        logisticsServicesFindOutButton.click();
    }
    public void clickOnProvideLogisticsServicesFindOutButton() {
        functions.waitForElementToBeVisible(provideLogisticsServicesFindOutButton);
        provideLogisticsServicesFindOutButton.click();
    }
    public void clickOnCreateAccountVisitorButton() {
        functions.waitForElementToBeVisible(createAccountVisitorButton);
        createAccountVisitorButton.click();
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
        phoneNumberField.click();
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
    public void clickOnRegisterYourActivityButton() {
        functions.waitForElementToBeVisible(registerYourActivityButton);
        registerYourActivityButton.click();
    }
    public void clickOnCommercialNameArabic(){
        functions.waitForElementToBeVisible(commercialNameAR);
        commercialNameAR.click();
    }
    public void fillInCommercialNameArField(String ArName) {
        functions.waitForElementToBeVisible(fillCommercialNameAR);
        fillCommercialNameAR.click();
        fillCommercialNameAR.sendKeys(ArName);
    }
    public void clickOnCommercialNameEnglish() {
        functions.waitForElementToBeVisible(commercialNameEn);
        commercialNameEn.click();
    }
    public void fillInCommercialNameEnField(String CommercialNameEn) {
        functions.waitForElementToBeVisible(commercialNameEn);
        commercialNameEn.click();
        commercialNameEn.sendKeys(CommercialNameEn);
    }
    public void clickOnCommercialRegNum() {
        functions.waitForElementToBeVisible(commercialRegNum);
        commercialRegNum.click();
    }
    public void fillInCommercialRegNum(String commercialRegNumField) {
        functions.waitForElementToBeVisible(commercialRegNum);
        commercialRegNum.click();
        commercialRegNum.sendKeys(commercialRegNumField);
    }
    public void clickOnEmail() {
        functions.waitForElementToBeVisible(emailField);
        emailField.click();
    }
    public void fillInEmail(String Email) {
        functions.waitForElementToBeVisible(emailField);
        emailField.click();
        emailField.sendKeys(Email);
    }
    public void clickOnCountryDropDownList() {
        functions.waitForElementToBeVisible(countryDropDownList);
        countryDropDownList.click();
    }
    public void clickOnGovernorate() {
        functions.waitForElementToBeVisible(governorateText);
        governorateText.click();
    }
    public void fillInAddress(String address) {
        functions.waitForElementToBeVisible(addressField);
        addressField.click();
        addressField.sendKeys(address);
    }
    public void fillInGovernorate(String governorate) {
        functions.waitForElementToBeVisible(governorateField);
        governorateField.click();
        governorateField.sendKeys(governorate);
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
    public void clickOnDoneButton()  {
        functions.waitForElementToBeVisible(doneButton);
        doneButton.click();
    }
    public void clickOnRegisterButton()  {
        functions.waitForElementToBeVisible(registerButton);
        registerButton.click();
    }
    public void clickOnIndividualButton()  {
        functions.waitForElementToBeVisible(individualButton);
        individualButton.click();
    }
    public void clickOnBackToHomePage()  {
        functions.waitForElementToBeVisible(backToHomePageButton);
        backToHomePageButton.click();
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
    public void clickOnTruckingCompanyBusinessActivityButton() {
        functions.waitForElementToBeVisible(truckingCompanyBusinessActivityButton);
        truckingCompanyBusinessActivityButton.click();
    }
    public void clickOnClearanceServicesBusinessActivityButton() {
        functions.waitForElementToBeVisible(clearanceServicesBusinessActivityButton);
        clearanceServicesBusinessActivityButton.click();
    }
    public void clickOnInsuranceServicesBusinessActivityButton() {
        functions.waitForElementToBeVisible(insuranceServicesBusinessActivityButton);
        insuranceServicesBusinessActivityButton.click();
    }
    public void clickOnForwardingServicesBusinessActivityButton() {
        functions.waitForElementToBeVisible(forwardingServicesBusinessActivityButton);
        forwardingServicesBusinessActivityButton.click();
    }
    public void clickOnCargoOwnerBusinessActivityButton() {
        functions.waitForElementToBeVisible(cargoOwnerBusinessActivityButton);
        cargoOwnerBusinessActivityButton.click();
    }
    public void clickOnMyServicesPageButton() {
        functions.waitForElementToBeVisible(myServicesPageButton);
        myServicesPageButton.click();
    }
    public void clickOnaCompanyLocationOnTheMap() {
        functions.waitForElementToBeVisible(companyLocationOnTheMapButton);
        companyLocationOnTheMapButton.click();
    }
    public void clickOnAllowLocation() {
        functions.waitForElementToBeVisible(allowLocationButton);
        allowLocationButton.click();
    }
    public void clickConfirmTheLocation() throws InterruptedException {
        Thread.sleep(1000);
        functions.waitForElementToBeVisible(confirmTheLocationButton);
        confirmTheLocationButton.click();
    }
    public void clickOnSaveSetting() {
        functions.waitForElementToBeVisible(saveSettingButton);
        saveSettingButton.click();
    }
    public void clickOnSearchPage() {
        functions.waitForElementToBeVisible(searchPage);
        searchPage.click();
    }
    public void clickOnForwardingServices() {
        functions.waitForElementToBeVisible(ForwardingServicesButton);
        ForwardingServicesButton.click();
    }
    public void clickOnTruckingServices() {
        functions.waitForElementToBeVisible(truckingServicesButton);
        truckingServicesButton.click();
    }
    public void clickOnCategoryButton(){
        functions.waitForElementToBeVisible(CategoryButton);
        CategoryButton.click();
    }
    public void clickOnAirFrightTypeButton(){
        functions.waitForElementToBeVisible(airFrightTypeButton);
        airFrightTypeButton.click();
    }
    public void clickOnUsageTypeButton(){
        functions.waitForElementToBeVisible(usageTypeButton);
        usageTypeButton.click();
    }
    public void clickOnShowResultButton(){
        functions.waitForElementToBeVisible(showResultButton);
        showResultButton.click();
    }
    public void clickOnSelectUsageTypeButton(){
        functions.waitForElementToBeVisible(selectUsageTypeButton);
        selectUsageTypeButton.click();
    }
    public void clickOnChooseButton(){
        functions.waitForElementToBeVisible(chooseButton);
        chooseButton.click();
    }
    public void clickOnNumberOfAxlesButton(){
        functions.waitForElementToBeVisible(numberOfAxlesButton);
        numberOfAxlesButton.click();
    }
    public void clickOnSeekBar(){
        functions.waitForElementToBeVisible(SeekBar);
        SeekBar.click();
    }
    public void clickOnSearchBox(){
        functions.waitForElementToBeVisible(SearchBox);
        SearchBox.click();
    }
    public void clickOnChooseFromSearchBox(){
        functions.waitForElementToBeVisible(ChooseFromSearchBox);
        ChooseFromSearchBox.click();
    }
}
