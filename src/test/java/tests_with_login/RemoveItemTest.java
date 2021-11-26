package tests_with_login;

import com.github.dockerjava.api.command.AuthCmd;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.LoginPage;
import pages.UserDetailsPage;

public class RemoveItemTest extends BaseTestWithLogIn{

    public UserDetailsPage userDetailsPage;
    public HomePage homePage;
    public LoginPage loginPage;




    @Test

    public void removeItem (){
        userDetailsPage = new UserDetailsPage(driver);
        homePage = new HomePage(driver);

        userDetailsPage.removeItem();

        try {
            homePage.verifyRemoveItem("");
            System.out.print("Item has been removed from your bag");
            }catch (Exception e){
            Assert.fail("Item has not been removed");
        }
    }



}
