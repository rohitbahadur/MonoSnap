package com.insly.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.insly.main.DriverSetUp;
import com.insly.pageobject.AdminAccount;
import com.insly.pageobject.InslySignUpPage;
import com.insly.pageobject.TermsAndConditions;

public class InslySignUpTest {

	public void singupTest() {

		InslySignUpPage isp = new InslySignUpPage();

		String companyName = "Rohit" + (new Date()).getTime() + " India Pvt Ltd.";
		isp.companyNameField.sendKeys(companyName);

		isp.countryDropdown.selectByVisibleText("India");

		isp.companyAddress.click();

		isp.companyProfileDropdown.selectByVisibleText("Insurance Agency");

		isp.noOfEmplyoeeDropdown.selectByVisibleText("6-10");

		isp.describeYourselfDropdown.selectByVisibleText("I am the CEO of the company");

		//setup email
		AdminAccount admac = new AdminAccount();
		admac.workEmail.sendKeys("RohitBahadur" + (new Date()).getTime() + "@gmail.com");
		admac.accountManagerName.sendKeys("Pamela Raestu");
		admac.suggestPasswordLink.click();

		WebElement passwordField = DriverSetUp.driver.findElement(By.xpath("//*[@id=\"insly_alert\"]/b"));
		
		//storing password for future login
		String password = passwordField.getText();

		System.out.println("Password:" + password);

		WebElement okButton = DriverSetUp.driver.findElement(By.xpath("//Button[text()='OK']"));
		okButton.click();

		DriverSetUp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement phoneNumber = DriverSetUp.driver.findElement(By.id("broker_admin_phone"));
		phoneNumber.sendKeys("1234567899");

		TermsAndConditions tnc = new TermsAndConditions();

		tnc.firstTerm.click();
		tnc.secondTerm.click();
		tnc.thirdTerm.click();

		tnc.privacyPolicyLink.click();

		DriverSetUp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement privacyPolicyHeading = DriverSetUp.driver.findElement(By.xpath("//Span[text()='Privacy Policy']"));

		WebElement privacyDocLastHeading = DriverSetUp.driver
				.findElement(By.xpath("//H3[text()='XII. AMENDMENTS TO THE PRIVACY POLICY']"));
		JavascriptExecutor js = (JavascriptExecutor) DriverSetUp.driver;
		js.executeScript("arguments[0].scrollIntoView(true);", privacyDocLastHeading);
		js.executeScript("arguments[0].scrollIntoView(true);", privacyPolicyHeading);

		WebElement privacyClose = DriverSetUp.driver.findElement(By.xpath("/html/body/div[2]/div[1]/a/span"));
		privacyClose.click();

		WebElement signUpBotton = DriverSetUp.driver.findElement(By.id("submit_save"));
		signUpBotton.click();

		DriverSetUp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//close browser
		DriverSetUp.driver.quit();

	}

}
