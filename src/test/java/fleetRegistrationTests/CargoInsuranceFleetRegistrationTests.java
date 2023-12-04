package fleetRegistrationTests;

import base.AndroidConfigurations;
import commonSteps.StakeholderRegistrationSteps;
import org.testng.annotations.Test;

import java.io.IOException;
public class CargoInsuranceFleetRegistrationTests extends AndroidConfigurations {

    @Test(enabled = true)
    public void CargoInsurance_ServicesSettings() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(3,true);

        // Fill-In Trucking Company Login Info
        stakeholderRegistrationSteps.fillInCargoLoginInfo();

        // navigate to Search Page
        stakeholderRegistrationSteps.navigateToSearchPage();

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllSearchCategoryInfo();

        Thread.sleep(100000);
    }
}
