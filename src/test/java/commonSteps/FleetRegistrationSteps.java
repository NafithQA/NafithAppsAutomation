package commonSteps;

import base.AndroidConfigurations;
import helpers.DatabaseHandler;
import helpers.Functions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;
import pageModels.FleetRegistrationPage;

import java.io.IOException;

public class FleetRegistrationSteps  extends AndroidConfigurations {
    public FleetRegistrationSteps(AndroidDriver driver) {
        PageFactory.initElements(driver, this);}
    DatabaseHandler databaseHandler = new DatabaseHandler();
    Functions functions = new Functions();
    public void navigateToFleetRegistrationPage()  {
        FleetRegistrationPage fleetRegistrationPage = new FleetRegistrationPage(driver);

        fleetRegistrationPage.clickOnFleetManagement();
    }
    public void navigateToTruckRegistrationPage() throws IOException, InterruptedException {
        FleetRegistrationPage fleetRegistrationPage = new FleetRegistrationPage(driver);
        TouchAction touchAction = new TouchAction(driver);
        Functions functions = new Functions();
        fleetRegistrationPage.clickOnAddTruckButton();
        fleetRegistrationPage.clickOnTruckButton();
        fleetRegistrationPage.clickOnVehicleNationalityDropDownList();
        fleetRegistrationPage.clickOnJordanCountryCodeButton();
        touchAction.tap(PointOption.point(156, 1000)).perform();
        fleetRegistrationPage.clickOnDatePicker();
        fleetRegistrationPage.clickOnChooseDateButton();
        fleetRegistrationPage.clickOnNextButton();
        fleetRegistrationPage.clickOnPlateNumberField();
        String PlateNumber = String.valueOf(functions.generateRandomNumber(6));
        fleetRegistrationPage.fillInPlateNumberField(PlateNumber);
        fleetRegistrationPage.clickOnFleetPlateCodeField();
        String PlateCode = String.valueOf(functions.getRandomPlateCode());
        fleetRegistrationPage.fillInFleetPlateCodeField(PlateCode);
        driver.navigate().back();
        fleetRegistrationPage.clickOnUsageDropDownList();
        fleetRegistrationPage.clickOnChooseUsageField();
        fleetRegistrationPage.clickOnVehicleClassButton();
        fleetRegistrationPage.clickOnVehicleMaxLoadField();
        String VehicleMaxLoad = String.valueOf(functions.generateRandomNumber(6));
        fleetRegistrationPage.fillInVehicleMaxLoadField(VehicleMaxLoad);
        driver.navigate().back();
        fleetRegistrationPage.clickOnNumberOfAxlesField();
        String NumberOfAxles = String.valueOf(functions.generateRandomNumber(1));
        fleetRegistrationPage.fillInNumberOfAxlesField(NumberOfAxles);
        driver.navigate().back();
        fleetRegistrationPage.clickOnYearField();
        fleetRegistrationPage.clickOnYearPicker();
        fleetRegistrationPage.clickOnNextButton();
    }

    public void navigateToTrailerRegistrationPage() throws IOException, InterruptedException {
        FleetRegistrationPage fleetRegistrationPage = new FleetRegistrationPage(driver);
        TouchAction touchAction = new TouchAction(driver);

        fleetRegistrationPage.clickOnAddTruckButton();
        fleetRegistrationPage.clickOnTruckButton();
        fleetRegistrationPage.clickOnVehicleNationalityDropDownList();
        fleetRegistrationPage.clickOnJordanCountryCodeButton();
        touchAction.tap(PointOption.point(411, 1205)).perform();
        fleetRegistrationPage.clickOnDatePicker();
        fleetRegistrationPage.clickOnChooseDateButton();
        fleetRegistrationPage.clickOnNextButton();
        fleetRegistrationPage.clickOnPlateNumberField();
        String PlateNumber = String.valueOf(functions.generateRandomNumber(6));
        fleetRegistrationPage.fillInPlateNumberField(PlateNumber);
        fleetRegistrationPage.clickOnFleetPlateCodeField();
        String PlateCode = String.valueOf(functions.getRandomPlateCode());
        fleetRegistrationPage.fillInFleetPlateCodeField(PlateCode);
        driver.navigate().back();
        fleetRegistrationPage.clickOnUsageDropDownList();
        fleetRegistrationPage.clickOnChooseUsageField();
        fleetRegistrationPage.clickOnVehicleClassButton();
        fleetRegistrationPage.clickOnVehicleMaxLoadField();
        String VehicleMaxLoad = String.valueOf(functions.generateRandomNumber(6));
        fleetRegistrationPage.fillInVehicleMaxLoadField(VehicleMaxLoad);
        driver.navigate().back();
        fleetRegistrationPage.clickOnNumberOfAxlesField();
        String NumberOfAxles = String.valueOf(functions.generateRandomNumber(1));
        fleetRegistrationPage.fillInNumberOfAxlesField(NumberOfAxles);
        driver.navigate().back();
        fleetRegistrationPage.clickOnYearField();
        fleetRegistrationPage.clickOnYearPicker();
        fleetRegistrationPage.clickOnNextButton();
    }

}

