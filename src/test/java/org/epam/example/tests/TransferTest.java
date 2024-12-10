package org.epam.example.tests;

import org.epam.example.stepdefinitions.TransferSteps;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Test class for Transfer scenarios.
 */
public class TransferTest {

    private WebDriver driver;
    private TransferSteps transferSteps;

    @Before
    public void setUp() {
        // Set up WebDriver and initialize TransferSteps
        driver = new ChromeDriver();
        transferSteps = new TransferSteps(driver);
    }

    @Test
    public void testSuccessfulTransferSubmission() {
        transferSteps.theUserIsOnTheTransferSubmissionPage();
        transferSteps.theUserClicksTheSubmitButton();
        transferSteps.theTransferIsSubmittedSuccessfully();
        transferSteps.theSystemDisplaysATransferSuccessMessage();
        transferSteps.theAccountBalancesReflectTheTransferAmount();
    }

    @Test
    public void testErrorHandlingForInvalidAccounts() {
        transferSteps.theUserIsOnTheAccountSelectionPage();
        transferSteps.theUserSelectsAnInvalidFROMAccount();
        transferSteps.theSystemDisplaysAnErrorMessage();
        transferSteps.theUserSelectsAnInvalidTOAccount();
        transferSteps.theSystemDisplaysAnErrorMessage();
        transferSteps.theUserAttemptsToProceedWithTheTransfer();
        transferSteps.theSystemPreventsTheTransferAndShowsAnError();
    }

    @Test
    public void testConfirmTransferDetails() {
        transferSteps.theUserHasEnteredTransferDetails();
        transferSteps.theUserReviewsTheTransferDetailsDisplayed();
        transferSteps.theTransferDetailsAreDisplayedCorrectly();
        transferSteps.theUserClicksTheConfirmButton();
        transferSteps.theSystemPromptsForConfirmation();
        transferSteps.theConfirmationPromptDisplaysAccurateDetails();
    }

    @Test
    public void testValidateAccountSelection() {
        transferSteps.theUserIsOnTheAccountSelectionPage();
        transferSteps.theUserSelectsAValidFROMAccount();
        transferSteps.theFROMAccountIsSelected();
        transferSteps.theUserSelectsAValidTOAccount();
        transferSteps.theTOAccountIsSelected();
        transferSteps.theSystemValidatesTheSelectedAccounts();
        transferSteps.theSystemConfirmsValidAccounts();
    }

    @Test
    public void testVerifyA2ARetailTransferInitiation() {
        transferSteps.theUserIsOnTheMainTransferPage();
        transferSteps.theUserClicksOnTheInitiateTransferButton();
        transferSteps.theTransferInitiationFormIsDisplayed();
        transferSteps.theFROMAccountFieldIsVisible();
        transferSteps.theTOAccountFieldIsVisible();
    }
}