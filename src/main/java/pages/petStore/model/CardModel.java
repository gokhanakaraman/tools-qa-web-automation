package pages.petStore.model;

import helpers.Helper;
import org.openqa.selenium.support.FindBy;
import pages.petStore.component.CardComponent;

import java.util.List;

import static utils.Driver.webDriver;

public class CardModel extends Helper {

    @FindBy(css = "card mt-4 top-card")
    private List<CardComponent> cardList;

    public CardModel() {
        super(webDriver);
    }

    public void selectCardWithTitle(String cardTitle) {
        waitUntilElementIsVisible(cardList.get(0), System.currentTimeMillis());
        for (CardComponent card : cardList) {
            if (cardTitle.equals(card.getCardTitle())) {
                card.click();
            }
        }
    }

    public void verifyCard(String cardTitle) {
        boolean isExist = false;
        for (int i = 0; i < cardList.size(); i++) {
            if (cardList.get(i).getCardTitle().equals(cardTitle))
                isExist = true;
        }
        //Assert.that(isExist, "The card you are looking for is not visible on the page");
    }
}
