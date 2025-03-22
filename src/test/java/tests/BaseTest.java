package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

    public static WebDriver driver = null;
//    public static String baseURL = "https://nktechsolutions.com/membership-login/";
//    public static String baseURL = "file:///C:/Users/Khaled%20Zaman/OneDrive/Desktop/pc_backup/NK%20TECH%20Solutions/Automation/WebPage/index.html";
    public static String baseURL = null;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"baseURL"})
    public void launchBrowser(String baseURL) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(baseURL);

        this.baseURL = baseURL;
    }

//    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}
