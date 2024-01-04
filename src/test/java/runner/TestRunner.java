package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDef", "utility"},
        tags = " ",
        plugin = {"pretty", "html:target/RegressionReport.html", "json:cucumber.json"}
)
public class TestRunner {

}
