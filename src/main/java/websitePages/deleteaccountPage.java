package websitePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class deleteaccountPage {
    private WebDriver driver;
    public deleteaccountPage(WebDriver driver) {
        this.driver = driver;
    }
    //locators
    private final By deleteAccountText = new By.ByXPath("//h2[@data-qa='account-deleted']");
    //Validations
    public deleteaccountPage DeleteAccountDisplayed(){
        Assert.assertTrue(driver.findElement(deleteAccountText).isDisplayed());
        return this;
    }

}
