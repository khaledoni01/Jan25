package tests;

import org.testng.annotations.Test;
import pages.FirstPage;

public class FirstPageTest extends BaseTest{

    @Test(groups = {"regression"})
    public void selectMonthTest() {
        FirstPage firstPage = new FirstPage();
        firstPage.selectMonth(" Mar");
    }
}
