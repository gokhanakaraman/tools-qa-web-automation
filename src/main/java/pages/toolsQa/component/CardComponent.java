package pages.toolsQa.component;

import com.github.webdriverextensions.WebComponent;
import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.Driver.webDriver;

public class CardComponent extends WebComponent {

    @FindBy(css = "[class*='avatar mx-auto white']")
    private WebElement cardIcon;

    @FindBy(css = "[class*='card-body']")
    private WebElement cardTitle;

    public CardComponent() {
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(webDriver), this);
    }

    public void clickCard() {
        cardTitle.click();
    }

    public String getCardTitle() {
        return cardTitle.getText();
    }

}
