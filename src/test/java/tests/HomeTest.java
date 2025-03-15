package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends BaseTest {

    @Test
    public void testMenuOptions() {
        HomePage homePage = new HomePage();
        homePage.selectMenu("our services");
    }

}
