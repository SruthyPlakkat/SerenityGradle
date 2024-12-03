package org.epam.example.stepdefinitions;

import org.epam.example.pages.DateSelectionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class DateSelectionSteps {

    @Steps
    DateSelectionPage dateSelectionPage;

    @Given("the user is on the date selection page")
    public void theUserIsOnTheDateSelectionPage() {
        dateSelectionPage.openDateSelectionPage("http://example.com/date-selection");
    }

    @When("the user selects a date within the allowed range")
    public void theUserSelectsADateWithinTheAllowedRange() {
        dateSelectionPage.selectDate("2023-12-15"); // Example date within range
    }

    @Then("the system accepts the date without error")
    public void theSystemAcceptsTheDateWithoutError() {
        Assert.assertFalse(dateSelectionPage.isErrorMessageDisplayed());
    }

    @When("the user selects a date beyond the allowed range")
    public void theUserSelectsADateBeyondTheAllowedRange() {
        dateSelectionPage.selectDate("2024-12-15"); // Example date beyond range
    }

    @Then("the system displays an error message indicating invalid date selection")
    public void theSystemDisplaysAnErrorMessageIndicatingInvalidDateSelection() {
        Assert.assertTrue(dateSelectionPage.isErrorMessageDisplayed());
        Assert.assertEquals("Invalid date selection", dateSelectionPage.getErrorMessageText());
    }

    @When("the user attempts to select a date 7 months from today")
    public void theUserAttemptsToSelectADate7MonthsFromToday() {
        dateSelectionPage.selectDate("2024-05-15"); // Example date 7 months from today
    }

    @Then("the system prevents selection and displays an error message")
    public void theSystemPreventsSelectionAndDisplaysAnErrorMessage() {
        Assert.assertTrue(dateSelectionPage.isErrorMessageDisplayed());
        Assert.assertEquals("Invalid date selection", dateSelectionPage.getErrorMessageText());
    }

    @When("the user selects a date 3 months from today")
    public void theUserSelectsADate3MonthsFromToday() {
        dateSelectionPage.selectDate("2024-02-15"); // Example date 3 months from today
    }

    @Then("the selected date is highlighted and within allowed range")
    public void theSelectedDateIsHighlightedAndWithinAllowedRange() {
        // Implement logic to verify date is highlighted
    }

    @When("the user confirms the date selection")
    public void theUserConfirmsTheDateSelection() {
        dateSelectionPage.confirmDateSelection();
    }

    @Then("the date input field displays the selected future date")
    public void theDateInputFieldDisplaysTheSelectedFutureDate() {
        Assert.assertEquals("2024-02-15", dateSelectionPage.getSelectedDate());
    }

    @When("the user selects today's date from the calendar")
    public void theUserSelectsTodaysDateFromTheCalendar() {
        dateSelectionPage.selectDate("2023-11-15"); // Example today's date
    }

    @Then("today's date is highlighted and selected")
    public void todaysDateIsHighlightedAndSelected() {
        // Implement logic to verify today's date is highlighted
    }

    @Then("the date input field displays today's date")
    public void theDateInputFieldDisplaysTodaysDate() {
        Assert.assertEquals("2023-11-15", dateSelectionPage.getSelectedDate());
    }

    @When("the user clicks on the date input field")
    public void theUserClicksOnTheDateInputField() {
        dateSelectionPage.clickDateInputField();
    }

    @Then("the calendar interface is displayed")
    public void theCalendarInterfaceIsDisplayed() {
        Assert.assertTrue(dateSelectionPage.isCalendarInterfaceDisplayed());
    }
}
