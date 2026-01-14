package com.ct.runner;

import org.testng.annotations.BeforeSuite;

import com.ct.base.BaseClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(
		
		features = "src/main/resources/features",
		snippets = SnippetType.CAMELCASE,
		dryRun = !true,
		glue = {"com.ct.steps","com.ct.hooks"},
		tags = "@qa",
		plugin = {
				"pretty",
				"html:reports/index.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		
		)
public class LoginRun extends AbstractTestNGCucumberTests{

	@BeforeSuite
	public void setup()
	{
		BaseClass.createDriver();
	}
}
