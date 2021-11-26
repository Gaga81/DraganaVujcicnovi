package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.BasicPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.PropertyManager;


public class FailedLoginPasswordTest extends BasicTest {

    public HomePage homePage;
    public LoginPage loginPage;

        //RADI
    @Test

    public void failedLoginPasswordNull() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.loginFailedPasswordNull(PropertyManager.getInstance().getUsername());

        try {
            homePage.verifyFailedLoginCreditianlsNull("Epic sadface: Password is required");
            System.out.print("User password missing");
        } catch (Exception e) {
            Assert.fail("User is logged in");
        }

    }
        //RADI
    @Test
    public void failedLogin() {

        loginPage = new LoginPage((driver));
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(PropertyManager.getInstance().getUsername(),
                PropertyManager.getInstance().getBad_login_password());

        try {
            homePage.verifyFailedLoginPasswordWrong("Epic sadface: Username and password do not match any user in this service");
            System.out.print("User is not logged in");
        } catch (Exception e) {
            Assert.fail("User is logged in");
        }
    }
}
