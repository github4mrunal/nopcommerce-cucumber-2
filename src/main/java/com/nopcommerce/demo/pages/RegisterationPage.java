package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterationPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterationPage.class.getName());


    @FindBy(xpath = "//a[contains( text(), 'Register')]")//page factory model
    WebElement registerLink;

    @FindBy(xpath = "//h1[text()='Register']")
    WebElement regPageText;

    @FindBy(xpath = "//span[@class = 'male']")
    WebElement genderRadioButton;

    @FindBy(xpath = "//input[@name = 'FirstName']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@id = 'LastName']")
    WebElement lastNameField;

    @FindBy(xpath = "//select[@name = 'DateOfBirthDay']")
    WebElement dateOfBirth;

    @FindBy(xpath = "//select[@name = 'DateOfBirthMonth']")
    WebElement monthOfBirth;

    @FindBy(xpath = "//select[@name = 'DateOfBirthYear']")
    WebElement yearOfBirth;

    @FindBy(xpath = "//input[@id = 'Email']")
    WebElement email;

    @FindBy(xpath = "//input[@id = 'Company']")
    WebElement companyName;

    @FindBy(xpath = "//input[@id = 'Password']")
    WebElement password;

    @FindBy(xpath = "//input[@id = 'ConfirmPassword']")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[@id = 'register-button']")
    WebElement registerButton;

    @FindBy(xpath = "//div[contains(text(), 'Your registration completed')]")
    WebElement registerationsuccessfulmsg;

    @FindBy(xpath = "//span[text()='First name is required.']" )
    WebElement errormessage;

    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement clickOnLogOut;

    public void clickOnRegisterLink() throws InterruptedException {
      //  waitUntilVisibilityOfElementLocated((By) registerLink,20);
        clickOnElement(registerLink);
        log.info("Clicking on Register Link :" + registerLink.toString());
    }
    public String regPageTextIs() {
        log.info( "Get Register Page Text" + regPageText.toString() );
        return getTextFromElement( regPageText );
    }

    public void clickOnGenderRadioButton() {
        clickOnElement(genderRadioButton);
        log.info("Clicking on Gender Radio Button 'Male'" + genderRadioButton.toString());
    }

    public void enterFirstNameField(String firstname) {
        sendTextToElement(firstNameField, firstname);
        log.info("Entering First Name" + firstNameField.toString());

    }

    public void enterLastNameField(String lastname) {
        sendTextToElement(lastNameField, lastname);
        log.info("Entering Last Name" + lastNameField.toString());

    }
    public void selectBirthDateMonthAndYear(String date, String month, String year) {
        selectByValueFromDropDown(dateOfBirth, date);
        selectByValueFromDropDown(monthOfBirth, month);
        selectByValueFromDropDown(yearOfBirth, year);
        log.info("select birth date,month and year  " + dateOfBirth.toString() + monthOfBirth.toString() + yearOfBirth.toString());
    }
//    public void enterDateOfBirth(String dateofbirth) {
//        sendTextToElement(dateOfBirth, dateofbirth);
//        log.info("Entering Date Of Birth" + dateOfBirth.toString());
//    }
//
//    public void enterMonthOfBirth(String monthofbirth) {
//        sendTextToElement(monthOfBirth, monthofbirth);
//        log.info("Entering Month of Birth" + monthOfBirth.toString());
//
//    }
//    public void enterYearOfBirth(String yearofbirth){
//        sendTextToElement(yearOfBirth,yearofbirth);
//        log.info("Entering Year of Birth" + yearOfBirth.toString());
//    }

    public void enterEmail(String Email) {
        sendTextToElement(email, Email);
        log.info("Entering Email" + email.toString());

    }

    public void setCompanyName(String companyname) {
        sendTextToElement(companyName, companyname);
        log.info("Entering Company Name" + companyName.toString());
    }

    public void setPassword(String pass) {
        sendTextToElement(password, pass);
        log.info("Entering password" + password.toString());
    }

    public void setConfirmPassword(String confirmpassword) {
        sendTextToElement(confirmPassword, confirmpassword);
        log.info("Entering Confirm Password" + confirmPassword.toString());
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
        log.info("Clicking on Register Button" + registerButton.toString());
    }
    public String registerationSuccessText(){
        log.info("Get Registeration Success Page Text" + registerationsuccessfulmsg.toString());
        return getTextFromElement(registerationsuccessfulmsg);
    }
    public void clickingOnLogout(){
        clickOnElement(clickOnLogOut);
        log.info("Clicking on Log Out Button" + clickOnLogOut.toString());
    }

    public String getFirstNameErrorMessage(){
        log.info("Get error message from First Name" +errormessage.toString());
        return getTextFromElement(errormessage);
          }


}
