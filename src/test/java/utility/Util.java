package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

public class Util {

    public static void sendKeys(WebElement element, String text) {
        element.clear();
        element.sendKeys(text.trim());
    }

    public static void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseTest.driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static void waitForVisiblityOfElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseTest.driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitForVisiblityOfElement(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(BaseTest.driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
