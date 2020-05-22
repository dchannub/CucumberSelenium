package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features"
,glue= {"stepDefinitions"}
,plugin = { "pretty", "html:target//cucumber-reports" ,// for html reports.
		 // "junit:target//cucumber-reports//Cucumber.xml",
		 "json:target//cucumber-reports//cucumber.json" } 
,monochrome = true
)

public class testrunner {

}