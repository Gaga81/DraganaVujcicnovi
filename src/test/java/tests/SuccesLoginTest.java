package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.PropertyManager;

public class SuccesLoginTest extends BasicTest{

    public HomePage homePage;
    public LoginPage loginPage;
        //RADI
    @Test

    public void successLogin(){

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(PropertyManager.getInstance().getUsername(),
                PropertyManager.getInstance().getPassword());

        try {
       homePage.verifySuccesLogin("PRODUCTS");
        System.out.print("User is logged in");
   } catch (Exception e) {
      Assert.fail("User is NOT logged in");
  }
    }
}
