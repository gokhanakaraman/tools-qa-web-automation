package helpers;

import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Helper {
    private WebDriver webDriver;
    private WebDriverWait wait;
    int counter = 0;

    public Helper(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(webDriver), this);
        wait = new WebDriverWait(webDriver, 10);
    }

    public WebElement waitUntilElementIsVisible(WebElement element, long startTime) {
        if ((System.currentTimeMillis() - startTime) > 10000)
            return null;
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return element;
        } catch (StaleElementReferenceException e) {
            counter++;
            System.out.println(counter);
            System.out.println(e);
            return waitUntilElementIsVisible(element, startTime);
        }
    }

    public WebElement waitUntilElementIsClickable(WebElement element, long startTime) {
        if ((System.currentTimeMillis() - startTime) > 10000)
            return null;
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return element;
        } catch (StaleElementReferenceException e) {
            System.out.println(e);
            return waitUntilElementIsClickable(element, startTime);
        }
    }

    public void clickWithJS(WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", webElement);
    }

    public void scrollWithJS(WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", webElement);
    }
}
