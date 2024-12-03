package org.epam.example.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/epam/example/Feature/DateSelectionValidation.feature",
        glue = "org.epam.example.stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class DateSelectionTest {
    // This class will automatically run the scenarios defined in the feature file
}
