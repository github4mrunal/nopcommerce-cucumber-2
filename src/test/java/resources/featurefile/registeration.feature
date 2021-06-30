Feature: Registeration Page Functionality

  As a user I should Register Succesfully if I enter all Mandatory fields
@Sanity
  Scenario: I should Register Successfully by entering all Mandatory fields
    Given I am on Hompepage
    And I click 'Male' Gender button
    And I enter 'FirstName' "Mickey"
    And I enter 'LastName' "Mouse"
    And I enter 'DateOfBirth' "1","1","2021"
    And I enter 'Email' "jarvis@gmail.com"
    And I enter 'Company Name' as "IRON MAN"
    And I enter 'Password' as "test123"
    And I enter 'Confirm Password' as "test123"
    When I click 'REGISTER' button
    Then I should Register successfully with a message ""Your registration completed""
    And I should LogOut by cliking 'Logout' button


  Scenario: User should not able to register without First name
    Given I am on homepage
    When  I click 'REGISTER' button
    Then I should see text "First name is required."below firstname field