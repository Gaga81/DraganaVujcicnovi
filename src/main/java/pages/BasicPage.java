package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class BasicPage {

    public WebDriver driver ;
    public WebDriverWait wait;


    public BasicPage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,20);
    }

    public void waitVisibility( By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void click (By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();

    }

    public void writeText(By elementBy, String text){
            waitVisibility(elementBy);
            driver.findElement(elementBy).clear();
            driver.findElement(elementBy).sendKeys(text);
    }

    public String readText(By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }
        //compare method
    public void assertStringEquals(String string, String expectedText){
        Assert.assertEquals(string, expectedText);
    }

    public void moveElement (By elementBy){
        Actions actions = new Actions(driver);
        waitVisibility(elementBy);
        actions.moveToElement(driver.findElement(elementBy)).perform();
    }



}
