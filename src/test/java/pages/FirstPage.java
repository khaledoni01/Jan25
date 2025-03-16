package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import tests.BaseTest;

public class FirstPage {

    public FirstPage(){
        PageFactory.initElements(BaseTest.driver, this);
    }

    @FindBy(xpath = "//select[@id='month']")
    public WebElement monthDropdown;

    public void selectMonth(String monthName) {
        Select select = new Select(monthDropdown);
        select.selectByVisibleText(monthName);

        Alert alert = BaseTest.driver.switchTo().alert();
        alert.dismiss();
    }

}
