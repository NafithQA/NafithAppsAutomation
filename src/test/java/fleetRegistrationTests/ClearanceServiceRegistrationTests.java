package fleetRegistrationTests;

import apiHandler.ApiHandler;
import base.AndroidConfigurations;
import commonSteps.StakeholderRegistrationSteps;
import org.testng.annotations.Test;

import java.io.IOException;

public class ClearanceServiceRegistrationTests extends AndroidConfigurations {
    @Test(enabled = true )
    public void ClearanceServices_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(2,false);

        // Fill-In ClearanceServices Registration Button
        stakeholderRegistrationSteps.fillInRoleRegistrationButton();

        // Fill-In Clearance Services Registration Info
        stakeholderRegistrationSteps.fillInRoleRegistrationInfo(2);

        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(1);

        // Navigate to  registration Steps By Admin Apis
        ApiHandler.RegistrationExternalStakeholder() ;
    }
    @Test(enabled = true)
    public void ClearanceServices_MyServicesSettings() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(2,true);

        // Fill-In Freight Forwarding  Login Info
         stakeholderRegistrationSteps.fillInClearanceAgentLoginInfo();

        // navigate to splash screens Pages
        stakeholderRegistrationSteps.navigateToServicesSettingsPage();

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllServicesSettingsInfo();
    }
    @Test(enabled = true)
    public void Insurance_Service_Search_Category() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(2,true);

        // Fill-In Freight Forwarding  Login Info
        stakeholderRegistrationSteps.fillInClearanceAgentLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage(3);

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllServicesSearchCategoryInfo();

        Thread.sleep(1000);
    }

    @Test(enabled = true)
    public void Trucking_Services_Search_Category() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(2,true);

        // Fill-In Freight Forwarding  Login Info
        stakeholderRegistrationSteps.fillInClearanceAgentLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage(0);

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllTruckingServicesSearchCategoryInfo();
    }

    @Test(enabled = true)
    public void Forwarding_Services_Search_Category() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(2,true);

        // Fill-In Trucking Company Login Info
        stakeholderRegistrationSteps.fillInClearanceAgentLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage(2);

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllServicesSearchCategoryInfo();

        Thread.sleep(1000);
    }



}
