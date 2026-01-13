package com.ct.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ct.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks extends BaseClass{

	@Before
	public void beforeScenario(Scenario scenario)
	{
		String id = scenario.getId();
		
		String name = scenario.getName();
		
		Integer line = scenario.getLine();
		
		System.out.println("Scenario ID:: "+id);
		
		System.out.println("Scenario Name:: "+name);
		
		System.out.println("Scenario Line:: "+line);
	}
	
	@After
	public void afterScenario(Scenario scenario)
	{
		Status status = scenario.getStatus();
		
		System.out.println("Scenario Run status:: "+status.toString());
		
		if(scenario.isFailed())
		{
			TakesScreenshot screen=(TakesScreenshot)driver;
			byte[] screenshotAs = screen.getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(screenshotAs, "image/png", "failed screenshot...");
		}
	}
}
