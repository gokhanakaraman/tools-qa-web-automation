package pageSteps;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import pages.toolsQa.ElementsPage;
import pages.toolsQa.model.TextBoxModel;

public class ElementsPageSteps {

    public ElementsPage elementsPage = new ElementsPage();
    public TextBoxModel textBoxModel = new TextBoxModel();

    @Step("Verify Elements page")
    public void verifyElementsPage() {
        elementsPage.isElementsPageDisplayed();
    }

    @Step("Click <menuItem> in the Elements page")
    public void clickElement(String menuItem) {
        elementsPage.selectItemWithTitle(menuItem);
    }

    @Step("Type <username> into username")
    public void typeUsername(String username) {
        textBoxModel.setUsername(username);
    }

    @Step("Type <email> into email")
    public void typeEmail(String email) {
        textBoxModel.setEmail(email);
    }

    @Step("Type <currentAddress> into currentAddress")
    public void typeCurrentAddress(String currentAddress) {
        textBoxModel.setCurrentAddress(currentAddress);
    }

    @Step("Type <permanentAddress> into permanentAddress")
    public void typePermanentAddress(String permanentAddress) {
        textBoxModel.setPermanentAddress(permanentAddress);
    }

    @Step("Verify <username> typed into username")
    public void verifyUsernameText(String username) {
        Assert.assertEquals(textBoxModel.getUsernameText(), username);
    }

    @Step("Verify <email> typed into email")
    public void VerifyEmailText(String email) {
        Assert.assertEquals(textBoxModel.getEmailTextBox(), email);
    }

    @Step("Verify <currentAddress> typed into currentAddress")
    public void verifyCurrentAddressText(String currentAddress) {
        Assert.assertEquals(textBoxModel.getCurrentAddress(), currentAddress);
    }

    @Step("Verify <permanentAddress> typed into permanentAddress")
    public void verifyPermanentAddressText(String permanentAddress) {
        Assert.assertEquals(textBoxModel.getPermanentAddress(), permanentAddress);
    }

    @Step("Submit the form")
    public void submitForm() {
        textBoxModel.saveForm();
    }
}
