package base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.cart.CartPage;
import pages.checkout.CheckoutPage;
import pages.swaglab_home.SwagLabsHomePage;
import pages.products.ProductsPage;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPENED;

public class BaseTest {
    protected WebDriver driver = CommonActions.createWebDriver();
    public BasePage basePage = new BasePage(driver);
    public SwagLabsHomePage homePage = new SwagLabsHomePage(driver);
    public ProductsPage productsPage = new ProductsPage(driver);
    public CartPage cartPage = new CartPage(driver);
    public CheckoutPage checkoutPage = new CheckoutPage(driver);

    @AfterTest
    public void clearCookieAndLocalStorage () {
        if(CLEAR_COOKIES_AND_STORAGE){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void close (){
        if (HOLD_BROWSER_OPENED){
            driver.quit();
        }
    }
}
