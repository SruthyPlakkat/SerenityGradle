package org.epam.example.stepdefinitions;

import org.epam.example.pages.TransferSubmissionPage;
import org.epam.example.pages.AccountSelectionPage;
import org.epam.example.pages.TransferDetailsPage;
import org.epam.example.pages.MainTransferPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Step Definition class for Transfer related scenarios.
 */
public class TransferSteps {

    private WebDriver driver;
    private TransferSubmissionPage transferSubmissionPage;
    private AccountSelectionPage accountSelectionPage;
    private TransferDetailsPage transferDetailsPage;
    private MainTransferPage mainTransferPage;

    public TransferSteps(WebDriver driver) {
        this.driver = driver;
        transferSubmissionPage = new TransferSubmissionPage(driver);
        accountSelectionPage = new AccountSelectionPage(driver);
        transferDetailsPage = new TransferDetailsPage(driver);
        mainTransferPage = new MainTransferPage(driver);
    }

    @Given("the user is on the transfer submission page")
    public void theUserIsOnTheTransferSubmissionPage() {
        // Navigate to the transfer submission page
    }

    @When("the user clicks the 'Submit' button")
    public void theUserClicksTheSubmitButton() {
        transferSubmissionPage.clickSubmitButton();
    }

    @Then("the transfer is submitted successfully")
    public void theTransferIsSubmittedSuccessfully() {
        Assert.assertEquals("Transfer Successful", transferSubmissionPage.getSuccessMessage());
    }

    @Then("the system displays a transfer success message")
    public void theSystemDisplaysATransferSuccessMessage() {
        Assert.assertEquals("Transfer Successful", transferSubmissionPage.getSuccessMessage());
    }

    @Then("the account balances reflect the transfer amount")
    public void theAccountBalancesReflectTheTransferAmount() {
        // Validate account balance
    }

    @Given("the user is on the account selection page")
    public void theUserIsOnTheAccountSelectionPage() {
        // Navigate to the account selection page
    }

    @When("the user selects an invalid 'FROM' account")
    public void theUserSelectsAnInvalidFROMAccount() {
        accountSelectionPage.selectFromAccount("InvalidAccount");
    }

    @Then("the system displays an error message")
    public void theSystemDisplaysAnErrorMessage() {
        Assert.assertEquals("Invalid Account", accountSelectionPage.getErrorMessage());
    }

    @When("the user selects an invalid 'TO' account")
    public void theUserSelectsAnInvalidTOAccount() {
        accountSelectionPage.selectToAccount("InvalidAccount");
    }

    @When("the user attempts to proceed with the transfer")
    public void theUserAttemptsToProceedWithTheTransfer() {
        // Attempt to proceed with the transfer
    }

    @Then("the system prevents the transfer and shows an error")
    public void theSystemPreventsTheTransferAndShowsAnError() {
        Assert.assertEquals("Transfer not allowed", accountSelectionPage.getErrorMessage());
    }

    @Given("the user has entered transfer details")
    public void theUserHasEnteredTransferDetails() {
        // Enter transfer details
    }

    @When("the user reviews the transfer details displayed")
    public void theUserReviewsTheTransferDetailsDisplayed() {
        // Review transfer details
    }

    @Then("the transfer details are displayed correctly")
    public void theTransferDetailsAreDisplayedCorrectly() {
        // Validate transfer details
    }

    @When("the user clicks the 'Confirm' button")
    public void theUserClicksTheConfirmButton() {
        transferDetailsPage.clickConfirmButton();
    }

    @Then("the system prompts for confirmation")
    public void theSystemPromptsForConfirmation() {
        Assert.assertTrue(transferDetailsPage.getConfirmationPrompt().contains("Confirm"));
    }

    @Then("the confirmation prompt displays accurate details")
    public void theConfirmationPromptDisplaysAccurateDetails() {
        // Validate confirmation prompt details
    }

    @When("the user selects a valid 'FROM' account")
    public void theUserSelectsAValidFROMAccount() {
        accountSelectionPage.selectFromAccount("ValidAccount");
    }

    @Then("the 'FROM' account is selected")
    public void theFROMAccountIsSelected() {
        // Validate 'FROM' account selection
    }

    @When("the user selects a valid 'TO' account")
    public void theUserSelectsAValidTOAccount() {
        accountSelectionPage.selectToAccount("ValidAccount");
    }

    @Then("the 'TO' account is selected")
    public void theTOAccountIsSelected() {
        // Validate 'TO' account selection
    }

    @Then("the system validates the selected accounts")
    public void theSystemValidatesTheSelectedAccounts() {
        // Validate selected accounts
    }

    @Then("the system confirms valid accounts")
    public void theSystemConfirmsValidAccounts() {
        // Confirm valid accounts
    }

    @Given("the user is on the main transfer page")
    public void theUserIsOnTheMainTransferPage() {
        // Navigate to the main transfer page
    }

    @When("the user clicks on the 'Initiate Transfer' button")
    public void theUserClicksOnTheInitiateTransferButton() {
        mainTransferPage.clickInitiateTransferButton();
    }

    @Then("the transfer initiation form is displayed")
    public void theTransferInitiationFormIsDisplayed() {
        // Validate transfer initiation form
    }

    @Then("the 'FROM' account field is visible")
    public void theFROMAccountFieldIsVisible() {
        Assert.assertTrue(mainTransferPage.isFromAccountFieldVisible());
    }

    @Then("the 'TO' account field is visible")
    public void theTOAccountFieldIsVisible() {
        Assert.assertTrue(mainTransferPage.isToAccountFieldVisible());
    }
}