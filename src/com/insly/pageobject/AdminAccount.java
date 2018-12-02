package com.insly.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.insly.main.DriverSetUp;

public class AdminAccount {
	
	//Administrator account details
		public WebElement workEmail = DriverSetUp.driver.findElement(By.id("broker_admin_email"));
		public WebElement accountManagerName = DriverSetUp.driver.findElement(By.id("broker_admin_name"));
		public WebElement suggestPasswordLink = DriverSetUp.driver.findElement(By.linkText("suggest a secure password"));
				

}
