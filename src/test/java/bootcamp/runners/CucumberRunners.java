package bootcamp.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-html-reports"
        },
        glue = "bootcamp/step_def",
        features = "src/test/resources/features",
        tags = "@smoke",
        dryRun = false
)
public class CucumberRunners {
}




