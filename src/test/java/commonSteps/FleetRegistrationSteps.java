package commonSteps;

import base.AndroidConfigurations;
import helpers.Functions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;
import pageModels.FleetRegistrationPage;
import pageModels.StakeholdersRegistrationPage;

import java.io.IOException;

public class FleetRegistrationSteps  extends AndroidConfigurations {
    public FleetRegistrationSteps(AndroidDriver driver) {
        PageFactory.initElements(driver, this);}

    Functions functions = new Functions();
    public void navigateToFleetTruckRegistrationPage(){
        FleetRegistrationPage fleetRegistrationPage = new FleetRegistrationPage(driver);

         fleetRegistrationPage.clickOnTrucksFleetManagement();
        fleetRegistrationPage.clickOnAddTruckButton();
    }

    public void navigateToFleetTrailersRegistrationPage()  {
        FleetRegistrationPage fleetRegistrationPage = new FleetRegistrationPage(driver);

        fleetRegistrationPage.clickOnTrailerFleetsManagement();
        fleetRegistrationPage.clickOnAddTrailerButton();
    }
    public void navigateToFleetEquipmentRegistrationPage() throws IOException, InterruptedException {
        FleetRegistrationPage fleetRegistrationPage = new FleetRegistrationPage(driver);

        fleetRegistrationPage.clickOnEquipmentFleetManagement();
        fleetRegistrationPage.clickOnAddEquipmentButton();
    }
    public void navigateToFleetRegistrationPage() throws IOException, InterruptedException {
        FleetRegistrationPage fleetRegistrationPage = new FleetRegistrationPage(driver);
        TouchAction touchAction = new TouchAction(driver);
        Functions functions = new Functions();

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
        Thread.sleep(1000);
        fleetRegistrationPage.clickOnYearField();
        Thread.sleep(1000);
        fleetRegistrationPage.clickOnYearPicker();
        fleetRegistrationPage.clickOnNextButton();
    }

    public void navigateCompleteTruckRegistrationPage() {
        FleetRegistrationPage fleetRegistrationPage = new FleetRegistrationPage(driver);
        TouchAction touchAction = new TouchAction(driver);

        fleetRegistrationPage.clickOnTruckRegistration();
        fleetRegistrationPage.clickOnTruckManagement();
        fleetRegistrationPage.clickOnCloseButton();
        touchAction.tap(PointOption.point(77, 181)).perform();
    }
    public void navigateCompleteTrailerRegistrationPage(){
        FleetRegistrationPage fleetRegistrationPage = new FleetRegistrationPage(driver);
        TouchAction touchAction = new TouchAction(driver);

        fleetRegistrationPage.clickOnTrailerRegistration();
        fleetRegistrationPage.clickOnTrailerManagement();
        fleetRegistrationPage.clickOnCloseButton();
        touchAction.tap(PointOption.point(77, 181)).perform();
    }
    public void navigateCompleteEquipmentRegistrationPage()  {
        FleetRegistrationPage fleetRegistrationPage = new FleetRegistrationPage(driver);
        TouchAction touchAction = new TouchAction(driver);

        fleetRegistrationPage.clickOnEquipmentRegistration();
        fleetRegistrationPage.clickOnEquipmentManagement();
        fleetRegistrationPage.clickOnCloseButton();
        touchAction.tap(PointOption.point(77, 181)).perform();
    }
    public void uploadFleetRegistrationAttachments() throws IOException, InterruptedException {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
        //attachment 1
        stakeholdersRegistrationPage.clickOnaAttachment1();
        stakeholdersRegistrationPage.clickOnChooseFromGallery();
        stakeholdersRegistrationPage.clickOnChooseAttachments();
        stakeholdersRegistrationPage.clickOnNextButton();
        //attachment 2
        stakeholdersRegistrationPage.clickOnaAttachment1();
        stakeholdersRegistrationPage.clickOnChooseFromGallery();
        stakeholdersRegistrationPage.clickOnChooseAttachments();
        stakeholdersRegistrationPage.clickOnNextButton();
        //attachment 3
        stakeholdersRegistrationPage.clickOnaAttachment1();
        stakeholdersRegistrationPage.clickOnChooseFromGallery();
        stakeholdersRegistrationPage.clickOnChooseAttachments();
        stakeholdersRegistrationPage.clickOnNextButton();
        //attachment 4
        stakeholdersRegistrationPage.clickOnaAttachment1();
        stakeholdersRegistrationPage.clickOnChooseFromGallery();
        stakeholdersRegistrationPage.clickOnChooseAttachments();
        stakeholdersRegistrationPage.clickOnNextButton();
        //attachment 5
        stakeholdersRegistrationPage.clickOnaAttachment1();
        stakeholdersRegistrationPage.clickOnChooseFromGallery();
        stakeholdersRegistrationPage.clickOnChooseAttachments();

        stakeholdersRegistrationPage.clickOnDoneButton();
    }
}

