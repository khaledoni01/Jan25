package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTestWithInvalidCredentials() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }

}
