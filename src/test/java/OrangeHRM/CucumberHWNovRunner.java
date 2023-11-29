package OrangeHRM;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
            features = "src/test/java/OrangeHRM/",
            glue = "OrangeHRM",
            plugin = {"pretty", "html:cucumberReports/cucumber-reports2.html"},
            monochrome = true
)

public class CucumberHWNovRunner{

}

