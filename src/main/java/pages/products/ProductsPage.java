package pages.products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private final By productPageTitle = By.xpath("//span[@class='title']");
    public final By addToCartBackpack = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    public final By addToCartBikeLight= By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
    public final By addToCartJacket = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
    public final By productCounter = By.xpath("//span[@class='shopping_cart_badge']");
    public final By productCartLink = By.xpath("//a[@class='shopping_cart_link']");

    public ProductsPage checkProductPageTitle() {
        checkIfElementVisible(driver.findElement(productPageTitle));
        Assert.assertEquals(driver.findElement(productPageTitle).getText(), "Products");
        return this;
    }

    public ProductsPage addProductsToCart() {
        driver.findElement(addToCartBackpack).click();
        driver.findElement(addToCartBikeLight).click();
        driver.findElement(addToCartJacket).click();
        return this;
    }

    public ProductsPage checkCountAddedProducts(){
        checkIfElementVisible(driver.findElement(productCounter));
        Assert.assertEquals(driver.findElement(productCounter).getText(), "3");
        return this;
    }

    public ProductsPage clickOnProdactCartLink() {
        driver.findElement(productCartLink).click();
        return this;
    }
}