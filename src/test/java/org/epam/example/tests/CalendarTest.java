package org.epam.example.tests;

import org.epam.example.stepdefinitions.CalendarSteps;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "org.epam.example.stepdefinitions")
public class CalendarTest {

    private WebDriver driver;
    private CalendarSteps calendarSteps;

    public CalendarTest() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        this.driver = new ChromeDriver();
        this.calendarSteps = new CalendarSteps(driver);
    }

    @org.junit.Before
    public void setUp() {
        driver.get("http://example.com/calendar");
    }

    @org.junit.After
    public void tearDown() {
        driver.quit();
    }
}
