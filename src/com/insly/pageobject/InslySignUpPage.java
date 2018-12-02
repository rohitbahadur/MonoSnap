package com.insly.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.insly.main.DriverSetUp;

public class InslySignUpPage {

	// Company
	public WebElement sinUpTitle = DriverSetUp.driver.findElement(By.xpath("//h1[text()='Sign up and start using']"));
	public WebElement companyNameField = DriverSetUp.driver.findElement(By.id("broker_name"));
	
	public WebElement countryField = DriverSetUp.driver.findElement(By.id("broker_address_country"));
	public Select countryDropdown = new Select(countryField);
	
	public WebElement companyAddress = DriverSetUp.driver.findElement(By.id("broker_tag"));
	
	public WebElement companyProfile = DriverSetUp.driver.findElement(By.id("prop_company_profile"));
	public Select companyProfileDropdown = new Select(companyProfile);
	
	public WebElement noOfEmplyoee = DriverSetUp.driver.findElement(By.id("prop_company_no_employees"));
	public Select noOfEmplyoeeDropdown = new Select(noOfEmplyoee);
	
	public WebElement describeYourself = DriverSetUp.driver.findElement(By.id("prop_company_person_description"));
	public Select describeYourselfDropdown = new Select(describeYourself);
	
	
			
	
	
	
	
		
}



