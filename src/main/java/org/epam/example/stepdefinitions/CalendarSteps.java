package org.epam.example.stepdefinitions;

import org.epam.example.pages.CalendarPage;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CalendarSteps {

    private WebDriver driver;
    private CalendarPage calendarPage;

    public CalendarSteps(WebDriver driver) {
        this.driver = driver;
        this.calendarPage = new CalendarPage(driver);
    }

    @Given("the calendar is open")
    public void theCalendarIsOpen() {
        calendarPage.openCalendar();
    }

    @When("the user navigates to the month {string}")
    public void theUserNavigatesToTheMonth(String month) {
        calendarPage.navigateToMonth(month);
    }

    @Then("the calendar should allow navigation up to 6 months ahead")
    public void theCalendarShouldAllowNavigationUpToSixMonthsAhead() {
        Assert.assertTrue("Navigation is not allowed up to 6 months ahead", calendarPage.canNavigateUpToSixMonthsAhead());
    }

    @When("the user selects a valid date {string}")
    public void theUserSelectsAValidDate(String validDate) {
        calendarPage.selectDate(validDate);
    }

    @Then("the date should be selected smoothly without errors")
    public void theDateShouldBeSelectedSmoothlyWithoutErrors() {
        Assert.assertEquals("Date selection error", "", calendarPage.getFeedbackMessage());
    }

    @When("the user attempts to select an invalid date {string}")
    public void theUserAttemptsToSelectAnInvalidDate(String invalidDate) {
        calendarPage.selectDate(invalidDate);
    }

    @Then("the system should provide clear feedback on invalid selection")
    public void theSystemShouldProvideClearFeedbackOnInvalidSelection() {
        Assert.assertNotEquals("No feedback on invalid selection", "", calendarPage.getFeedbackMessage());
    }
}
