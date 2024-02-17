package fleetRegistrationTests;

import apiHandler.ApiHandler;
import base.AndroidConfigurations;
import commonSteps.FleetRegistrationSteps;
import commonSteps.StakeholderRegistrationSteps;
import org.testng.annotations.Test;

import java.io.IOException;
public class CargoInsuranceFleetRegistrationTests extends AndroidConfigurations {
    @Test(enabled = true)
    public void CargoInsurance_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(3,false);

        // Fill-In Cargo Owner Registration Button
        stakeholderRegistrationSteps.fillInRoleRegistrationButton();

        // Fill-In Clearance Services Registration Info
        stakeholderRegistrationSteps.fillInRoleRegistrationInfo(3);

        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(1);

        // Navigate to registration Steps By Admin Apis
        ApiHandler.RegistrationExternalStakeholder() ;
    }
    @Test(enabled = false)
    public void CargoInsurance_MyServicesSettings() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(3,true);

        // Fill-In Cargo insurance Login Info
        stakeholderRegistrationSteps.fillInCargoLoginInfo();

        // navigate to splash screens Pages
        stakeholderRegistrationSteps.navigateToServicesSettingsPage();

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllServicesSettingsInfo();
    }
    @Test(enabled = false)
    public void Clearance_Service_Search_Category() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(2,true);

        // Fill-In Cargo Login Info
        stakeholderRegistrationSteps.fillInCargoLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage(1);

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllServicesSearchCategoryInfo();

        Thread.sleep(1000);
    }
    @Test(enabled = false)
    public void Trucking_Services_Search_Category() throws IOException, InterruptedException {
         StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(3,true);

        // Fill-In Trucking Company Login Info
        stakeholderRegistrationSteps.fillInCargoLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage(0);

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllTruckingServicesSearchCategoryInfo();
    }
    @Test(enabled = false)
    public void Forwarding_Services_Search_Category() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(3,true);

        // Fill-In Trucking Company Login Info
        stakeholderRegistrationSteps.fillInCargoLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage(2);

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllServicesSearchCategoryInfo();

        Thread.sleep(1000);
    }
    @Test(enabled = false)
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

}
