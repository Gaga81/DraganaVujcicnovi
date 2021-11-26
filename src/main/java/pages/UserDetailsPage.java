package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UserDetailsPage extends BasicPage{
    public UserDetailsPage(WebDriver driver) {
        super(driver);
    }

    By dropdownMenuButtonBy = By.id("react-burger-menu-btn");
    By logoutButtonBy = By.id("logout_sidebar_link");
    By addToCartButtonBy = By.id("add-to-cart-sauce-labs-backpack");
    By shoppingBagButtonBy = By.xpath("//a[@class='shopping_cart_link']");
    By checkoutButtonBy = By.id("checkout");
    By first_nameButtonBy = By.id("first-name");
    By last_nameButtonBy = By.id("last-name");
    By postal_codeButtonBy = By.id("postal-code");
    By continueButtonBy = By.id("continue");
    By finishShoppingButtonBy = By.id("finish");
    By cancelButtonBy = By.id("cancel");
    By removeItemButtonBy = By.id("remove-sauce-labs-backpack");
    By itemNameSelectedBy = By.xpath("//div[@class = 'inventory_item_name']");




    public UserDetailsPage logout()  {
        click(dropdownMenuButtonBy);
        click(logoutButtonBy);
        return this;
    }

    public UserDetailsPage startPurchaseItem(){
        click(addToCartButtonBy);
        click(shoppingBagButtonBy);
        click(checkoutButtonBy);
        return this;
    }


        //register user, faker details
    public UserDetailsPage register(String [] array ) {
        writeText(first_nameButtonBy, array [0]);
        writeText(last_nameButtonBy, array [1]);
        writeText(postal_codeButtonBy, array[2]);
        click(continueButtonBy);
        return this;
    }


    public UserDetailsPage finishShopping(){
        moveElement(cancelButtonBy);
        click(finishShoppingButtonBy);
        return this;
    }

    public UserDetailsPage removeItem(){
        click(addToCartButtonBy);
        click(shoppingBagButtonBy);
        click(removeItemButtonBy);
        return this;
    }

    public UserDetailsPage checkSelectedItem(){
        click(addToCartButtonBy);
        driver.findElement(itemNameSelectedBy);
        driver.findElement(itemNameSelectedBy).isDisplayed();
        return this;
    }

}
