package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constants.TimeOutVariables.EXPLICIT_WAIT_DURATION;
import static constants.Constants.Urls.HOME_PAGE;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {
        driver.get(HOME_PAGE);
    }

    public WebElement checkIfElementVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT_DURATION))
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }




}
