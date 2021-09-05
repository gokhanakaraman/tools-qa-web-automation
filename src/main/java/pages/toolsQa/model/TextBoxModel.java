package pages.toolsQa.model;

import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.Driver.webDriver;

public class TextBoxModel {

    @FindBy(css = "[class='main-header']")
    private WebElement pageTitle;

    @FindBy(css = "[id='userName']")
    private WebElement usernameTextBox;

    @FindBy(css = "[id='userEmail']")
    private WebElement emailTextBox;

    @FindBy(css = "[id='currentAddress']")
    private WebElement currentAddressPlaceHolder;

    @FindBy(css = "[id='permanentAddress']")
    private WebElement permanentAddressPlaceHolder;

    @FindBy(css = "[id='submit']")
    private WebElement submitButton;

    public TextBoxModel() {
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(webDriver), this);
    }

    public void setUsername(String username){
        usernameTextBox.sendKeys(username);
    }

    public void setEmail(String email){
        emailTextBox.sendKeys(email);
    }

    public void setCurrentAddress(String currentAddress){
        currentAddressPlaceHolder.sendKeys(currentAddress);
    }

    public void setPermanentAddress(String permanentAddress) {
        permanentAddressPlaceHolder.sendKeys(permanentAddress);
    }

    public String getUsernameText() {
        return usernameTextBox.getText();
    }

    public String getEmailTextBox() {
        return emailTextBox.getText();
    }

    public String getCurrentAddress() {
        return currentAddressPlaceHolder.getText();
    }

    public String getPermanentAddress() {
        return permanentAddressPlaceHolder.getText();
    }

    public void saveForm(){
        submitButton.click();
    }
}
