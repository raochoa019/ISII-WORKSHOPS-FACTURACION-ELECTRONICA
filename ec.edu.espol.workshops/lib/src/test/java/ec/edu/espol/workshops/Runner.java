package ec.edu.espol.workshops;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"pretty","html: build/reports/cucumber-report.html"},
features = "src/test/resources/ec/edu/espol/workshops/calculatePremium.feature",
monochrome = true)
public class Runner {
	
}