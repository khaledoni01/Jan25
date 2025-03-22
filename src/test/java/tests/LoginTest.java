package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

//    public static void main(String[] args) {
//        String[][] arr = { {"a", "b"} };
//
//        System.out.println( arr[0].length );
//    }

    @DataProvider(name="loginData")
    public static Object[][] loginTestData() {

        return new Object[][] { {"admin", "admin"}, {"user", "test123"} };
    }

    @Test(groups = {"smoke"}, dataProvider = "loginData")
    public void loginTestWithInvalidCredentials(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

}
