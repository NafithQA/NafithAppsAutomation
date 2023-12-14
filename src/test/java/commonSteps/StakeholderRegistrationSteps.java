package commonSteps;

import base.AndroidConfigurations;
import helpers.DataLoader;
import helpers.DatabaseHandler;
import helpers.Functions;
import helpers.Queries.OtherQueries;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;
import pageModels.FleetRegistrationPage;
import pageModels.StakeholdersRegistrationPage;
import java.io.IOException;
import java.util.ArrayList;
public class StakeholderRegistrationSteps  extends AndroidConfigurations {
    public StakeholderRegistrationSteps(AndroidDriver driver) {
        PageFactory.initElements(driver, this);}
    Functions functions = new Functions();
    TouchAction touchAction = new TouchAction(driver);
    public void navigateToRegistrationPage(int Role ,boolean Login) throws InterruptedException {
      StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
 
      stakeholdersRegistrationPage.clickOnAllowButton();
      stakeholdersRegistrationPage.clickOnNextButton();
      stakeholdersRegistrationPage.clickOnJordan_Button();
      stakeholdersRegistrationPage.clickOnNextButton();
        switch (Role) {
            case 1:
                stakeholdersRegistrationPage.clickOnTruckingCompanyButton();
                break;
            case 2:
                stakeholdersRegistrationPage.clickOnClearanceServicesButton();
                break;
            case 3:
                stakeholdersRegistrationPage.clickOnInsuranceServicesButton();
                break;
            case 4:
                stakeholdersRegistrationPage.clickOnForwardingServicesButton();
                break;
            case 5:
                stakeholdersRegistrationPage.clickOnCargoOwnerButton();
                break;
        }
        stakeholdersRegistrationPage.clickOnLetsStartButton();
        if (Login == true){
            stakeholdersRegistrationPage.clickOnAccountButton();
            stakeholdersRegistrationPage.clickOnLoginPage();
        }
       }
    public void fillInRoleRegistrationButton() throws IOException, InterruptedException {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
        DatabaseHandler databaseHandler = new DatabaseHandler();

        stakeholdersRegistrationPage.clickOnRegisterCompanyButton();
        stakeholdersRegistrationPage.clickOnPhoneNumberField();
        String phoneNumber = String.valueOf(functions.generateRandomNumber(9));
        System.out.println("Phone number " + phoneNumber);
        stakeholdersRegistrationPage.fillInPhoneNumberField().sendKeys(phoneNumber);
        stakeholdersRegistrationPage.clickOnPasswordField();
        String password = functions.generateRandomPassword();
        System.out.println("Password " + password);
        stakeholdersRegistrationPage.fillInPasswordField(password);
        driver.navigate().back();
        stakeholdersRegistrationPage.clickOnCreateAccountButton();
        Thread.sleep(5000);
        ArrayList<String> approvalNumberList = databaseHandler.getOTPFromDataBase(OtherQueries.otpNumber(phoneNumber));
        String otpNumber = approvalNumberList.get(0);
        System.out.println("otpNumber " + otpNumber);
        Thread.sleep(2000);
        touchAction.tap(PointOption.point(113, 1463)).perform();
        // Creating array of string length
        String[] arr = new String[otpNumber.length()];
        // Copy character by character into array
        for (int i = 0; i < otpNumber.length(); i++) {
            arr[i] = String.valueOf(otpNumber.charAt(i));
        }
        for (int i = 0; i < otpNumber.length(); i++) {
            functions.getOtpCodeNumbers(driver, arr[i]);
        }
       Thread.sleep(1000);
    }
    public void fillInRoleRegistrationInfo(int BusinessActivity) throws IOException, InterruptedException{
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);

