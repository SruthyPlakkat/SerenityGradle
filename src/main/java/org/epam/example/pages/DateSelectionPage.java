package org.epam.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DateSelectionPage {

    private WebDriver driver;

    @FindBy(id = "dateInputField")
    private WebElement dateInputField;

    @FindBy(id = "calendarInterface")
    private WebElement calendarInterface;

    @FindBy(xpath = "//div[@class='error-message']")
    private WebElement errorMessage;

    @FindBy(xpath = "//button[@id='confirmDate']")
    private WebElement confirmDateButton;

    public DateSelectionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openDateSelectionPage(String url) {
        driver.get(url);
    }

    public void clickDateInputField() {
        dateInputField.click();
    }

    public boolean isCalendarInterfaceDisplayed() {
        return calendarInterface.isDisplayed();
    }

    public void selectDate(String date) {
        // Implement logic to select the date from the calendar
    }

    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }

    public String getErrorMessageText() {
        return errorMessage.getText();
    }

    public void confirmDateSelection() {
        confirmDateButton.click();
    }

    public String getSelectedDate() {
        return dateInputField.getAttribute("value");
    }

    public void waitForElementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
