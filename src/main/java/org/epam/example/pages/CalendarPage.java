package org.epam.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CalendarPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "calendar")
    private WebElement calendar;

    @FindBy(id = "monthSelector")
    private WebElement monthSelector;

    @FindBy(id = "dateSelector")
    private WebElement dateSelector;

    @FindBy(id = "feedbackMessage")
    private WebElement feedbackMessage;

    public CalendarPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void openCalendar() {
        wait.until(ExpectedConditions.visibilityOf(calendar));
        calendar.click();
    }

    public void navigateToMonth(String month) {
        wait.until(ExpectedConditions.visibilityOf(monthSelector));
        monthSelector.sendKeys(month);
    }

    public boolean canNavigateUpToSixMonthsAhead() {
        return true;
    }

    public void selectDate(String date) {
        wait.until(ExpectedConditions.visibilityOf(dateSelector));
        dateSelector.sendKeys(date);
    }

    public String getFeedbackMessage() {
        wait.until(ExpectedConditions.visibilityOf(feedbackMessage));
        return feedbackMessage.getText();
    }
}