        stakeholdersRegistrationPage.clickOnRegisterYourActivityButton();
        switch (BusinessActivity) {
            case 1:
                 stakeholdersRegistrationPage.clickOnTruckingCompanyBusinessActivityButton();
                break;
            case 2:
                 stakeholdersRegistrationPage.clickOnClearanceServicesBusinessActivityButton();
                break;
            case 3:
                 stakeholdersRegistrationPage.clickOnInsuranceServicesBusinessActivityButton();
                break;
            case 4:
                 stakeholdersRegistrationPage.clickOnForwardingServicesBusinessActivityButton();
                break;
            case 5:
                 stakeholdersRegistrationPage.clickOnCargoOwnerBusinessActivityButton();
                break;
            case 6:
                stakeholdersRegistrationPage.clickOnIndividualButton();
                stakeholdersRegistrationPage.clickOnTruckingCompanyBusinessActivityButton();
                break;
            case 7:
                stakeholdersRegistrationPage.clickOnIndividualButton();
                stakeholdersRegistrationPage.clickOnCargoOwnerBusinessActivityButton();
                break;
        }
        stakeholdersRegistrationPage.clickOnNextButton();
        stakeholdersRegistrationPage.clickOnCommercialNameArabic();
        String commercialNameAr = String.valueOf("الإسم بالعربي أتوميشن " + functions.getRandomNameArabic());
        stakeholdersRegistrationPage.fillInCommercialNameArField(commercialNameAr);
        driver.navigate().back();
        stakeholdersRegistrationPage.clickOnCommercialNameEnglish();
        String commercialNameEn = String.valueOf(" Commercial Name Auto En " + functions.getRandomNameEnglish());
        stakeholdersRegistrationPage.fillInCommercialNameEnField(commercialNameEn);
        driver.navigate().back();
        stakeholdersRegistrationPage.clickOnCommercialRegNum();
        String CommercialRegNum = String.valueOf(functions.generateRandomNumber(9));
        stakeholdersRegistrationPage.fillInCommercialRegNum(CommercialRegNum);
        driver.navigate().back();
        stakeholdersRegistrationPage.clickOnNextButton();
        Thread.sleep(1000);
        stakeholdersRegistrationPage.clickOnPhoneNumberField();
        String phoneNumberReg = String.valueOf(functions.generateRandomNumber(15));
        stakeholdersRegistrationPage.fillInPhoneNumberField().sendKeys(phoneNumberReg);
        driver.navigate().back();
        stakeholdersRegistrationPage.clickOnEmail();
        String Email = String.valueOf(functions.getRandomEmailString() + "@gmail.com");
        stakeholdersRegistrationPage.fillInEmail(Email);
        driver.navigate().back();
        stakeholdersRegistrationPage.clickOnAddress();
        String address = String.valueOf("address Auto" + functions.getRandomNameEnglish());
        stakeholdersRegistrationPage.fillInAddress(address);
        driver.navigate().back();
        stakeholdersRegistrationPage.clickOnCountryDropDownList();
        stakeholdersRegistrationPage.clickOnJordanCountryCodeButton();
        stakeholdersRegistrationPage.clickOnGovernorate();
        String governorate = String.valueOf("governorate Auto " + functions.getRandomNameEnglish());
        stakeholdersRegistrationPage.fillInGovernorate(governorate);
        stakeholdersRegistrationPage.clickOnNextButton();
    }
    public void uploadStakeholderRegistrationAttachments(int AttachmentFlag) throws IOException, InterruptedException {
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
        if (AttachmentFlag==1) {
            stakeholdersRegistrationPage.clickOnNextButton();
            //attachment 3
            stakeholdersRegistrationPage.clickOnaAttachment1();
            stakeholdersRegistrationPage.clickOnChooseFromGallery();
            stakeholdersRegistrationPage.clickOnChooseAttachments();
        }
        stakeholdersRegistrationPage.clickOnDoneButton();
        stakeholdersRegistrationPage.clickOnRegisterButton();
        stakeholdersRegistrationPage.clickOnBackToHomePage();
    }
    public void fillInTruckingCompanyLoginInfo () throws InterruptedException, IOException {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
        DataLoader dataLoader = new DataLoader();

        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(899, 1532)).perform();
        stakeholdersRegistrationPage.clickOnPhoneNumberField();
        stakeholdersRegistrationPage.fillInPhoneNumberField().sendKeys(dataLoader.credentialsData("truckingCompanyUser"));
        stakeholdersRegistrationPage.clickOnLoginPasswordField();
        stakeholdersRegistrationPage.fillInLoginPasswordField(dataLoader.credentialsData("truckingCompanyPass"));
        driver.navigate().back();
        stakeholdersRegistrationPage.clickOnLoginButton();
    }
    public void fillInFreightForwardingLoginInfo () throws InterruptedException, IOException {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
        DataLoader dataLoader = new DataLoader();


        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(899, 1532)).perform();
        stakeholdersRegistrationPage.clickOnPhoneNumberField();
        stakeholdersRegistrationPage.fillInPhoneNumberField().sendKeys(dataLoader.credentialsData("freightForwardingUser"));
        stakeholdersRegistrationPage.clickOnLoginPasswordField();
        stakeholdersRegistrationPage.fillInLoginPasswordField(dataLoader.credentialsData("freightForwardingPass"));
        driver.navigate().back();
        stakeholdersRegistrationPage.clickOnLoginButton();
    }

    public void fillInCargoLoginInfo () throws InterruptedException, IOException {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
        DataLoader dataLoader = new DataLoader();

        touchAction.tap(PointOption.point(899, 1532)).perform();
        stakeholdersRegistrationPage.clickOnPhoneNumberField();
        stakeholdersRegistrationPage.fillInPhoneNumberField().sendKeys(dataLoader.credentialsData("CargoUser"));
        stakeholdersRegistrationPage.clickOnLoginPasswordField();
        stakeholdersRegistrationPage.fillInLoginPasswordField(dataLoader.credentialsData("freightForwardingPass"));
        driver.navigate().back();
        stakeholdersRegistrationPage.clickOnLoginButton();
    }
    public void navigateToServicesSettingsPage() {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);

        stakeholdersRegistrationPage.clickOnAccountButton();
        stakeholdersRegistrationPage.clickOnMyServicesPageButton();
    }
    public  void fillAllServicesSettingsInfo () throws InterruptedException {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);

        stakeholdersRegistrationPage.clickOnaAttachment1();
        stakeholdersRegistrationPage.clickOnChooseFromGallery();
        stakeholdersRegistrationPage.clickOnChooseAttachments();
        touchAction.press(PointOption.point(321, 2713)).moveTo(PointOption.point(578, 1147)).release().perform();
        stakeholdersRegistrationPage.clickOnaCompanyLocationOnTheMap();
        stakeholdersRegistrationPage.clickOnAllowLocation();
        stakeholdersRegistrationPage.clickConfirmTheLocation();
        stakeholdersRegistrationPage.clickOnSaveSetting();
    }
    public void navigateToSearchPage() {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);

        stakeholdersRegistrationPage.clickOnSearchPage();
    }
    public void fillAllForwardingServicesSearchCategoryInfo() {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);

        stakeholdersRegistrationPage.clickOnForwardingServices();
        stakeholdersRegistrationPage.clickOnCategoryButton();
        stakeholdersRegistrationPage.clickOnAirFrightTypeButton();
        touchAction.tap(PointOption.point(655, 1129)).perform();
        stakeholdersRegistrationPage.clickOnAllowLocation();
        touchAction.tap(PointOption.point(1255, 840)).perform();
        stakeholdersRegistrationPage.clickOnShowResultButton();
    }
    public void fillAllTruckingServicesSearchCategoryInfo() throws InterruptedException {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
        FleetRegistrationPage fleetRegistrationPage = new FleetRegistrationPage(driver);

        stakeholdersRegistrationPage.clickOnTruckingServices();
        stakeholdersRegistrationPage.clickOnCategoryButton();
        fleetRegistrationPage.clickOnVehicleClassButton();
        stakeholdersRegistrationPage.clickOnUsageTypeButton();
        stakeholdersRegistrationPage.clickOnSelectUsageTypeButton();
        stakeholdersRegistrationPage.clickOnChooseButton();
        stakeholdersRegistrationPage.clickOnNumberOfAxlesButton();
        touchAction.tap(PointOption.point(650, 2406)).perform();
        stakeholdersRegistrationPage.clickOnAllowLocation();
        stakeholdersRegistrationPage.clickOnSeekBar();
        touchAction.tap(PointOption.point(1160, 2135)).perform();
        Thread.sleep(1000);
        stakeholdersRegistrationPage.clickOnShowResultButton();
        Thread.sleep(10000);
//        stakeholdersRegistrationPage.clickOnSearchBox();
        touchAction.tap(PointOption.point(172, 456)).perform();
        stakeholdersRegistrationPage.clickOnChooseFromSearchBox();
        Thread.sleep(10000);

    }
}


