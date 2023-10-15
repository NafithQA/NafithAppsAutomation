package mainTests;

import base.AndroidConfigurations;
import helpers.DatabaseHandler;
import helpers.Functions;
import helpers.Queries.OtherQueries;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.annotations.Test;
import screensObjects.AndroidObjects;
import java.io.IOException;
import java.util.ArrayList;

public class Tests extends AndroidConfigurations {

    @Test(enabled = true)
    public void e2eFlow() throws InterruptedException, IOException {

        Functions functions = new Functions();
        DatabaseHandler databaseHandler = new DatabaseHandler();

        AndroidObjects androidObjects = new AndroidObjects(driver);
        androidObjects.clickOnAllowButton();
        androidObjects.clickOnLanguageButton();
        androidObjects.clickOnNextButton();
        androidObjects.clickOnJordan_Button();
        androidObjects.clickOnNextButton();
        androidObjects.clickOnTransportationCompanyButton();
        androidObjects.clickOnNextButton();
        androidObjects.clickOnNextButton();
        androidObjects.clickOnLetsStartButton();
        androidObjects.clickOnSubscribeNowButton();
        androidObjects.clickOnCountryKeyDropDownList();
        androidObjects.clickOnJordanCountryCodeButton();
        Thread.sleep(1000);
        androidObjects.clickOnPhoneNumberField();
        String phoneNumber = String.valueOf(functions.generateRandomNumber(9));
        System.out.println("Phone number " + phoneNumber);
        androidObjects.fillInPhoneNumberField().sendKeys(phoneNumber);

        androidObjects.clickOnPasswordField();
        String password = functions.generateRandomPassword();
        System.out.println("Password " + password);
        androidObjects.fillInPasswordField(password);

        driver.navigate().back();
        androidObjects.clickOnCreateAccountButton();
        Thread.sleep(5000);
        ArrayList<String> approvalNumberList = databaseHandler.getOTPFromDataBase(OtherQueries.otpNumber(phoneNumber));

        String otpNumber = approvalNumberList.get(0);


         System.out.println("otpNumber " + otpNumber);
        Thread.sleep(2000);

        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(167, 1454)).perform();

        // Creating array of string length
        String[] arr = new String[otpNumber.length()];

        // Copy character by character into array
        for (int i = 0; i < otpNumber.length(); i++) {
            arr[i] = String.valueOf(otpNumber.charAt(i));
        }

        for (int i = 0; i < otpNumber.length(); i++) {
            functions.getOtpCodeNumbers(driver, arr[i]);
        }
        Thread.sleep(5000);

        androidObjects.clickOnRegisterCompanyButton();
        androidObjects.clickOnRegistrationTypeButton();
        androidObjects.clickOnBusinessTypeButton();

        androidObjects.clickOnCommercialNameArabic();
        String commercialNameAr = String.valueOf("الإسم بالعربي أتوميشن " + functions.getRandomNameArabic());
        androidObjects.fillInCommercialNameArField(commercialNameAr);
        driver.navigate().back();

        androidObjects.clickOnCommercialNameEnglish();
        String commercialNameEn = String.valueOf(" Commercial Name Auto En " + functions.getRandomNameEnglish());
        androidObjects.fillInCommercialNameEnField(commercialNameEn);
        driver.navigate().back();

        androidObjects.clickOnCommercialRegNum();
        String CommercialRegNum = String.valueOf(functions.generateRandomNumber(9));
        androidObjects.fillInCommercialRegNum(CommercialRegNum);
        driver.navigate().back();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnJordanCountryCodeButton();
        Thread.sleep(1000);
        androidObjects.clickOnPhoneNumberField();
        String phoneNumberReg = String.valueOf(functions.generateRandomNumber(15));
        androidObjects.fillInPhoneNumberField().sendKeys(phoneNumberReg);
        driver.navigate().back();

        androidObjects.clickOnEmail();
        String Email = String.valueOf(functions.getRandomEmailString() + "@gmail.com");
        androidObjects.fillInEmail(Email);
        driver.navigate().back();

        androidObjects.clickOnCountryDropDownList();
        androidObjects.clickOnJordanCountryCodeButton();


        androidObjects.clickOnGovernorate();
        String governorate = String.valueOf("governorate Auto " + functions.getRandomNameEnglish());
        androidObjects.fillInGovernorate(governorate);
        driver.navigate().back();
        androidObjects.clickOnAddress();
        String address = String.valueOf("address Auto" + functions.getRandomNameEnglish());
        androidObjects.fillInGovernorate(address);

        androidObjects.clickOnNextButton();
        Thread.sleep(1000);
        driver.navigate().back();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnDoneButton();
        androidObjects.clickOnRegisterCompany();
        androidObjects.clickOnRegisterFleet();


        //ADD TRUCKS
        androidObjects.clickOnTruckButton();
        androidObjects.clickOnAddTruckButton();
        androidObjects.clickOnVehicleNationalityDropDownList();
        androidObjects.clickOnJordanCountryCodeButton();

        touchAction.tap(PointOption.point(411, 1205)).perform();
        androidObjects.clickOnDatePicker();
        androidObjects.clickOnChooseDateButton();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnPlateNumberField();
        String PlateNumber = String.valueOf(functions.generateRandomNumber(6));
        androidObjects.fillInPlateNumberField(PlateNumber);

