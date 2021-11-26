package tests_with_login;


import com.github.javafaker.Faker;
import dataCreations.DataCreations;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.UserDetailsPage;
import utilities.PropertyManager;

public class RetistrationTest extends BaseTestWithLogIn{

    public UserDetailsPage userDetailsPage;
    public HomePage homePage;


    @Test

    public void registration()   {
        homePage = new HomePage(driver);
        userDetailsPage = new UserDetailsPage(driver);
        userDetailsPage.startPurchaseItem();
        String registrationDetails []=DataCreations.registrationDetails();
        userDetailsPage.register(registrationDetails);


        try {
            homePage.verifyRegistration("1");
            System.out.print("User is registered");
            PropertyManager.changeProperty("first_name",registrationDetails[0]);
            PropertyManager.changeProperty("last_name", registrationDetails[1]);
            PropertyManager.changeProperty("postal_code", registrationDetails[2]);
       }catch (Exception e){
            Assert.fail("User is not registered");
            }

        }
}

