package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import tests.BaseTest;
import tests.LoginTest;
import utility.Util;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(BaseTest.driver, this);
    }

    // Page Factory
    @FindBy(xpath = "//input[@name='swpm_user_name']")
    WebElement username;
    @FindBy(xpath = "//input[@name='swpm_password']")
    WebElement password;
    @FindBy(xpath = "//input[@name='swpm-login']")
    WebElement loginBtn;

    public void login(String uname, String password) {
        Util.sendKeys(username, uname);
        Util.sendKeys(this.password, password);
        loginBtn.click();

        Assert.assertEquals(BaseTest.driver.getCurrentUrl(), BaseTest.baseURL, "URL doesn't match");
    }


}
