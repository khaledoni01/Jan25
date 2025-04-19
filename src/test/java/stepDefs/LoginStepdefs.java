package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepdefs {

    @Given("user provides username {string} and password {string}")
    public void userProvidesUsernameAndPassword(String username, String password) {
        LoginPage lp = new LoginPage();
        lp.loginWithCucumber(username, password);
    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        LoginPage lp = new LoginPage();
        lp.clickLoginButton();
    }

    @Then("user should see error message")
    public void userShouldSeeErrorMessage() {
        LoginPage lp = new LoginPage();
        lp.verifyErrorMessage();
    }
}
