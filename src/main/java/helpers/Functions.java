package helpers;

import base.AndroidConfigurations;
import com.google.common.base.CharMatcher;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;

public class Functions extends AndroidConfigurations {

    // This function waits for an element until it is clickable
    public void waitForElementToBeClickable(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // This function waits for an element until it is visible
    public void waitForElementToBeVisible(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // This function gets the first part of a text splitted with a dash
    public String getFirstPartOfTextSplittedWithDash(String text) {

        String[] parts = text.split("-");
        String splittedText = parts[0].trim();
        return splittedText;
    }

    // This function gets a specific part of a text based on given separator
    public String getPartOfTextAfterSeparator(String text, String separator) {

        String[] parts = text.split(separator);
        String splittedText = parts[0].trim();
        return splittedText;
    }

    // This function gets the text of an element
    public String getElementText(WebElement element) {

        String text = element.getText();
        return text;
    }

    // This function gets a trimmed text of an element
    public String getTrimmedElementText(WebElement element) {

        String text = element.getText().trim();
        return text;
    }

    // This function gets numbers out of a text String
    public String getNumbersOutOfText(WebElement element) {

        return CharMatcher.inRange('0', '9').retainFrom(element.getText());
    }

    // This function picks an option from a Drop Down by index
    public void dropDownPickerByIndex(WebElement element, int index) {

        Select dropDown = new Select(element);
        dropDown.selectByIndex(index);
    }

    // This function picks an option from a Drop Down by value
    public void dropDownPickerByValue(WebElement element, String value) {

        Select dropDown = new Select(element);
        dropDown.selectByValue(value);
    }

    // This function picks an option from a Drop Down by value
    public void dropDownPickerByVisibleText(WebElement element, String text) {

        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(text);
    }

    // This function scroll using X,Y axis
    public void scrollUsingXYaxis(int x, int y) {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(" + x + "," + y + ")");
    }

    public long generateRandomNumber(int length) {

        Random random = new Random();
        char[] digits = new char[length];
        digits[0] = (char) (random.nextInt(9) + '1');
        for (int i = 1; i < length; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return Long.parseLong(new String(digits));
    }

    public String generateRandomPassword() {
        // ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        final String numbers = "0123456789";
        final String specialChars = "!@#$%^&*-_=+<>}{!@#$%^&*()";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance

        for (int i = 0; i < 2; i++) {
            int randomIndex = random.nextInt(capitalLetters.length());
            sb.append(capitalLetters.charAt(randomIndex));
        }

        for (int i = 0; i < 2; i++) {
            int randomIndex = random.nextInt(smallLetters.length());
            sb.append(smallLetters.charAt(randomIndex));
        }

        for (int i = 0; i < 2; i++) {
            int randomIndex = random.nextInt(numbers.length());
            sb.append(numbers.charAt(randomIndex));
        }

        for (int i = 0; i < 2; i++) {
            int randomIndex = random.nextInt(specialChars.length());
            sb.append(specialChars.charAt(randomIndex));
        }

        return sb.toString();
    }

    public String generateRandomDate(String dateTime) {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date myCurrentDate = new Date(System.currentTimeMillis());
        Date twentyDaysBeforeToday = null;
        String finalFormattedDate;

        switch (dateTime) {
            case "PAST":
                twentyDaysBeforeToday = new Date(myCurrentDate.getTime() - (20 * 24 * 60 * 60 * 1000));
                break;

            case "FUTURE":
                twentyDaysBeforeToday = new Date(myCurrentDate.getTime() + (20 * 24 * 60 * 60 * 1000));
                break;
        }

        finalFormattedDate = dateFormat.format(twentyDaysBeforeToday);
        return finalFormattedDate;
    }

    public void moveToElement(WebElement element) throws InterruptedException {

        Thread.sleep(750);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void moveToElementAndClickOnIt(WebElement element) throws InterruptedException {

        Thread.sleep(750);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

    public String getRandomEmailString() {
        String RansomEmail = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * RansomEmail.length());
            salt.append(RansomEmail.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public String getRandomNameArabic() {
        String RansomName = "ابتثجحخدرزسشصضطظعغفقكلمنهوي";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6) { // length of the random string.
            int index = (int) (rnd.nextFloat() * RansomName.length());
            salt.append(RansomName.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
    public String getRandomNameEnglish() {
        String RansomName = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6) { // length of the random string.
            int index = (int) (rnd.nextFloat() * RansomName.length());
            salt.append(RansomName.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public String getRandomPlateCode() {
        String RansomName = "ََQWERTYUIOPLKJHGFDSAZXCVBNM";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 2) { // length of the random string.
            int index = (int) (rnd.nextFloat() * RansomName.length());
            salt.append(RansomName.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }


    public String getRandomInvestorName() {
        String RansomName = "qwertyuioasdf";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6) { // length of the random string.
            int index = (int) (rnd.nextFloat() * RansomName.length());
            salt.append(RansomName.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public void getOtpCodeNumbers(AndroidDriver driver, String number) {

        switch (number) {
            case "0":
                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
                break;
            case "1":
                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
                break;
            case "2":
                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
                break;
            case "3":
                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
                break;
            case "4":
                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_4));
                break;
            case "5":
                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5));
                break;
            case "6":
                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_6));
                break;
            case "7":
                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_7));
                break;
            case "8":
                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_8));
                break;
            case "9":
                driver.pressKey(new KeyEvent(AndroidKey.DIGIT_9));

        }
    }
}
