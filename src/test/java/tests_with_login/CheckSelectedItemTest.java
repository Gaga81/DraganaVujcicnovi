package tests_with_login;

import dataCreations.DataCreations;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasicPage;
import pages.HomePage;
import pages.UserDetailsPage;

public class CheckSelectedItemTest extends BaseTestWithLogIn{

    public UserDetailsPage userDetailsPage;
    public HomePage homePage;
    public BasicPage basicPage;

    By itemNameSelectedBy = By.xpath("//div[@class = 'inventory_item_name']");






    @Test

    public void checkSelectedItem (){
        userDetailsPage = new UserDetailsPage(driver);
        homePage = new HomePage(driver);
        basicPage = new BasicPage(driver);




        userDetailsPage.checkSelectedItem();
       driver.findElement(itemNameSelectedBy).getText();




        try {
           homePage.verifySelectedItem("Sauce Labs Backpack");
           System.out.print("You selected Sauce Labs Backpack.");
        }catch (Exception e){
            Assert.fail("You selected other item.");
        }
    }
}
