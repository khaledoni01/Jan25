package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static WebDriver driver = null;
//    public static String baseURL = "https://nktechsolutions.com/membership-login/";
    public static String baseURL = "file:///C:/Users/Khaled%20Zaman/OneDrive/Desktop/pc_backup/NK%20TECH%20Solutions/Automation/WebPage/index.html";

    @BeforeMethod
    public void launchBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(baseURL);
    }

//    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
