package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.BasicPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.PropertyManager;

public class FailedLoginUsernameTest extends BasicTest{

    public HomePage homePage;
    public LoginPage loginPage;
        //RADI
    @Test

    public void failedLoginUserNull(){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.loginFailedUsernameNull(PropertyManager.getInstance().getPassword());

        try {
            homePage.verifyFailedLoginUserNull("Epic sadface: Username is required");
            System.out.print("User name is missing");
        } catch (Exception e) {
            Assert.fail("User is logged in");
        }

    }
}
