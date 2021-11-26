package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class BasicTest {

    public WebDriver driver;
    public ChromeOptions options;

    @Before

    public void setup(){
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");

        WebDriverManager.chromedriver().setup();


        //System.setProperty("webdriver.chrome.driver", PropertyManager.getInstance().getDriverPath());


        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }

    @After

    public void tearDown(){
        driver.quit();
    }

}
