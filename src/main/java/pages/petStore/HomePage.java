package pages.petStore;

import helpers.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.petStore.model.CardModel;

import static utils.Driver.webDriver;

public class HomePage extends Helper {

    public CardModel cardModel = new CardModel();

    @FindBy(css = "[id*='app'] [src='/images/Toolsqa.jpg']")
    private WebElement logo;

    @FindBy(css = "[class*='banner-image']")
    private WebElement bannerImage;


    public HomePage() {
        super(webDriver);
    }

    public void verifyCard(String cardTitle) {
        cardModel.verifyCard(cardTitle);
    }
}
