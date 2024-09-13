package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage  {

    private WebDriver driver;

    //constructor WebDriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators for username, password, login button, success and failure messages
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("button[type=submit]");
    private By succesMessage = By.id("flash");
    private By errorMessage = By.cssSelector(".flash.error");

    //Method to enter username and password
    public void enterPassword(String password)  {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    //Method to click button
    public void clickButtonLogin(){
        driver.findElement(loginButton).click();
    }

    //Method login
    public void login(String username, String password){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    //Method to check if the login is success
    public boolean isLoginSuccesful(){
        return driver.findElement(succesMessage).isDisplayed();
    }

    //Method to check if the login is success
    public boolean isLoginFailed(){
        return driver.findElement(errorMessage).isDisplayed() && driver.findElement(errorMessage).getText().contains("Your username is invalid!");
    }



}
