package org.epam.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Action class for Main Transfer Page.
 */
public class MainTransferPage {

    private WebDriver driver;

    @FindBy(xpath = "//button[@id='initiateTransfer']")
    private WebElement initiateTransferButton;

    @FindBy(xpath = "//input[@id='fromAccountField']")
    private WebElement fromAccountField;

    @FindBy(xpath = "//input[@id='toAccountField']")
    private WebElement toAccountField;

    public MainTransferPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickInitiateTransferButton() {
        initiateTransferButton.click();
    }

    public boolean isFromAccountFieldVisible() {
        return fromAccountField.isDisplayed();
    }

    public boolean isToAccountFieldVisible() {
        return toAccountField.isDisplayed();
    }
}