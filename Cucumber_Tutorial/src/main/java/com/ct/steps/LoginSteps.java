package com.ct.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ct.base.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{

	@When("user enters valid username as {string} and password as {string}")
	public void userEntersValidUsernameAsAndPasswordAs(String username, String password) {
		WebElement usernameField = driver.findElement(By.xpath("//*[@name='username']"));
		WebElement passwordField = driver.findElement(By.xpath("//*[@name='password']"));
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
	}

	@When("clicks on login button")
	public void clicksOnLoginButton() {
		WebElement loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
		loginButton.click();
	}

	@Then("user should be navigated to home page")
	public void userShouldBeNavigatedToHomePage() {
		WebElement dashboardIcon = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		System.out.println(dashboardIcon.isDisplayed());
	}

	@Then("user clicks assign leave")
	public void userClicksAssignLeave() {
		WebElement assignLeave = driver.findElement(By.xpath("//button[@t='Assign Leave']"));
		assignLeave.click();
	}
}
