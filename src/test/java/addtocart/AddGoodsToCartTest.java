package addtocart;

import base.BaseTest;
import org.testng.annotations.Test;

public class AddGoodsToCartTest extends BaseTest {
    @Test
    public void addToCart() {
        basePage.openHomePage();
        homePage.enterUserCredentials()
                .clickLoginButton();

        productsPage.checkProductPageTitle()
                    .addProductsToCart()
                    .checkCountAddedProducts()
                    .clickOnProdactCartLink();

        cartPage.checkCartPageTitle()
                .removeProductFromCart()
                .checkout();

        checkoutPage.checCheckoutPageTitle();
    }
}
