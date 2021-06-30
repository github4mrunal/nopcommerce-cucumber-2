package com.nopcommerce.demo.stepdefs;

import com.nopcommerce.demo.pages.RegisterationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Random;

public class RegisterationStepdefs {
    @Given("^I am on Hompepage$")
    public void iAmOnHompepage() throws InterruptedException {
        new RegisterationPage().clickOnRegisterLink();
        Thread.sleep(3000);
    }

    @And("^I click 'Male' Gender button$")
    public void iClickMaleGenderButton() {
        new RegisterationPage().clickOnGenderRadioButton();
    }

    @And("^I enter 'FirstName' \"([^\"]*)\"$")
    public void iEnterFirstName(String frstname)  {
        new RegisterationPage().enterFirstNameField(frstname);

    }

    @And("^I enter 'LastName' \"([^\"]*)\"$")
    public void iEnterLastName(String lstname)  {
        new RegisterationPage().enterLastNameField(lstname);

    }

    @And("^I enter 'DateOfBirth' \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnterDateOfBirth(String day, String month, String year)  {
        new RegisterationPage().selectBirthDateMonthAndYear(day,month,year);

    }

    @And("^I enter 'Email' \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        Random r = new Random();
        email= "jarvis" + r.nextInt() + "@gmail.com";
        new RegisterationPage().enterEmail(email);
        System.out.println(email);


    }

    @And("^I enter 'Company Name' as \"([^\"]*)\"$")
    public void iEnterCompanyNameAs(String companyname)  {
        new RegisterationPage().setCompanyName(companyname);

    }

    @And("^I enter 'Password' as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password)  {
        new RegisterationPage().setPassword(password);

    }

    @And("^I enter 'Confirm Password' as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String confirmpass)  {
        new RegisterationPage().setConfirmPassword(confirmpass);

    }

    @When("^I click 'REGISTER' button$")
    public void iClickREGISTERButton() {
        new RegisterationPage().clickOnRegisterButton();
    }

    @Then("^I should Register successfully with a message \"([^\"]*)\"Your registration completed\"([^\"]*)\"$")
    public void iShouldRegisterSuccessfullyWithAMessageYourRegistrationCompleted(String arg0, String arg1)  {
        Assert.assertEquals("Your registration completed",new RegisterationPage().registerationSuccessText());
    }

    @And("^I should LogOut by cliking 'Logout' button$")
    public void iShouldLogOutByClikingLogoutButton() {
        new RegisterationPage().clickingOnLogout();
    }

    @Then("^I should see text \"([^\"]*)\"below firstname field$")
    public void iShouldSeeTextBelowFirstnameField(String firstname) {
        Assert.assertEquals("First name is required.",new RegisterationPage().getFirstNameErrorMessage());

    }
}
