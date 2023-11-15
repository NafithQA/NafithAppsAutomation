package pageModels;

import helpers.Functions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetRegistrationPage {
    Functions functions = new Functions();
    public FleetRegistrationPage(AndroidDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(xpath=  "//android.widget.Button[@content-desc='Fleet Management']")
    public WebElement fleetManagementButton;
    @FindBy(xpath= "//android.widget.Button[@content-desc='Add Truck']")
    public WebElement truckButton;
    @FindBy(xpath= "//android.widget.Button[@content-desc='Add Trailer']")
    public WebElement trailerButton;
    @FindBy(xpath= "//android.widget.Button[@content-desc='Add Equipment']")
    public WebElement equipmentButton;
    @FindBy(xpath=  "(//android.widget.ImageView)[1]")
    public WebElement addTruckButton;
    @FindBy(xpath=  "(//android.widget.ImageView)[2]")
    public WebElement addTrailerButton;
    @FindBy(xpath=  "(//android.widget.ImageView)[3]")
    public WebElement addEquipmentButton;
    @FindBy(xpath= "//android.widget.ImageView")
    public WebElement vehicleNationalityDropDownList;
    @FindBy(xpath= "(//android.view.View)[50]")
    public WebElement datePicker;
    @FindBy(xpath= "//android.widget.Button[@content-desc='Choose']")
    public WebElement chooseDateButton;
    @FindBy(xpath = "//android.view.View[@content-desc='Jordan']")
    public WebElement jordanCountryCodeButton;
    @FindBy(xpath = "//android.widget.Button[@content-desc='Next']")
    public WebElement nextButton;
    @FindBy(xpath= "(//android.widget.EditText)[1]")
    public WebElement plateNumberField;
    @FindBy(xpath= "(//android.widget.EditText)[2]")
    public WebElement fleetPlateCodeField;
    @FindBy(xpath= "(//android.view.View[@content-desc='Usage'])[2]")
    public WebElement usageField;
    @FindBy(xpath= "(//android.view.View)[6]")
    public WebElement chooseUsageField;
    @FindBy(xpath= "//android.view.View[@content-desc=\"Heavy Truck\"]")
    public WebElement vehicleClassButton;
    @FindBy(xpath= "(//android.widget.EditText)[3]")
    public WebElement vehicleMaxLoad;
    @FindBy(xpath= "(//android.widget.EditText)[4]")
    public WebElement numberOfAxles;
    @FindBy(xpath= "(//android.widget.EditText)[2]")
    public WebElement numberOfAxlesField;
    @FindBy(xpath= "(//android.view.View)[22]")
    public WebElement yearField;
    @FindBy(xpath= "//android.widget.Button")
    public WebElement yearPickerField;
    @FindBy(xpath= "//android.widget.Button[@content-desc='Truck Registration']")
    public WebElement registerTruck;
    @FindBy(xpath= "//android.widget.Button[@content-desc='Trailer Registration']")
    public WebElement registerTrailer;
    @FindBy(xpath= "//android.widget.Button[@content-desc='Equipment registration']")
    public WebElement registerEquipment;
    @FindBy(xpath= "//android.widget.Button[@content-desc='Truck management']")
    public WebElement truckManagementButton;
    @FindBy(xpath= " //android.widget.Button[@content-desc='Trailer management']")
    public WebElement trailerManagementButton;
    @FindBy(xpath= " //android.widget.Button[@content-desc='Equipment management']")
    public WebElement equipmentManagementButton;
    @FindBy(xpath=  "//android.widget.Button")
    public WebElement closeButton;

    public void clickOnFleetManagement() throws InterruptedException {
        Thread.sleep(1000);
        functions.waitForElementToBeVisible(fleetManagementButton);
        fleetManagementButton.click();
    }
    public void clickOnTruckButton() {
        functions.waitForElementToBeVisible(truckButton);
        truckButton.click();
    }
    public void clickOnTrailerButton() {
        functions.waitForElementToBeVisible(trailerButton);
        trailerButton.click();
    }
    public void clickOnEquipmentButton() {
        functions.waitForElementToBeVisible(equipmentButton);
        equipmentButton.click();
    }
    public void clickOnAddTruckButton() {
        functions.waitForElementToBeVisible(addTruckButton);
        addTruckButton.click();
    }
    public void clickOnAddTrailerButton() {
        functions.waitForElementToBeVisible(addTrailerButton);
        addTrailerButton.click();
    }
    public void clickOnAddEquipmentButton() {
        functions.waitForElementToBeVisible(addEquipmentButton);
        addEquipmentButton.click();
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
    public void clickOnJordanCountryCodeButton() {
        functions.waitForElementToBeVisible(jordanCountryCodeButton);
        jordanCountryCodeButton.click();
    }
    public void clickOnNextButton() throws InterruptedException {
        Thread.sleep(1000);
        functions.waitForElementToBeVisible(nextButton);
        nextButton.click();
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
        functions.waitForElementToBeVisible(vehicleMaxLoad);
        vehicleMaxLoad.sendKeys(VehicleMaxLoad);
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

    public void clickOnTruckRegistration() {
        functions.waitForElementToBeVisible(registerTruck);
        registerTruck.click();
    }
    public void clickOnTrailerRegistration() {
        functions.waitForElementToBeVisible(registerTrailer);
        registerTrailer.click();
    }
    public void clickOnEquipmentRegistration() {
        functions.waitForElementToBeVisible(registerEquipment);
        registerEquipment.click();
    }
    public void clickOnTruckManagement()   {
        functions.waitForElementToBeVisible(truckManagementButton);
        truckManagementButton.click();
    }
    public void clickOnTrailerManagement()   {
        functions.waitForElementToBeVisible(trailerManagementButton);
        trailerManagementButton.click();
    }
    public void clickOnEquipmentManagement()   {
        functions.waitForElementToBeVisible(equipmentManagementButton);
        equipmentManagementButton.click();
    }
    public void clickOnCloseButton() {
        functions.waitForElementToBeVisible(closeButton);
        closeButton.click();
    }


}
