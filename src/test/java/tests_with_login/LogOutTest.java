package tests_with_login;


import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserDetailsPage;

public class LogOutTest extends BaseTestWithLogIn{
    public UserDetailsPage userDetailsPage;
    public HomePage homePage;
    public LoginPage loginPage;

    @Test
    public void logout()  {
        userDetailsPage = new UserDetailsPage(driver);
        homePage=new HomePage(driver);
        loginPage = new LoginPage(driver);

        userDetailsPage.logout();


        try {
          homePage.verifyLogout("Password for all users:");
         System.out.print("User is logged out");
       }
        catch (Exception e){
            Assert.fail("User is logged in");
        }
    }
}
