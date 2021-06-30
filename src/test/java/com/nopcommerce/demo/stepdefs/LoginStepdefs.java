package com.nopcommerce.demo.stepdefs;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on log in link$")
    public void iClickOnLogInLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals("Welcome, Please Sign In!",new LoginPage().getWelcomeText());

    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws InterruptedException {
        Thread.sleep(3000);
        new LoginPage().enterEmailId(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        Assert.assertEquals("Welcome to our store",new LoginPage().getWelcomeToStore());

    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errormessage)  {
       // Assert.assertEquals(errormessage,new LoginPage().getErrorMessage());
        Assert.assertTrue(new LoginPage().getErrorMessage().contains(errormessage));//additional way for assert



    }
}
