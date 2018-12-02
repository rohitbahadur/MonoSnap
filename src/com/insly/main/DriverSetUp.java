package com.insly.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.insly.utils.ProjectConfig;

public class DriverSetUp {
	public static WebDriver driver;
	
	static {
		
		System.setProperty("webdriver.chrome.driver",ProjectConfig.prop.getProperty("chromePath"));
		driver = new ChromeDriver();
		driver.get(ProjectConfig.prop.getProperty("appurl"));
		driver.manage().window().maximize();
	}

}
