package websitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class homePage {
    private WebDriver driver;
    String homePage = "https://automationexercise.com/";
    //locator
    private final By homePageIcon = new By.ByXPath("//i[@class='fa fa-home']");
    private final By signupLogInButton = new By.ByXPath("//i[@class='fa fa-lock']");
    private final By loginasuser= new By.ByXPath("//i[@class='fa fa-user']");
    private final By deleteAccountButton= new By.ByXPath("//a[@href='/delete_account']");

    public homePage(WebDriver driver) {
        this.driver = driver;
    }
    //actions
    public void navigatetohomepage(){
        driver.navigate().to(homePage);
    }
    public homePage signUpLogINButtonClick() {
        driver.findElement(signupLogInButton).click();
        return this;
    }
    //validations
    public homePage homePageIcondisplayed(){
        Assert.assertTrue(driver.findElement(homePageIcon).isDisplayed());
        return this;
    }
    public homePage loginasuserDisplayed(){
        Assert.assertTrue(driver.findElement(loginasuser).isDisplayed());
        return this;
    }
    public homePage deleteaccountClick(){
        driver.findElement(deleteAccountButton).click();
        return this;
    }
}
