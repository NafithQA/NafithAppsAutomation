package screensObjects;

import helpers.Functions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.io.IOException;
public class AndroidObjects {

    Functions functions = new Functions();

    public AndroidObjects(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Skip']")
    public WebElement skipButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc='English']")
    public WebElement LanguageButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Next']")
    public WebElement nextButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Jordan']")
    public WebElement jordan_Button;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public WebElement allowButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Trucking Company']")
    public WebElement transportationCompanyButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Let's Start\"]")
    public WebElement letsStartButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Register Now']")
    public WebElement subscribeNowButton;

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

    @FindBy(xpath= "//android.widget.EditText")
    public WebElement passwordField;

    @FindBy(xpath = "(//android.widget.Button)[2]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//android.view.View[@content-desc=\"-\n" +
            "-\n" +
            "-\n" +
            "-\n" +
            "-\n" +
            "-\"]")
    public WebElement otpField;
    @FindBy(xpath= "//android.widget.Button[@content-desc='Register your company']")
    public WebElement registerCompanyButton;

    @FindBy(xpath= "//android.view.View[@content-desc='Trucking Company']")
    public WebElement registerTypeButton;

    @FindBy(xpath= "//android.view.View[@content-desc='Transportation']")
    public WebElement businessTypeButton;

    @FindBy(xpath= "(//android.widget.EditText)[1]")
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

    @FindBy(xpath= "(//android.widget.Button)[2]")
    public WebElement exitButton;

    @FindBy(xpath= "//android.widget.Button[@content-desc='Done']")
    public WebElement doneButton;
    @FindBy(xpath= "//android.view.View[@content-desc=\"Choose from gallery\"]")
    public WebElement chooseFromGalleryAttach;

    @FindBy(xpath= "(//android.widget.ImageView)[4]")
    public WebElement chooseAttachments;

    @FindBy(xpath= "//android.widget.Button[@content-desc='Register Company']")
    public WebElement registerCompany;

    @FindBy(xpath= "//android.widget.Button[@content-desc='Register your fleet']")
    public WebElement registerFleet;
    @FindBy(xpath= "(//android.widget.ImageView)[1]")
    public WebElement truckButton;

    @FindBy(xpath= "//android.widget.Button[@content-desc='Add Truck']")
    public WebElement addTruckButton;

    @FindBy(xpath= "//android.widget.ImageView")
    public WebElement vehicleNationalityDropDownList;

    @FindBy(xpath= "(//android.view.View)[50]")
    public WebElement datePicker;

