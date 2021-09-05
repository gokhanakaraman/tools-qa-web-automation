package pages.toolsQa;

import helpers.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.toolsQa.component.MenuComponent;

import java.util.List;

import static utils.Driver.webDriver;

public class ElementsPage extends Helper {

    @FindBy(css = "[class*='left-pannel']")
    private WebElement leftPanel;

    @FindBy(css = "[classname*='Advertisement-1']")
    private WebElement advertisement;

    @FindBy(css = "[class*='btn btn-light']")
    private List<MenuComponent> menuItemList;


    public ElementsPage() {
        super(webDriver);
    }

    public void isElementsPageDisplayed() {
        waitUntilElementIsVisible(advertisement, System.currentTimeMillis());
    }

    public void selectItemWithTitle(String menuItem) {
        for (MenuComponent item : menuItemList) {
            waitUntilElementIsVisible(item, System.currentTimeMillis());
            if (menuItem.equals(item.getMenuItemTitle())) {
                item.clickItem();
            }
        }
    }
}
