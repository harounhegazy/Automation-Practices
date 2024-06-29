
import websitePages.homePage;
import websitePages.deleteaccountPage;
import websitePages.signup;
import Engine.JsonFileManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestPractice {
private WebDriver driver;
JsonFileManager testdata;
private deleteaccountPage DeleteAccount;
private homePage HomePage;
private signup sgn;


@Test
    public void testcase1(){
    HomePage
            .homePageIcondisplayed()
            .signUpLogINButtonClick();
    sgn
            .logInTextisplayed()
            .insertCredentials(testdata.getTestData("Email"),testdata.getTestData("Password"))
            .clickLogin();
    HomePage
            .loginasuserDisplayed()
            .deleteaccountClick();
    DeleteAccount
            .DeleteAccountDisplayed();







}
///configurations
    @BeforeMethod
    public void beforemethod(){
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    HomePage= new homePage(driver);
    sgn= new signup(driver);
    DeleteAccount= new deleteaccountPage(driver);
    HomePage.navigatetohomepage();
    testdata = new JsonFileManager("src/test/resources/Test data/TestData.jason");
}
@AfterMethod

    public void afterMethod() {
        driver.quit();
    }
}
