package com.ct.steps;

import com.ct.base.BaseClass;

import io.cucumber.java.en.When;

public class TitleSteps extends BaseClass{


	@When("user gets page title")
	public void userGetsPageTitle() {
		System.out.println("Page Title :"+driver.getTitle());
	}
}
