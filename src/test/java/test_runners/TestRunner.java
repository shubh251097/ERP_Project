package test_runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/resources/Features",
	glue={"stepdefinitions"},
	plugin={
			"pretty",
			 "html:test-output/reports/cucumber-report.html",
			 },
	monochrome=true
	)
	
	
	public class TestRunner {
	}
	
