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
        stakeholderRegistrationSteps.navigateToRegistrationPage(1,false);

        // Fill-In Trucking Company Registration Button
         stakeholderRegistrationSteps.fillInRoleRegistrationButton();

        // Fill-In Trucking Company Registration Info
           stakeholderRegistrationSteps.fillInRoleRegistrationInfo(1);

        // Upload Attachments
       stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(1);

    }
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
     }
    @Test(enabled = true)
    public void InsuranceServices_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(3,false);

        // Fill-In InsuranceServices Registration Button
        stakeholderRegistrationSteps.fillInRoleRegistrationButton();

        // Fill-In Clearance Services Registration Info
        stakeholderRegistrationSteps.fillInRoleRegistrationInfo(3);

        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(1);
    }
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
    }
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
    public void TruckingCompanyIndividual_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1,false);

        // Fill-In Trucking Company Registration Button
        stakeholderRegistrationSteps.fillInRoleRegistrationButton();

         // Fill-In Trucking Company Registration Info
        stakeholderRegistrationSteps.fillInRoleRegistrationInfo(6);

        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(2);
    }
    @Test(enabled = true)
    public void CargoOwnerIndividual_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1,false);

        // Fill-In Trucking Company Registration Button
        stakeholderRegistrationSteps.fillInRoleRegistrationButton();

        // Fill-In Trucking Company Registration Info
        stakeholderRegistrationSteps.fillInRoleRegistrationInfo(7);

        // Upload Attachments
         stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(2);
     }
}


