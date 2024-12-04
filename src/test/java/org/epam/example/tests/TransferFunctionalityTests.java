package org.epam.example.tests;

import org.epam.example.pages.TransferPageActions;
import org.epam.example.stepdefinitions.TransferFunctionalityStepDefinitions;
import org.junit.Before;
import org.junit.Test;

public class TransferFunctionalityTests {

    private TransferPageActions transferPageActions;
    private TransferFunctionalityStepDefinitions stepDefinitions;

    @Before
    public void setUp() {
        transferPageActions = new TransferPageActions();
        stepDefinitions = new TransferFunctionalityStepDefinitions();
    }

    @Test
    public void testSuccessfulTransferSubmission() {
        stepDefinitions.theUserIsOnTheTransferPage();
        stepDefinitions.theUserClicksTheSubmitButton();
        stepDefinitions.theTransferIsSubmittedSuccessfully();
        stepDefinitions.theSystemDisplaysATransferSuccessMessage();
        stepDefinitions.theAccountBalancesReflectTheTransferAmount();
    }

    @Test
    public void testErrorHandlingForInvalidAccounts() {
        stepDefinitions.theUserIsOnTheTransferPage();
        stepDefinitions.theUserSelectsAnInvalidFROMAccount();
        stepDefinitions.theSystemDisplaysAnErrorMessage();
        stepDefinitions.theUserSelectsAnInvalidTOAccount();
        stepDefinitions.theSystemDisplaysAnErrorMessage();
        stepDefinitions.theUserAttemptsToProceedWithTheTransfer();
        stepDefinitions.theSystemPreventsTheTransferAndShowsAnError();
    }

    @Test
    public void testConfirmTransferDetails() {
        stepDefinitions.theUserIsOnTheTransferPage();
        stepDefinitions.theUserReviewsTheTransferDetailsDisplayed();
        stepDefinitions.theTransferDetailsAreDisplayedCorrectly();
        stepDefinitions.theUserClicksTheConfirmButton();
        stepDefinitions.theSystemPromptsForConfirmation();
        stepDefinitions.theConfirmationPromptDisplaysAccurateDetails();
    }

    @Test
    public void testValidateAccountSelection() {
        stepDefinitions.theUserIsOnTheTransferPage();
        stepDefinitions.theUserSelectsAValidFROMAccount();
        stepDefinitions.theFROMAccountIsSelected();
        stepDefinitions.theUserSelectsAValidTOAccount();
        stepDefinitions.theTOAccountIsSelected();
        stepDefinitions.theUserAttemptsToProceedWithTheTransfer();
        stepDefinitions.theSystemValidatesTheSelectedAccounts();
        stepDefinitions.theSystemConfirmsValidAccounts();
    }

    @Test
    public void testVerifyA2ARetailTransferInitiation() {
        stepDefinitions.theUserIsOnTheTransferPage();
        stepDefinitions.theUserClicksOnTheInitiateTransferButton();
        stepDefinitions.theTransferInitiationFormIsDisplayed();
        stepDefinitions.theFROMAccountFieldIsVisible();
        stepDefinitions.theTOAccountFieldIsVisible();
    }
}
