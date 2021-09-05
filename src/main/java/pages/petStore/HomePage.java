package pages.petStore;

import helpers.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.petStore.component.CardComponent;

import java.util.List;

import static utils.Driver.webDriver;

public class HomePage extends Helper {

    @FindBy(css = "[id*='app'] [src='/images/Toolsqa.jpg']")
    private WebElement logo;

    @FindBy(css = "[class*='banner-image']")
    private WebElement bannerImage;

    @FindBy(css = "[class*='card mt-4 top-card']")
    private List<CardComponent> cardList;

    public HomePage() {
        super(webDriver);
    }

    public void isHomePageDisplayed() {
        waitUntilElementIsVisible(bannerImage, System.currentTimeMillis());
    }

    public void selectCardWithTitle(String cardTitle) {
        for (CardComponent card : cardList) {
            waitUntilElementIsVisible(card, System.currentTimeMillis());
            if (cardTitle.equals(card.getCardTitle())) {
                card.clickCard();
            }
        }
    }
}
