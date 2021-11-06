package ec.edu.espol.workshops;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"pretty","html: build/reports/cucumber-report.html"},
features = "src/test/resources/ec/edu/espol/workshops/",
monochrome = true)
public class Runner {
	
}