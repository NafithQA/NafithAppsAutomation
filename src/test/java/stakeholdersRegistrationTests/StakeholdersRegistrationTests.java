package stakeholdersRegistrationTests;

import base.AndroidConfigurations;
import commonSteps.StakeholderRegistrationSteps;
import org.testng.annotations.Test;

import java.io.IOException;
public class StakeholdersRegistrationTests extends AndroidConfigurations {
    @Test(enabled = false)
    public void TruckingCompany_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1);

        // Fill-In Trucking Company Registration Button
         stakeholderRegistrationSteps.fillInRoleRegistrationButton(0);

        // Fill-In Trucking Company Registration Info
         stakeholderRegistrationSteps.fillInRoleRegistrationInfo(1);
        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(1);
    }
    @Test(enabled = false)
    public void ClearanceServices_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(2);

        // Fill-In ClearanceServices Registration Button
        stakeholderRegistrationSteps.fillInRoleRegistrationButton(0);

        // Fill-In Clearance Services Registration Info
        stakeholderRegistrationSteps.fillInRoleRegistrationInfo(2);

        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(1);
    }
    @Test(enabled = false)
    public void InsuranceServices_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(3);

        // Fill-In InsuranceServices Registration Button
        stakeholderRegistrationSteps.fillInRoleRegistrationButton(0);

        // Fill-In Clearance Services Registration Info
        stakeholderRegistrationSteps.fillInRoleRegistrationInfo(3);

        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(1);
    }
    @Test(enabled = true)
    public void ForwardingServices_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(4);

        // Fill-In ForwardingServices Registration Button
        stakeholderRegistrationSteps.fillInRoleRegistrationButton(0);

        // Fill-In Clearance Services Registration Info
        stakeholderRegistrationSteps.fillInRoleRegistrationInfo(4);

        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(1);
    }
    @Test(enabled = false)
    public void CargoOwner_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(5);

        // Fill-In Cargo Owner Registration Button
        stakeholderRegistrationSteps.fillInRoleRegistrationButton(1);

        // Fill-In Clearance Services Registration Info
        stakeholderRegistrationSteps.fillInRoleRegistrationInfo(5);

         // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(1);
    }
    @Test(enabled = false)
    public void TruckingCompanyIndividual_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1);

        // Fill-In Trucking Company Registration Button
        stakeholderRegistrationSteps.fillInRoleRegistrationButton(0);

         // Fill-In Trucking Company Registration Info
        stakeholderRegistrationSteps.fillInRoleRegistrationInfo(6);
        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(2);
    }
    @Test(enabled = false)
    public void CargoOwnerIndividual_External_Registration() throws InterruptedException, IOException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(1);

        // Fill-In Trucking Company Registration Button
        stakeholderRegistrationSteps.fillInRoleRegistrationButton(0);

        // Fill-In Trucking Company Registration Info
        stakeholderRegistrationSteps.fillInRoleRegistrationInfo(7);
        // Upload Attachments
         stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments(2);
    }
}


