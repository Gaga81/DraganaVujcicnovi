package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.PropertyManager;

public class LoginPage extends BasicPage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    By userNameBy = By.id("user-name");
    By passwordBy = By.id("password");
    By loginButtonBy = By.id("login-button");


    String baseUrl = PropertyManager.getInstance().getUrl();

    public LoginPage basePage(){
        driver.get(baseUrl);
        return this;
    }

    public LoginPage loginFailedUsernameNull (String password){
        writeText(passwordBy, password);
        click(loginButtonBy);
        return this;
    }

    public LoginPage loginFailedPasswordNull(String username){
        writeText(userNameBy, username);
        click(loginButtonBy);
        return this;
    }

    public LoginPage login (String username, String password){
        writeText(userNameBy, username);
        writeText(passwordBy, password);
        click(loginButtonBy);
        return this;
    }
}
