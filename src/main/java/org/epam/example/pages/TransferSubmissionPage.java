package org.epam.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Action class for Transfer Submission Page.
 */
public class TransferSubmissionPage {

    private WebDriver driver;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@id='successMessage']")
    private WebElement successMessage;

    @FindBy(xpath = "//div[@id='accountBalance']")
    private WebElement accountBalance;

    public TransferSubmissionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }

    public String getAccountBalance() {
        return accountBalance.getText();
    }
}