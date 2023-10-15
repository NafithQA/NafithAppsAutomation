package commonSteps;

import base.AndroidConfigurations;

import helpers.Functions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import  pageModels.LoginPage;
import java.io.IOException;


public class GenericSteps  extends AndroidConfigurations {

    public GenericSteps(AndroidDriver driver) {
        PageFactory.initElements(driver, this);}
   //  public static DataLoader dataLoader = new DataLoader();
    public void loginToNSTAR(String userName, String password) throws IOException, InterruptedException {

        Functions functions = new Functions();
        GenericSteps genericSteps = new GenericSteps(driver);

        // Login to NSTAR
       // functions.navigateToQaURL();
//        functions.waitForElementToBeClickable(loginPage.getUserNameField());
//        loginPage.getUserNameField().sendKeys(userName);
//        functions.waitForElementToBeClickable(loginPage.getPasswordField());
//        loginPage.getPasswordField().sendKeys(password);
//        loginPage.clickOnLoginButton();

        Thread.sleep(5000);
        //genericSteps.changeLanguage("english");
        Thread.sleep(3000);
    }


}
