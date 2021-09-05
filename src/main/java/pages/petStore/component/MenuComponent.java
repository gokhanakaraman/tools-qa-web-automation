package pages.petStore.component;

import com.github.webdriverextensions.WebComponent;
import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.Driver.webDriver;

public class MenuComponent extends WebComponent {

    @FindBy(css = "[class*='btn btn-light'] [class*='text']")
    private WebElement itemTitle;

    public MenuComponent() {
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(webDriver), this);
    }

    public void clickItem() {
        itemTitle.click();
    }

    public String getMenuItemTitle() {
        return itemTitle.getText();
    }
}
