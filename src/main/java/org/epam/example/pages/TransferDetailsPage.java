package org.epam.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Action class for Transfer Details Page.
 */
public class TransferDetailsPage {

    private WebDriver driver;

    @FindBy(xpath = "//button[@id='confirm']")
    private WebElement confirmButton;

    @FindBy(xpath = "//div[@id='confirmationPrompt']")
    private WebElement confirmationPrompt;

    public TransferDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickConfirmButton() {
        confirmButton.click();
    }

    public String getConfirmationPrompt() {
        return confirmationPrompt.getText();
    }
}