package fleetRegistrationTests;

import apiHandler.ApiHandler;
import base.AndroidConfigurations;
import commonSteps.StakeholderRegistrationSteps;
import org.testng.annotations.Test;
import java.io.IOException;

public class FreightForwardingFleetRegistrationTests extends AndroidConfigurations {
    @Test(enabled = true)
    public void ForwardingServices_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(4,false);

        // Fill-In ForwardingServices Registration Button
        stakeholderRegistrationSteps.fillInRoleRegistrationButton();

        // Fill-In Clearance Services Registration Info
        stakeholderRegistrationSteps.fillInRoleRegistrationInfo(4);

        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(1);

        // Navigate to registration Steps By Admin Apis
        ApiHandler.RegistrationExternalStakeholder() ;
    }
    @Test(enabled = true)
    public void FreightForwarding_MyServicesSettings() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(4,true);

        // Fill-In Freight Forwarding  Login Info
         stakeholderRegistrationSteps.fillInFreightForwardingLoginInfo();

        // navigate to splash screens Pages
        stakeholderRegistrationSteps.navigateToServicesSettingsPage();

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllServicesSettingsInfo();
    }
    @Test(enabled = true)
    public void Insurance_Service_Search_Category() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(4,true);

        // Fill-In Freight Forwarding  Login Info
        stakeholderRegistrationSteps.fillInFreightForwardingLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage(3);

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllServicesSearchCategoryInfo();

        Thread.sleep(1000);
    }
    @Test(enabled = true)
    public void Clearance_Services_Search_Category() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(4,true);

        // Fill-In Freight Forwarding  Login Info
        stakeholderRegistrationSteps.fillInFreightForwardingLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage(1);

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllServicesSearchCategoryInfo();

        Thread.sleep(1000);
    }

    @Test(enabled = true)
    public void Trucking_Services_Search_Category() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(4,true);

        // Fill-In Freight Forwarding  Login Info
        stakeholderRegistrationSteps.fillInFreightForwardingLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage(0);

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllTruckingServicesSearchCategoryInfo();
    }



}
