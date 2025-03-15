package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;
import utility.Util;

import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(BaseTest.driver, this);
    }

    @FindBy(xpath = "//nav[@id='site-navigation']//span")
    public List<WebElement> navLinks;

    @FindBy(xpath = "//nav[@id='site-navigation']//span")
    public WebElement navLinkBar;

    public void selectMenu(String menuName) {

        Util.waitForVisiblityOfElement(navLinkBar, 5);

        for(WebElement n : navLinks) {
            String txtValue = n.getText();

            if(txtValue.equalsIgnoreCase(menuName)) {
                Util.jsClick(n);
//                n.click();
                break;
            }
        }
    }

}
