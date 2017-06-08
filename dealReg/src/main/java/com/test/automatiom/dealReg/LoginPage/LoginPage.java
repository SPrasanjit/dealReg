package com.test.automatiom.dealReg.LoginPage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.test.automatiom.dealReg.testBase.TestBase;

public class LoginPage extends TestBase{

	public void loginToBPPortal(WebDriver driver) throws Exception{
		
	
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 180);
		
		driver.get(prop.getProperty("BP_url"));
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 180);
		Reporter.log("BP Application is up and running");
		Reporter.log("Entering UserName..");
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id(prop
						.getProperty("BP_user_id")))).sendKeys(
				prop.getProperty("BP_username_value"));
		Reporter.log("Entering Password..");
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id(prop
						.getProperty("BP_pass_id")))).sendKeys(
				prop.getProperty("BP_password_value"));
		Reporter.log("Clickng on login..");
		driver.findElement(By.id(prop.getProperty(("BP_login_xpath"))))
				.click();
		
}
	public void loginToW3Portal(WebDriver driver) throws Exception{
		
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 180);
		driver.get(prop.getProperty("W3_task_url"));
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 180);
		Reporter.log("w3 Application is up and running");
		Reporter.log("Entering UserName..");
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id(prop
						.getProperty("W3_login_user")))).sendKeys(
				prop.getProperty("W3_username"));
		Reporter.log("Entering Password..");
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id(prop
						.getProperty("W3_login_pw")))).sendKeys(
				prop.getProperty("W3_password"));
		Reporter.log("Clickng on login..");
		driver.findElement(By.id(prop.getProperty(("W3_signin_button"))))
				.click();
		
	}

}


