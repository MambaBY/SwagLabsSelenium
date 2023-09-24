package pages.checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public final By checkoutPageTitle = By.xpath("//span[@class='title']");

    public CheckoutPage checCheckoutPageTitle() {
        checkIfElementVisible(driver.findElement(checkoutPageTitle));
        Assert.assertEquals(driver.findElement(checkoutPageTitle).getText(), "Checkout: Your Information");
        return this;
    }
}
