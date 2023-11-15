package stakeholdersRegistrationTests;

import base.AndroidConfigurations;
import commonSteps.StakeholderRegistrationSteps;
import helpers.DatabaseHandler;
import helpers.Functions;
import helpers.Queries.OtherQueries;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.annotations.Test;
import pageModels.StakeholdersRegistrationPage;

import java.io.IOException;
import java.util.ArrayList;

public class StakeholdersRegistrationTests extends AndroidConfigurations {
    @Test(enabled = true)
    public void TruckingCompany_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage();

        // Fill-In Trucking Company Registration Button
       stakeholderRegistrationSteps.fillInTruckingCompanyRegistrationButton();

        // Fill-In Trucking Company Registration Info
       //  stakeholderRegistrationSteps.fillInTruckingCompanyRegistrationInfo();
        StakeholdersRegistrationPage stakeholdersRegistrationPage = new StakeholdersRegistrationPage(driver);
        Functions functions = new Functions();

        stakeholdersRegistrationPage.clickOnRegisterCompanyButton();
        stakeholdersRegistrationPage.clickOnNextButton();
        Thread.sleep(1000);

        stakeholdersRegistrationPage.clickOnCommercialNameArabic();
        String commercialNameAr = String.valueOf("الإسم بالعربي أتوميشن " + functions.getRandomNameArabic());
        System.out.println("commercialNameAr " + commercialNameAr);
        stakeholdersRegistrationPage.fillInCommercialNameArField(commercialNameAr);
        driver.navigate().back();

        stakeholdersRegistrationPage.clickOnCommercialNameEnglish();
        String commercialNameEn = String.valueOf(" Commercial Name Auto En " + functions.getRandomNameEnglish());
        stakeholdersRegistrationPage.fillInCommercialNameEnField(commercialNameEn);
        driver.navigate().back();

//        // Upload Attachments
//         stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments();
    }
    @Test(enabled = false)
    public void TruckOwner_External_Registration() throws InterruptedException, IOException {

        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage();

        // Fill-In Trucking Company Registration Button
        stakeholderRegistrationSteps.fillInTruckingCompanyRegistrationButton();

        // Fill-In Trucking Company Registration Info
        stakeholderRegistrationSteps.fillInTruckingCompanyRegistrationInfo();

        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments();
    }
    @Test(enabled = false)
    public void CargoOwner_External_Registration() throws InterruptedException, IOException {

        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage();

        // Fill-In Trucking Company Registration Button
        stakeholderRegistrationSteps.fillInTruckingCompanyRegistrationButton();

        // Fill-In Trucking Company Registration Info
        stakeholderRegistrationSteps.fillInTruckingCompanyRegistrationInfo();

        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments();
    }

}


