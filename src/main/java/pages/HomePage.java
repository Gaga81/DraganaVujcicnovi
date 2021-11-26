package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasicPage{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    By errorNotificationPswdNullBy = By.xpath("//h3[@data-test='error']");
    By logoPictureBy = By.xpath("//div[@class='header_secondary_container']//span[@class='title']");
    By errorNotificationPswdWrongBy = By.xpath("//h3[@data-test ='error']");
    By errorNotificationUserNameNullBy = By.xpath("//h3[@data-test='error']");
    By validPswdNameBy = By.xpath("//div[@class='login_password']//h4");
    By countItemButtonBy = By.xpath("//div[@class='cart_quantity']");
    By shoppingBagButtonBy = By.xpath("//a[@class='shopping_cart_link']");
    By backHomeNoticeBy = By.id("back-to-products");
    By selectedItemBy = By.xpath("//div[@class='inventory_item_name']");




    public HomePage verifyFailedLoginCreditianlsNull (String expectedText) {
       String alert1 = readText(errorNotificationPswdNullBy);
        assertStringEquals(alert1, expectedText);
        return this;
    }

    public HomePage verifySuccesLogin (String expectedText){
        String alert = readText(logoPictureBy);
        assertStringEquals(alert, expectedText);
        return this;
    }
    public HomePage verifyFailedLoginPasswordWrong (String expectedText) {
        String logo = readText(errorNotificationPswdWrongBy);
        assertStringEquals(logo, expectedText);
        return this;
    }

    public HomePage verifyFailedLoginUserNull (String  expectedText){
        String alert2 = readText((errorNotificationUserNameNullBy));
        assertStringEquals(alert2, expectedText);
        return this;
    }
    public HomePage verifyLogout(String expectedText){
        String login = readText(validPswdNameBy);
        assertStringEquals(login, expectedText);
        return this;
    }

    public HomePage verifyRegistration(String expectedText){
        String register = readText(countItemButtonBy);
        assertStringEquals(register, expectedText);
        return this;
    }

    public HomePage verifyRemoveItem(String expectedText){
        String shopbag = readText(shoppingBagButtonBy);
        assertStringEquals(shopbag, expectedText);
        return this;
    }

    public HomePage verifyPurchaseFinish(String expectedText){
        String backHome = readText(backHomeNoticeBy);
        assertStringEquals(backHome, expectedText);
        return this;
    }

    public HomePage verifySelectedItem(String expectedText){
        String selectedItem = readText(selectedItemBy);
        assertStringEquals(selectedItem, expectedText);
        return this;
    }
}





