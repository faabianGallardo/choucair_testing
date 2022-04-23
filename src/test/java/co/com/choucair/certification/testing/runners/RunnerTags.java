package co.com.choucair.certification.testing.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/utestChoucair.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.testing.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
