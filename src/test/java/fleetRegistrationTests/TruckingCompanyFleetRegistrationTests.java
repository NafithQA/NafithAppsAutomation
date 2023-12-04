package fleetRegistrationTests;

import base.AndroidConfigurations;
import commonSteps.FleetRegistrationSteps;
import commonSteps.StakeholderRegistrationSteps;
import org.testng.annotations.Test;
import java.io.IOException;
public class TruckingCompanyFleetRegistrationTests extends AndroidConfigurations {

    @Test(enabled = true)
    public void TruckingCompany_Registration_Truck() throws IOException, InterruptedException {
        FleetRegistrationSteps fleetRegistrationSteps = new FleetRegistrationSteps(driver);
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1,true);

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
    }
    @Test(enabled = true)
    public void TruckingCompany_Registration_Trailer() throws IOException, InterruptedException {
        FleetRegistrationSteps fleetRegistrationSteps = new FleetRegistrationSteps(driver);
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1,true);

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
    @Test(enabled = true)
    public void TruckingCompany_Registration_Equipment() throws IOException, InterruptedException {
        FleetRegistrationSteps fleetRegistrationSteps = new FleetRegistrationSteps(driver);
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1,true);

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
}
