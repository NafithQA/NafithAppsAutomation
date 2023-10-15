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

    DatabaseHandler databaseHandler = new DatabaseHandler();
    Functions functions = new Functions();

    public void navigateToRegistrationPage() throws InterruptedException {
           StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);

           stakeholdersRegistrationPage.clickOnAllowButton();
           stakeholdersRegistrationPage.clickOnLanguageButton();
           stakeholdersRegistrationPage.clickOnNextButton();
           stakeholdersRegistrationPage.clickOnJordan_Button();
           stakeholdersRegistrationPage.clickOnNextButton();
           stakeholdersRegistrationPage.clickOnTransportationCompanyButton();
           stakeholdersRegistrationPage.clickOnNextButton();
           stakeholdersRegistrationPage.clickOnNextButton();
           stakeholdersRegistrationPage.clickOnLetsStartButton();
       }
    public void navigateToLoginPage() throws IOException, InterruptedException {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);

        stakeholdersRegistrationPage.clickOnAccountButton();
        stakeholdersRegistrationPage.clickOnLoginPage();

    }
    public void fillInTruckingCompanyRegistrationButton() throws IOException, InterruptedException {
            StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);

            stakeholdersRegistrationPage.clickOnSubscribeNowButton();
            stakeholdersRegistrationPage.clickOnCountryKeyDropDownList();
            stakeholdersRegistrationPage.clickOnJordanCountryCodeButton();
            Thread.sleep(1000);
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
    }
    public void fillInTruckingCompanyRegistrationInfo() throws IOException, InterruptedException{
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
            stakeholdersRegistrationPage.clickOnRegisterCompanyButton();
            stakeholdersRegistrationPage.clickOnRegistrationTypeButton();
            stakeholdersRegistrationPage.clickOnBusinessTypeButton();
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
            stakeholdersRegistrationPage.clickOnJordanCountryCodeButton();
            Thread.sleep(1000);
            stakeholdersRegistrationPage.clickOnPhoneNumberField();
            String phoneNumberReg = String.valueOf(functions.generateRandomNumber(15));
            stakeholdersRegistrationPage.fillInPhoneNumberField().sendKeys(phoneNumberReg);
            driver.navigate().back();

            stakeholdersRegistrationPage.clickOnEmail();
            String Email = String.valueOf(functions.getRandomEmailString() + "@gmail.com");
            stakeholdersRegistrationPage.fillInEmail(Email);
            driver.navigate().back();
            stakeholdersRegistrationPage.clickOnCountryDropDownList();
            stakeholdersRegistrationPage.clickOnJordanCountryCodeButton();
            stakeholdersRegistrationPage.clickOnGovernorate();
            String governorate = String.valueOf("governorate Auto " + functions.getRandomNameEnglish());
            stakeholdersRegistrationPage.fillInGovernorate(governorate);
            driver.navigate().back();
            stakeholdersRegistrationPage.clickOnAddress();
            String address = String.valueOf("address Auto" + functions.getRandomNameEnglish());
            stakeholdersRegistrationPage.fillInGovernorate(address);
            stakeholdersRegistrationPage.clickOnNextButton();
            Thread.sleep(1000);
            driver.navigate().back();
    }
    public void uploadStakeholderRegistrationAttachments() throws IOException, InterruptedException {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);

        stakeholdersRegistrationPage.clickOnaAttachment1();
        stakeholdersRegistrationPage.clickOnChooseFromGallery();
        stakeholdersRegistrationPage.clickOnChooseAttachments();
        stakeholdersRegistrationPage.clickOnNextButton();

        stakeholdersRegistrationPage.clickOnaAttachment1();
        stakeholdersRegistrationPage.clickOnChooseFromGallery();
        stakeholdersRegistrationPage.clickOnChooseAttachments();
        stakeholdersRegistrationPage.clickOnNextButton();

        stakeholdersRegistrationPage.clickOnaAttachment1();
        stakeholdersRegistrationPage.clickOnChooseFromGallery();
        stakeholdersRegistrationPage.clickOnChooseAttachments();
        stakeholdersRegistrationPage.clickOnDoneButton();
        stakeholdersRegistrationPage.clickOnRegisterCompany();
        stakeholdersRegistrationPage.clickOnRegisterFleet();  
    }
    public void fillInTruckingCompanyLoginInfo () throws InterruptedException, IOException {
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
        DataLoader dataLoader = new DataLoader();

        stakeholdersRegistrationPage.clickOnCountryKeyDropDownList();
        stakeholdersRegistrationPage.clickOnJordanCountryCodeButton();
        Thread.sleep(1000);
        stakeholdersRegistrationPage.clickOnPhoneNumberField();
        stakeholdersRegistrationPage.fillInPhoneNumberField().sendKeys(dataLoader.credentialsData("truckingCompanyUser"));

        stakeholdersRegistrationPage.clickOnLoginPasswordField();
        stakeholdersRegistrationPage.fillInLoginPasswordField(dataLoader.credentialsData("truckingCompanyPass"));
        driver.navigate().back();
        stakeholdersRegistrationPage.clickOnLoginButton();
    }
}
