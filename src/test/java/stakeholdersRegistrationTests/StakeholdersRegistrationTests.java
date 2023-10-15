package stakeholdersRegistrationTests;

import base.AndroidConfigurations;
import commonSteps.StakeholderRegistrationSteps;
import org.testng.annotations.Test;
import java.io.IOException;


public class StakeholdersRegistrationTests extends AndroidConfigurations {

    @Test(enabled = true)
    public void TruckingCompany_External_Registration() throws InterruptedException, IOException {
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

    @Test(enabled = true)
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

    @Test(enabled = true)
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


