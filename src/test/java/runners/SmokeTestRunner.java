package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports-smoke.html",
                "json:target/json-reports/cucumber-smoke.json",
                "junit:target/xml-report/cucumber-smoke.xml"
        },
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "hooks"},
        tags = "@smTest",
        dryRun = false
)

public class SmokeTestRunner {
}
