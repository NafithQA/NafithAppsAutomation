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

    }
    @Test(enabled = true)
    public void TruckingCompany_Registration_Truck() throws IOException, InterruptedException {
        FleetRegistrationSteps fleetRegistrationSteps = new FleetRegistrationSteps(driver);
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);
        ApiHandler apihandler = new ApiHandler();

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

        apihandler.main();
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
        stakeholderRegistrationSteps.navigateToSearchPage();

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllTruckingServicesSearchCategoryInfo();
    }
}
