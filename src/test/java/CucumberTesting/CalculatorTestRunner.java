package CucumberTesting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/CucumberTesting",
        glue = "CucumberTesting",
        plugin = {"pretty","html:cucumberReports/cucumber-reports.html"}
)
public class CalculatorTestRunner {

}