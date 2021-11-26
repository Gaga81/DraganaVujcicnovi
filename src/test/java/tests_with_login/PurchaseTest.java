package tests_with_login;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import dataCreations.DataCreations;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.BasicPage;
import pages.HomePage;
import pages.UserDetailsPage;
import utilities.PropertyManager;

public class PurchaseTest extends BaseTestWithLogIn{

    UserDetailsPage userDetailsPage;
    HomePage homePage;
    BasicPage basicPage;


   @Test

    public void purchaseItem()   {
        userDetailsPage = new UserDetailsPage(driver);
        homePage = new HomePage(driver);
        basicPage = new BasicPage(driver);
        userDetailsPage.startPurchaseItem();
        userDetailsPage.register(DataCreations.registrationDetails());
        userDetailsPage.finishShopping();

        try {
            homePage.verifyPurchaseFinish("BACK HOME");
            System.out.print("Thank you for your order");
        }catch (Exception e){
            Assert.fail("Please finish your order");
        }

    }

}

