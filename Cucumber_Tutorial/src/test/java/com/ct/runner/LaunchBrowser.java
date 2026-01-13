package com.ct.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	static WebDriver driver;
	
	public static void launchChromeBrowser()
	{
		driver=new ChromeDriver();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchChromeBrowser();
	}

}
