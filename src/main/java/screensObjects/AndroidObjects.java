package screensObjects;

import helpers.Functions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AndroidObjects {

    Functions functions = new Functions();

    public AndroidObjects(AppiumDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc='Skip']")
    public WebElement skipButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc='عربي']")
    public WebElement arabicLanguageButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Next']")
    public WebElement nextButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='الأردن']")
    public WebElement jordan_AR_Button;

    public void clickOnSkipButton() throws InterruptedException {
        Thread.sleep(1000);
        skipButton.click();
    }

    public void clickOnArabicLanguageButton() throws InterruptedException {
        Thread.sleep(1000);
        arabicLanguageButton.click();
    }

    public void clickOnNextButton() throws InterruptedException {
        Thread.sleep(1500);
        nextButton.click();
    }

    public void clickOnJordan_AR_Button() throws InterruptedException {
        Thread.sleep(1000);
        jordan_AR_Button.click();
    }
}