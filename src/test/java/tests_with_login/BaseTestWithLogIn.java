package tests_with_login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;
import pages.LoginPage;
import utilities.PropertyManager;

import java.util.concurrent.TimeUnit;

public class BaseTestWithLogIn {
    public WebDriver driver;
    public ChromeOptions options;
    public LoginPage loginPage;
    public HomePage homePage;


    @Before

    public void setup(){
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");

        WebDriverManager.chromedriver().setup();


        //System.setProperty("webdriver.chrome.driver", PropertyManager.getInstance().getDriverPath());

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //driver.manage().window().maximize();


        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(PropertyManager.getInstance().getUsername(),
                        PropertyManager.getInstance().getPassword());
    }

    @After

    public void tearDown(){
        driver.quit();
    }
}
