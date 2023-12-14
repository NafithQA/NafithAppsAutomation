package fleetRegistrationTests;

import base.AndroidConfigurations;
import commonSteps.StakeholderRegistrationSteps;
import org.testng.annotations.Test;

import java.io.IOException;
public class CargoInsuranceFleetRegistrationTests extends AndroidConfigurations {
    @Test(enabled = true)
    public void CargoOwner_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(5,false);

        // Fill-In Cargo Owner Registration Button
        stakeholderRegistrationSteps.fillInRoleRegistrationButton();

        // Fill-In Clearance Services Registration Info
        stakeholderRegistrationSteps.fillInRoleRegistrationInfo(5);

        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(1);
    }
    @Test(enabled = true)
    public void CargoInsurance_Forwarding_Services_Search_Category() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(3,true);

        // Fill-In Trucking Company Login Info
        stakeholderRegistrationSteps.fillInCargoLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage();

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllForwardingServicesSearchCategoryInfo();

        Thread.sleep(1000);
    }
}