        androidObjects.clickOnFleetPlateCodeField();
        String PlateCode = String.valueOf(functions.getRandomPlateCode());
        androidObjects.fillInFleetPlateCodeField(PlateCode);
        driver.navigate().back();

        androidObjects.clickOnUsageDropDownList();
        androidObjects.clickOnChooseUsageField();
        androidObjects.clickOnVehicleClassButton();

        androidObjects.clickOnVehicleMaxLoadField();
        String VehicleMaxLoad = String.valueOf(functions.generateRandomNumber(6));
        androidObjects.fillInVehicleMaxLoadField(VehicleMaxLoad);
        driver.navigate().back();

        androidObjects.clickOnNumberOfAxlesField();
        String NumberOfAxles = String.valueOf(functions.generateRandomNumber(1));
        androidObjects.fillInNumberOfAxlesField(NumberOfAxles);
        driver.navigate().back();


        androidObjects.clickOnYearField();
        androidObjects.clickOnYearPicker();
        androidObjects.clickOnNextButton();


        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnDoneButton();
        androidObjects.clickOnTruckRegistration();
        androidObjects.clickOnTruckManagement();

        androidObjects.clickOnYearPicker();



        //ADD Trailer
        androidObjects.clickOnTrailerButton();
        androidObjects.clickOnAddTrailerButton();
        androidObjects.clickOnVehicleNationalityDropDownList();
        androidObjects.clickOnJordanCountryCodeButton();

        touchAction.tap(PointOption.point(411, 1205)).perform();
        androidObjects.clickOnDatePicker();
        androidObjects.clickOnChooseDateButton();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnPlateNumberField();
        String PlateNumberTrailer = String.valueOf(functions.generateRandomNumber(6));
        androidObjects.fillInPlateNumberField(PlateNumberTrailer);

        androidObjects.clickOnFleetPlateCodeField();
        String PlateCodeTrailer = String.valueOf(functions.getRandomPlateCode());
        androidObjects.fillInFleetPlateCodeField(PlateCodeTrailer);
        driver.navigate().back();

        androidObjects.clickOnUsageDropDownList();
        androidObjects.clickOnChooseUsageField();
        androidObjects.clickOnVehicleClassButton();

        androidObjects.clickOnVehicleMaxLoadField();
        String VehicleMaxLoadTrailer = String.valueOf(functions.generateRandomNumber(6));
        androidObjects.fillInVehicleMaxLoadField(VehicleMaxLoadTrailer);
        driver.navigate().back();

        androidObjects.clickOnNumberOfAxlesField();
        String NumberOfAxlesTrailer = String.valueOf(functions.generateRandomNumber(1));
        androidObjects.fillInNumberOfAxlesField(NumberOfAxlesTrailer);
        driver.navigate().back();


        androidObjects.clickOnYearField();
        androidObjects.clickOnYearPicker();
        androidObjects.clickOnNextButton();


        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnDoneButton();
        androidObjects.clickOnTrailerRegistration();
        androidObjects.clickOnTrailerManagement();
        androidObjects.clickOnYearPicker();

        //ADD equipment
        androidObjects.clickOnEquipmentButton();
        androidObjects.clickOnAddEquipmentButton();
        androidObjects.clickOnVehicleNationalityDropDownList();
        androidObjects.clickOnJordanCountryCodeButton();

        touchAction.tap(PointOption.point(411, 1205)).perform();
        androidObjects.clickOnDatePicker();
        androidObjects.clickOnChooseDateButton();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnPlateNumberField();
        String PlateNumberEquipment = String.valueOf(functions.generateRandomNumber(6));
        androidObjects.fillInPlateNumberField(PlateNumberEquipment);

        androidObjects.clickOnFleetPlateCodeField();
        String PlateCodeEquipment = String.valueOf(functions.getRandomPlateCode());
        androidObjects.fillInFleetPlateCodeField(PlateCodeEquipment);
        driver.navigate().back();

        androidObjects.clickOnUsageDropDownList();
        androidObjects.clickOnChooseUsageField();
        androidObjects.clickOnVehicleClassButton();

        androidObjects.clickOnVehicleMaxLoadField();
        String VehicleMaxLoadEquipment = String.valueOf(functions.generateRandomNumber(6));
        androidObjects.fillInVehicleMaxLoadField(VehicleMaxLoadEquipment);
        driver.navigate().back();

        androidObjects.clickOnNumberOfAxlesField();
        String NumberOfAxlesEquipment = String.valueOf(functions.generateRandomNumber(1));
        androidObjects.fillInNumberOfAxlesField(NumberOfAxlesEquipment);
        driver.navigate().back();


        androidObjects.clickOnYearField();
        androidObjects.clickOnYearPicker();
        androidObjects.clickOnNextButton();


        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnNextButton();

        androidObjects.clickOnaAttachment1();
        androidObjects.clickOnChooseFromGallery();
        androidObjects.clickOnChooseAttachments();
        androidObjects.clickOnDoneButton();
        androidObjects.clickOnEquipmentRegistration();
        androidObjects.clickOnEquipmentManagement();
        androidObjects.clickOnYearPicker();
    }
}
