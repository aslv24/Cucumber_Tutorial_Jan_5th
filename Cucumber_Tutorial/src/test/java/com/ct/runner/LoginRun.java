package com.ct.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(
		
		features = "src/main/resources/features",
		snippets = SnippetType.CAMELCASE,
		dryRun = !true,
		glue = "com.ct.steps",
		tags = "@smoke and @title",
		plugin = {
				"pretty",
				"html:reports/index.html"
		}
		
		)
public class LoginRun extends AbstractTestNGCucumberTests{

}
