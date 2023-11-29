package fleetRegistrationTests;

import base.AndroidConfigurations;
import commonSteps.StakeholderRegistrationSteps;
import org.testng.annotations.Test;
import java.io.IOException;

public class FreightForwardingFleetRegistrationTests extends AndroidConfigurations {

    @Test(enabled = true)
    public void FreightForwarding_Login() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to splash screens Pages
        stakeholderRegistrationSteps.navigateToRegistrationPage(4);

        // navigate to Registration Page
        stakeholderRegistrationSteps.navigateToLoginPage();

        // Fill-In Trucking Company Login Info
        stakeholderRegistrationSteps.fillInFreightForwardingLoginInfo();
    }
    @Test(enabled = true)
    public void FreightForwarding_ServicesSettings() throws IOException, InterruptedException {
        StakeholderRegistrationSteps stakeholderRegistrationSteps = new StakeholderRegistrationSteps(driver);

        // navigate to splash screens Pages
        stakeholderRegistrationSteps.navigateToServicesSettingsPage();

        // navigate to Registration Page
        stakeholderRegistrationSteps.fillAllServicesSettingsInfo();
    }

}
