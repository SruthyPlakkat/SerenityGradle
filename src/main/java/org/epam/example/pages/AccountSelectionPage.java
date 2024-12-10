package org.epam.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Action class for Account Selection Page.
 */
public class AccountSelectionPage {

    private WebDriver driver;

    @FindBy(xpath = "//select[@id='fromAccount']")
    private WebElement fromAccountDropdown;

    @FindBy(xpath = "//select[@id='toAccount']")
    private WebElement toAccountDropdown;

    @FindBy(xpath = "//div[@id='errorMessage']")
    private WebElement errorMessage;

    public AccountSelectionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectFromAccount(String account) {
        fromAccountDropdown.sendKeys(account);
    }

    public void selectToAccount(String account) {
        toAccountDropdown.sendKeys(account);
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}