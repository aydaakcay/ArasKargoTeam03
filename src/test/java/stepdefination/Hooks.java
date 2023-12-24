package stepdefination;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.time.Duration;

public class Hooks {

    @Before
    public void setUp() throws Exception {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Driver.getDriver().manage().window().maximize();


    }
    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/jpeg", "scenario_" + scenario.getName());
            Driver.closeDriver();
        }
    }
}

