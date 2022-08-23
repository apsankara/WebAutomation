package testExecution;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/features",
		glue="stepDefinition",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:target/cucumber1.html"}
		)

public class TestRunner {

}