package com.ct.steps;

import com.ct.base.BaseClass;

import io.cucumber.java.en.When;

public class UrlSteps extends BaseClass{
	
	@When("user gets page url")
	public void userGetsPageUrl() {
		System.out.println("Page Url :"+driver.getCurrentUrl());
	}

	
	
	
}
