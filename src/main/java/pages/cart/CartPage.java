package pages.cart;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    private final By cartPageTitle = By.xpath("//span[@class='title']");
    private final By removeBikeLightButton = By.xpath("//button[@id='remove-sauce-labs-bike-light']");
    private final By checkoutButton = By.xpath("//button[@id='checkout']");

    public CartPage checkCartPageTitle() {
        checkIfElementVisible(driver.findElement(cartPageTitle));
        Assert.assertEquals(driver.findElement(cartPageTitle).getText(), "Your Cart");
        return this;
    }

    public CartPage removeProductFromCart() {
        driver.findElement(removeBikeLightButton).click();
        return this;
    }

    public CartPage checkout() {
        driver.findElement(checkoutButton).click();
        return this;
    }
}
