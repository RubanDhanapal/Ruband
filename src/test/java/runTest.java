
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "json:target/Destination/cucumber.json" })
// @CucumberOptions(format = { "html:target/Destination/cucumber" })

public class runTest {
}