package runners;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import static org.junit.Assert.assertTrue;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    //Setup WebDriver and openBrowser
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        loginPage = new LoginPage(driver);

    }

    //Test for successful login
    @Test
    public void testLoginSuccess(){
        loginPage.login("tomsmith", "SuperSecretPassword!");
        assertTrue("Login Should be Sucessfull", loginPage.isLoginSuccesful());
    }

    //Test for failed login
    @Test
    public void testLoginFail(){
        loginPage.login("qwerty123", "asd123");
        assertTrue("Login Should be Failed", loginPage.isLoginFailed());
    }

    @After
    public void tearDown(){
        driver.quit();
    }



}