    @FindBy(xpath= "//android.widget.Button[@content-desc='Choose']")
    public WebElement chooseDateButton;

    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]")
    public WebElement plateNumberField;

    @FindBy(xpath= "(//android.widget.EditText)[2]")
    public WebElement fleetPlateCodeField;

    @FindBy(xpath= "(//android.view.View[@content-desc='Usage'])[2]")
    public WebElement usageField;

    @FindBy(xpath= "(//android.view.View)[6]")
    public WebElement chooseUsageField;


    @FindBy(xpath= "(//android.view.View)[22]")
    public WebElement vehicleClassButton;

    @FindBy(xpath= "(//android.widget.EditText)[3]")
    public WebElement vehicleMaxLoad;

    @FindBy(xpath= "(//android.widget.EditText)[1]")
    public WebElement vehicleMaxLoadField;

    @FindBy(xpath= "(//android.widget.EditText)[4]")
    public WebElement numberOfAxles;

    @FindBy(xpath= "(//android.widget.EditText)[2]")
    public WebElement numberOfAxlesField;

    @FindBy(xpath= "(//android.view.View)[26]")
    public WebElement yearField;

    @FindBy(xpath= "//android.widget.Button")
    public WebElement yearPickerField;
    @FindBy(xpath= "//android.widget.Button[@content-desc=\"Truck Registration\"]")
    public WebElement truckRegistration;

    @FindBy(xpath= "//android.widget.Button[@content-desc='Truck management']")
    public WebElement truckManagement;

    @FindBy(xpath= "(//android.widget.ImageView)[2]")
    public WebElement trailerButton;

    @FindBy(xpath= "//android.widget.Button[@content-desc='Add Trailer']")
    public WebElement addTrailerButton;

    @FindBy(xpath= "//android.widget.Button[@content-desc=\"Trailer Registration\"]")
    public WebElement trailerRegistration;

    @FindBy(xpath= "//android.widget.Button[@content-desc='Trailer management']")
    public WebElement trailerManagement;


    @FindBy(xpath= "(//android.widget.ImageView)[3]")
    public WebElement equipmentButton;

    @FindBy(xpath= "//android.widget.Button[@content-desc='Add Equipment']")
    public WebElement addEquipmentButton;

    @FindBy(xpath= "//android.widget.Button[@content-desc='Equipment registration']")
    public WebElement equipmentRegistration;

    @FindBy(xpath= "//android.widget.Button[@content-desc='Equipment management']")
    public WebElement equipmentManagement;


    public void clickOnSkipButton() {
        functions.waitForElementToBeVisible(skipButton);
        skipButton.click();
    }

    public void clickOnLanguageButton() {
        functions.waitForElementToBeVisible(LanguageButton);
        LanguageButton.click();
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

    public void clickOnAllowButton() {
        functions.waitForElementToBeVisible(allowButton);
        allowButton.click();
    }

    public void clickOnTransportationCompanyButton() {
        functions.waitForElementToBeVisible(transportationCompanyButton);
        transportationCompanyButton.click();
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

    public void clickOnOtpField() {
        functions.waitForElementToBeVisible(otpField);
        otpField.click();
    }

    public WebElement getOtpField() {
        functions.waitForElementToBeVisible(otpField);
        return otpField;
    }
    public void fillInOtpField(String otpNumber) {
        functions.waitForElementToBeVisible(otpField);
        otpField.sendKeys(otpNumber);
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
    public void clickOnCommercialNameArabic() {
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
    public void fillInAddress(String Email) {
        functions.waitForElementToBeVisible(addressField);
        addressField.sendKeys(Email);
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
        Thread.sleep(2000);
        functions.waitForElementToBeVisible(doneButton);
        doneButton.click();
    }
    public void clickOnRegisterCompany() {
        functions.waitForElementToBeVisible(registerCompany);
        registerCompany.click();
    }

    public void clickOnRegisterFleet()   {
        functions.waitForElementToBeVisible(registerFleet);
        registerFleet.click();
    }

    public void clickOnTruckButton() {
        functions.waitForElementToBeVisible(truckButton);
        truckButton.click();
    }

    public void clickOnAddTruckButton() {
        functions.waitForElementToBeVisible(addTruckButton);
        addTruckButton.click();
    }

    public void clickOnVehicleNationalityDropDownList() {
        functions.waitForElementToBeVisible(vehicleNationalityDropDownList);
        vehicleNationalityDropDownList.click();
    }
    public void clickOnDatePicker() {
        functions.waitForElementToBeVisible(datePicker);
        datePicker.click();
    }
    public void clickOnChooseDateButton() {
        functions.waitForElementToBeVisible(chooseDateButton);
        chooseDateButton.click();
    }
    public void clickOnPlateNumberField() {
        functions.waitForElementToBeVisible(plateNumberField);
        plateNumberField.click();
    }
    public void fillInPlateNumberField(String PlateNumber) {
        functions.waitForElementToBeVisible(plateNumberField);
        plateNumberField.sendKeys(PlateNumber);
    }

    public void clickOnFleetPlateCodeField() {
        functions.waitForElementToBeVisible(fleetPlateCodeField);
        fleetPlateCodeField.click();
    }
    public void fillInFleetPlateCodeField(String PlateNumber) {
        functions.waitForElementToBeVisible(fleetPlateCodeField);
        fleetPlateCodeField.sendKeys(PlateNumber);
    }

    public void clickOnUsageDropDownList() {
        functions.waitForElementToBeVisible(usageField);
        usageField.click();
    }
    public void clickOnChooseUsageField() {
        functions.waitForElementToBeVisible(chooseUsageField);
        chooseUsageField.click();
    }

    public void clickOnVehicleClassButton(){
        functions.waitForElementToBeVisible(vehicleClassButton);
        vehicleClassButton.click();
    }

    public void clickOnVehicleMaxLoadField(){
        functions.waitForElementToBeVisible(vehicleMaxLoad);
        vehicleMaxLoad.click();
    }

    public void fillInVehicleMaxLoadField(String VehicleMaxLoad) {
        functions.waitForElementToBeVisible(vehicleMaxLoadField);
        vehicleMaxLoadField.sendKeys(VehicleMaxLoad);
    }
    public void clickOnNumberOfAxlesField(){
        functions.waitForElementToBeVisible(numberOfAxles);
        numberOfAxles.click();
    }

    public void fillInNumberOfAxlesField(String VehicleMaxLoad) {
        functions.waitForElementToBeVisible(numberOfAxlesField);
        numberOfAxlesField.sendKeys(VehicleMaxLoad);
    }

    public void clickOnYearField(){
        functions.waitForElementToBeVisible(yearField);
        yearField.click();
    }
    public void clickOnYearPicker(){
        functions.waitForElementToBeVisible(yearPickerField);
        yearPickerField.click();
    }
    public void clickOnTruckRegistration(){
        functions.waitForElementToBeVisible(truckRegistration);
        truckRegistration.click();
    }

    public void clickOnTruckManagement(){
        functions.waitForElementToBeVisible(truckManagement);
        truckManagement.click();
    }
    public void clickOnTrailerButton() {
        functions.waitForElementToBeVisible(trailerButton);
        trailerButton.click();
    }
    public void clickOnAddTrailerButton() {
        functions.waitForElementToBeVisible(addTrailerButton);
        addTrailerButton.click();
    }

    public void clickOnTrailerRegistration(){
        functions.waitForElementToBeVisible(trailerRegistration);
        trailerRegistration.click();
    }
    public void clickOnTrailerManagement(){
        functions.waitForElementToBeVisible(trailerManagement);
        trailerManagement.click();
    }
    public void clickOnEquipmentButton() {
        functions.waitForElementToBeVisible(equipmentButton);
        equipmentButton.click();
    }

    public void clickOnAddEquipmentButton() {
        functions.waitForElementToBeVisible(addEquipmentButton);
        addEquipmentButton.click();
    }

    public void clickOnEquipmentRegistration(){
        functions.waitForElementToBeVisible(equipmentRegistration);
        equipmentRegistration.click();
    }
    public void clickOnEquipmentManagement(){
        functions.waitForElementToBeVisible(equipmentManagement);
        equipmentManagement.click();
    }

}
