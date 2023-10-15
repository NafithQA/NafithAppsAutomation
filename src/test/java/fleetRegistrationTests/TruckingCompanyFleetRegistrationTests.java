package fleetRegistrationTests;

import base.AndroidConfigurations;
import commonSteps.FleetRegistrationSteps;
import commonSteps.GenericSteps;
import commonSteps.StakeholderRegistrationSteps;
import helpers.DataLoader;
import org.testng.annotations.Test;
import pageModels.StakeholdersRegistrationPage;

import java.io.IOException;

public class TruckingCompanyFleetRegistrationTests extends AndroidConfigurations {

    @Test(enabled = true)
    public void TruckingCompanies_Login() throws IOException, InterruptedException {

        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver); 
        // Login

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToRegistrationPage();

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToLoginPage();

        // Fill-In Trucking Company Login Info
       stakeholderRegistrationSteps.fillInTruckingCompanyLoginInfo();


    }

    @Test(enabled = false)
    public void Trucks_TruckingCompany_Registration() throws IOException, InterruptedException {
        FleetRegistrationSteps fleetRegistrationSteps = new FleetRegistrationSteps(driver);
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        //Navigate to Fleet Registration Page
        fleetRegistrationSteps.navigateToFleetRegistrationPage();

        // Navigate to Trucks Registration Page
        fleetRegistrationSteps.navigateToTruckRegistrationPage();

        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments();
    }

    @Test(enabled = false)
    public void Trailers_TruckingCompany_Registration() throws IOException, InterruptedException {
        FleetRegistrationSteps fleetRegistrationSteps = new FleetRegistrationSteps(driver);
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        //Navigate to Fleet Registration Page
        fleetRegistrationSteps.navigateToFleetRegistrationPage();

        // Navigate to Trucks Registration Page
        fleetRegistrationSteps.navigateToTruckRegistrationPage();

        // Upload Attachments
        stakeholderRegistrationSteps.uploadStakeholderRegistrationAttachments();
    }

    @Test(enabled = false)
    public void Equipments_TruckingCompany_Registration() throws IOException, InterruptedException {

   }

}
