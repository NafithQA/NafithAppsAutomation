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
import pageModels.StakeholdersRegistrationPage;
import java.io.IOException;
import java.util.ArrayList;
public class StakeholderRegistrationSteps  extends AndroidConfigurations {
    public StakeholderRegistrationSteps(AndroidDriver driver) {
        PageFactory.initElements(driver, this);}
    Functions functions = new Functions();
    TouchAction touchAction = new TouchAction(driver);
//    public enum Roles {
//        TruckingCompany, ClearanceServices, InsuranceServices, ForwardingServices,
//        CargoOwner, CargoOwnerIndividual
//    }
    public void navigateToRegistrationPage(int Role) throws InterruptedException {
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
       }
    public void navigateToLoginPage() {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);

        stakeholdersRegistrationPage.clickOnAccountButton();
        stakeholdersRegistrationPage.clickOnLoginPage();
    }
    public void fillInRoleRegistrationButton(int RegisterFlag) throws IOException, InterruptedException {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
        DatabaseHandler databaseHandler = new DatabaseHandler();

        if(RegisterFlag == 1){
            stakeholdersRegistrationPage.clickOnLogisticsServicesFindOutButton();
            stakeholdersRegistrationPage.clickOnCreateAccountVisitorButton();
        } else if (RegisterFlag == 0) {
            stakeholdersRegistrationPage.clickOnRegisterCompanyButton();
        }
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
       // Thread.sleep(1000);
    }
    public void fillInRoleRegistrationInfo(int BusinessActivity) throws IOException, InterruptedException{
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);

        switch (BusinessActivity) {
            case 1:
                stakeholdersRegistrationPage.clickOnRegisterYourActivityButton();
                stakeholdersRegistrationPage.clickOnTruckingCompanyBusinessActivityButton();
                break;
            case 2:
                stakeholdersRegistrationPage.clickOnRegisterYourActivityButton();
                stakeholdersRegistrationPage.clickOnClearanceServicesBusinessActivityButton();
                break;
            case 3:
                stakeholdersRegistrationPage.clickOnRegisterYourActivityButton();
                stakeholdersRegistrationPage.clickOnInsuranceServicesBusinessActivityButton();
                break;
            case 4:
                stakeholdersRegistrationPage.clickOnRegisterYourActivityButton();
                stakeholdersRegistrationPage.clickOnForwardingServicesBusinessActivityButton();
                break;
            case 5:
                stakeholdersRegistrationPage.clickOnProvideLogisticsServicesFindOutButton();
                stakeholdersRegistrationPage.clickOnRegisterButton();
                stakeholdersRegistrationPage.clickOnCargoOwnerBusinessActivityButton();
                break;
            case 6:
                stakeholdersRegistrationPage.clickOnRegisterYourActivityButton();
                stakeholdersRegistrationPage.clickOnIndividualButton();
                stakeholdersRegistrationPage.clickOnTruckingCompanyBusinessActivityButton();
                break;
            case 7:
                stakeholdersRegistrationPage.clickOnRegisterYourActivityButton();
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
}


