package com.insly.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.insly.main.DriverSetUp;

public class TermsAndConditions {
	//Terms and conditions
		public WebElement firstTerm = DriverSetUp.driver.findElement(By.xpath("//*[@id=\"field_terms\"]/td[2]/div/div/label[1]/span"));	
		public WebElement secondTerm = DriverSetUp.driver.findElement(By.xpath("//*[@id=\"field_terms\"]/td[2]/div/div/label[2]/span"));	
		public WebElement thirdTerm = DriverSetUp.driver.findElement(By.xpath("//*[@id=\"field_terms\"]/td[2]/div/div/label[3]/span"));	
		public WebElement privacyPolicyLink = DriverSetUp.driver.findElement(By.linkText("privacy policy"));
}
