package com.ct.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;

	@When("user gets page title")
	public void userGetsPageTitle() {
		System.out.println("Page Title :"+driver.getTitle());
	}

	@When("user gets page url")
	public void userGetsPageUrl() {
		System.out.println("Page Url :"+driver.getCurrentUrl());
	}

	@Given("user is on login page")
	public void userIsOnLoginPage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
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
		WebElement assignLeave = driver.findElement(By.xpath("//button[@title='Assign Leave']"));
		assignLeave.click();
	}
}
