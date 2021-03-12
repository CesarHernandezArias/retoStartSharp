package co.com.choucair.StartShap.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/StartShap.feature",
        tags = "@stories",
        glue = "co.com.choucair.StartShap.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}