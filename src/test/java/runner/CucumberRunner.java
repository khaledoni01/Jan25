package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin = {"html:target/cucumber-report"},
        features = "src/test/resources/",
        glue = "stepDefs",
        tags = "@login",
        monochrome = true
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
