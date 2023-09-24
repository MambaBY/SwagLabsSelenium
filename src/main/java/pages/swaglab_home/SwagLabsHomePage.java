package pages.swaglab_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constants.UserCredentials.LOGIN;
import static constants.Constants.UserCredentials.PASSWORD;

public class SwagLabsHomePage extends BasePage {
    public SwagLabsHomePage(WebDriver driver) {
        super(driver);
    }

    public final By loginInputField = By.xpath("//input[@id='user-name']");
    public final By passwordInputField = By.xpath("//input[@id='password']");
    public final By loginButton = By.xpath("//input[@id='login-button']");

    public SwagLabsHomePage enterUserCredentials (){
        driver.findElement(loginInputField).sendKeys(LOGIN);
        driver.findElement(passwordInputField).sendKeys(PASSWORD);
        return this;
    }

    public SwagLabsHomePage clickLoginButton (){
        driver.findElement(loginButton).click();
        return this;
    }
}
