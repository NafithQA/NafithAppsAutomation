package fleetRegistrationTests;

import apiHandler.ApiHandler;
import base.AndroidConfigurations;
import commonSteps.FleetRegistrationSteps;
import commonSteps.StakeholderRegistrationSteps;
import org.testng.annotations.Test;

import java.io.IOException;
public class TruckingCompanyFleetRegistrationTests extends AndroidConfigurations {

    @Test(enabled = false)
    public void TruckingCompany_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1,false);

        // Fill-In Trucking Company Registration Button
        stakeholderRegistrationSteps.fillInRoleRegistrationButton();

        // Fill-In Trucking Company Registration Info
         stakeholderRegistrationSteps.fillInRoleRegistrationInfo(1);

        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(1);

        // Navigate to registration Steps By Admin Apis
        ApiHandler.RegistrationExternalStakeholder() ;
    }
    @Test(enabled = false)
    public void TruckingCompany_Registration_Truck() throws IOException, InterruptedException {
        FleetRegistrationSteps fleetRegistrationSteps = new FleetRegistrationSteps(driver);
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1, true);

        // Fill-In Trucking Company Login Info
        stakeholderRegistrationSteps.fillInTruckingCompanyLoginInfo();

        //Navigate to Fleet Registration Page
        fleetRegistrationSteps.navigateToFleetTruckRegistrationPage();

        // Navigate to Fill-in Truck Registration info Page
        fleetRegistrationSteps.navigateToFleetRegistrationPage();

        //  Upload Attachments
        fleetRegistrationSteps.uploadFleetRegistrationAttachments();

        // Navigate to Truck Complete registration Steps
        fleetRegistrationSteps.navigateCompleteTruckRegistrationPage();

        // Navigate to Truck Complete registration Steps By Admin Apis
        ApiHandler.TrucksRegistrationTC();
    } 
    @Test(enabled = false)
    public void TruckingCompany_Registration_Trailer() throws IOException, InterruptedException {
        FleetRegistrationSteps fleetRegistrationSteps = new FleetRegistrationSteps(driver);
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1, true);

        // Fill-In Trucking Company Login Info
        stakeholderRegistrationSteps.fillInTruckingCompanyLoginInfo();

        //Navigate to Fleet Registration Page
        fleetRegistrationSteps.navigateToFleetTrailersRegistrationPage();

        // Navigate to Fill-in Trailer Registration info Page
        fleetRegistrationSteps.navigateToFleetRegistrationPage();

        //  Upload Attachments
        fleetRegistrationSteps.uploadFleetRegistrationAttachments();

        // Navigate to Trailer Complete registration Steps
        fleetRegistrationSteps.navigateCompleteTrailerRegistrationPage();

        // Navigate to Trailer Complete registration Steps By Admin Apis
        ApiHandler.TrailerRegistrationTC();
    }
    @Test(enabled = false)
    public void TruckingCompany_Registration_Equipment() throws IOException, InterruptedException {
        FleetRegistrationSteps fleetRegistrationSteps = new FleetRegistrationSteps(driver);
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1, true);

        // Fill-In Trucking Company Login Info
        stakeholderRegistrationSteps.fillInTruckingCompanyLoginInfo();

        //Navigate to Fleet Registration Page
        fleetRegistrationSteps.navigateToFleetEquipmentRegistrationPage();

        // Navigate to Fill-in Equipment Registration info Page
        fleetRegistrationSteps.navigateToFleetRegistrationPage();

        //  Upload Attachments
        fleetRegistrationSteps.uploadFleetRegistrationAttachments();

        // Navigate to Trailer Complete registration Steps
        fleetRegistrationSteps.navigateCompleteEquipmentRegistrationPage();

        // Navigate to Equipment Complete registration Steps By Admin Apis
        ApiHandler.EquipmentRegistrationTC(); ;
    }
    @Test(enabled = false)
    public void TruckingCompany_Search_Services_With_Distance() throws IOException, InterruptedException {
        FleetRegistrationSteps fleetRegistrationSteps = new FleetRegistrationSteps(driver);
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1, true);

        // Fill-In Trucking Company Login Info
        stakeholderRegistrationSteps.fillInTruckingCompanyLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage(0);

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllTruckingServicesSearchCategoryInfo();
    }
    @Test(enabled = false)
    public void Insurance_Service_Search_Category() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1,true);

        // Fill-In Freight Forwarding  Login Info
        stakeholderRegistrationSteps.fillInTruckingCompanyLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage(3);

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllServicesSearchCategoryInfo();

        Thread.sleep(1000);
    }
    @Test(enabled = false)
    public void Clearance_Service_Search_Category() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1, true);

        // Fill-In Cargo Login Info
        stakeholderRegistrationSteps.fillInTruckingCompanyLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage(1);

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllServicesSearchCategoryInfo();

        Thread.sleep(1000);
    }
    @Test(enabled = true)
    public void Forwarding_Services_Search_Category() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1,true);

        // Fill-In Trucking Company Login Info
        stakeholderRegistrationSteps.fillInTruckingCompanyLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage(2);

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllServicesSearchCategoryInfo();

        Thread.sleep(1000);
    }
}
