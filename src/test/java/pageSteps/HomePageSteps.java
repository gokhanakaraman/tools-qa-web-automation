package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.toolsQa.HomePage;

public class HomePageSteps {

    private static HomePage homePage = new HomePage();

    @Step("Verify homepage")
    public void verifyHomePage() throws Exception {
        homePage.isHomePageDisplayed();
    }

    @Step("Click <cardTitle> card in the homepage")
    public void clickCard(String cardTitle) {
        homePage.selectCardWithTitle(cardTitle);
    }
}
