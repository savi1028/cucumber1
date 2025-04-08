@main
Feature: user login
  Background:
    Given As a user i want to launch the application

  @login
Scenario: Valid login
 #Given As a user i want to launch the application
  When I enter valid username and valid password
  Then login should be successful

    @invalid_login @savi
  Scenario: Invalid login
    #Given As a user i want to launch the application
    When I enter invalid username and invalid password
    Then login should be fail

      @Datadriven
    Scenario Outline: Attempt to login with different set of data
      Given As a user i want to launch the application
      When I enter valid username "<username>" and password "<password>"
      Then user should see the "<message>"



      Examples:
      |username|password|message|
      |user1   |pass1   |login is successful  |
      |user2   |pass2   |login is fail  |
      |user3   |pass3   |login is successful   |
      |user4   |pass4   |login is succesful    |