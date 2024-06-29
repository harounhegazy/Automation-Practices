package websitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class signup {
    private WebDriver driver;
    public signup(WebDriver driver) {
        this.driver = driver;
    }
    //locators
    private final By password = new By.ByXPath("//input[@data-qa='login-password']");
    private final By email = new By.ByXPath("//input[@data-qa='login-email']");
    private final By loginButton = new By.ByXPath("//button[@data-qa='login-button']");
    private final By loginText = new By.ByXPath("//h2[contains(text(),'Login to your account')]");
    ////Actions
    public signup insertCredentials(String mail, String Password){
        driver.findElement(password).sendKeys(Password);
        driver.findElement(email).sendKeys(mail);
        return this;

    }
    public signup clickLogin(){
        driver.findElement(loginButton).click();
        return this;

    }
    ///validations
    public signup logInTextisplayed(){
        Assert.assertTrue(driver.findElement(loginText).isDisplayed());
        return this;
    }
}

