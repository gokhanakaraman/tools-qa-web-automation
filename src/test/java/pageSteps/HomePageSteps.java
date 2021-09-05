package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.petStore.HomePage;

public class HomePageSteps {

    private static HomePage homePage = new HomePage();

    @Step("Check <cardTitle> card in the homepage")
    public void checkCardInThePage(String cardTitle) throws Exception {
        homePage.verifyCard(cardTitle);
    }
}
