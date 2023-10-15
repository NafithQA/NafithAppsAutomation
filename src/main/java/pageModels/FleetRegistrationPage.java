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
    @FindBy(xpath= "(//android.widget.ImageView)[1]")
    public WebElement truckButton;
    @FindBy(xpath=  "//android.widget.Button[@content-desc='Add Truck']")
    public WebElement addTruckButton;
    @FindBy(xpath= "//android.widget.ImageView")
    public WebElement vehicleNationalityDropDownList;

    @FindBy(xpath= "(//android.view.View)[50]")
    public WebElement datePicker;

    @FindBy(xpath= "//android.widget.Button[@content-desc='Choose']")
    public WebElement chooseDateButton;
    @FindBy(xpath = "(//android.view.View)[7]")
    public WebElement jordanCountryCodeButton;
    @FindBy(xpath = "//android.widget.Button[@content-desc='Next']")
    public WebElement nextButton;
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

    public void clickOnFleetManagement() {
        functions.waitForElementToBeVisible(fleetManagementButton);
        fleetManagementButton.click();
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



}
