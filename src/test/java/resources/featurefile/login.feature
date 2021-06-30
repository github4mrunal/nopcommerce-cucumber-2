Feature: Login Test

  As a User I want to login into nopcommerce website checking login functionality
@Sanity
  Scenario: User should navigate to login page successfully

    Given I am on homepage
    When  I click on log in link
    Then  I should navigate to login page successfully

@Smoke
  Scenario: User should login successfully with valid credentials

    Given I am on homepage
    When  I click on log in link
    And  I enter email "jarvis@gmail.com"
    And I enter password "test123"
    And I click on login button
    Then I should login successfully


@Regression
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When  I click on log in link
    And   I enter email "<email>"
    And  I enter password "<password>"
    And  I click on login button
    Then I should see the error message "<errorMessage>"

    Examples:
      | email          | password | errorMessage                                                                               |
      | abc@test.com   | 123      | Login was unsuccessful. Please correct the errors and try again. No customer account found |
      | xyz@gmail.com  | avc      | Login was unsuccessful. Please correct the errors and try again. No customer account found |
      | test@gmail.com | 12345    | Login was unsuccessful. Please correct the errors and try again. No customer account found |
