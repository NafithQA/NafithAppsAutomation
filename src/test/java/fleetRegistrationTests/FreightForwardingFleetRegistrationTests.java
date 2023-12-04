package fleetRegistrationTests;

import base.AndroidConfigurations;
import commonSteps.StakeholderRegistrationSteps;
import org.testng.annotations.Test;
import java.io.IOException;

public class FreightForwardingFleetRegistrationTests extends AndroidConfigurations {
    @Test(enabled = true)
    public void FreightForwarding_ServicesSettings() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to Login Page
        stakeholderRegistrationSteps.navigateToRegistrationPage(4,true);

        // Fill-In Trucking Company Login Info
        stakeholderRegistrationSteps.fillInFreightForwardingLoginInfo();

        // navigate to splash screens Pages
        stakeholderRegistrationSteps.navigateToServicesSettingsPage();

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllServicesSettingsInfo();
    }

}
