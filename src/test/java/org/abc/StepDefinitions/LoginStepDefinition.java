package org.abc.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

    @Given("As a user i want to launch the application")
    public void as_a_user_i_want_to_launch_the_application() {
        System.out.println("step1");
       // throw new io.cucumber.java.PendingException();
    }
    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() {
        System.out.println("step2");
      //  throw new io.cucumber.java.PendingException();
    }
    @Then("login should be successful")
    public void login_should_be_successful() {
        System.out.println("step3");

    }

    @When("I enter invalid username and invalid password")
    public void i_enter_invalid_username_and_invalid_password() {
        System.out.println("invalid username step");

    }
    @Then("login should be fail")
    public void login_should_be_fail() {
        System.out.println("login fail");
    }

    @When("I enter valid username {string} and password {string}")
    public void i_enter_valid_username_and_password(String username, String password) {
        System.out.println("username is : "+username);
        System.out.println("password is :"+password);

    }
    @Then("user should see the {string}")
    public void user_should_see_the(String message) {
        System.out.println("message is :"+message);

    }

}
