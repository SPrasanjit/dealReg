package com.test.automatiom.dealReg.pageLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.log4testng.Logger;

import com.test.automatiom.dealReg.testBase.TestBase;

public class LoginPage extends TestBase{
	/*WebElement logout;
    WebDriverWait wait;
	public static final Logger log = Logger.getLogger(LoginPage.class);*/
	
	public void loginToBPPortal(WebDriver driver) throws Exception{
		
	
		driver.get(prop.getProperty("BP_url"));
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 180);
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
		
	
		driver.get(prop.getProperty("W3_task_url"));
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 180);
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
	
	public void loginToApplication(String userName, String password) throws Exception{
	
		WebDriverWait wait = new WebDriverWait(driver, 180);
		driver.get(prop.getProperty("BP_url1"));
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 180);
		Reporter.log("BP Application is up and running");
		Reporter.log("Entering UserName..");
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id(prop
						.getProperty("BP_user_id")))).sendKeys(userName);
		Reporter.log("Entering Password..");
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id(prop
						.getProperty("BP_pass_id")))).sendKeys(password);
		Reporter.log("Clickng on login..");
		driver.findElement(By.id(prop.getProperty(("BP_login_xpath"))))
				.click();
		//driverwait(60);
		Thread.sleep(10000);
	}
	/*public boolean verifyLogoutDisplay(){
		try {
			waitForElement(driver, 300, logout);
			logout=driver.findElement(By.id(prop.getProperty(("W3_signin_button"))));
	        logout.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
}*/
	
	/*public void clickOnLogout() {
		   logout.click();
	}*/
	public void clickOnNavigationTab(String tabName){
		//driver.findElement(By.xpath("//button[contains(text(),'"+tabName+"') and @aria-expanded='false']")).click();
		//log("clicked on:-"+menuName+" navigation menu");
	}
	
	public void clickOnSubTabInTabsSection(String subTab){
		
		//waitForElement(driver, 80, driver.findElement(By.xpath(".//button[contains(text(),'Mens') and @aria-expanded='true']/following-sibling::ul/child::li/child::a[contains(text(),'"+subTab+"')]")));
		//driver.findElement(By.xpath(".//button[contains(text(),'Mens') and @aria-expanded='true']/following-sibling::ul/child::li/child::a[contains(text(),'"+subTab+"')]")).click();
		//log("clicked on:-"+product);
	}
	public void switchToFrame(String homePageIframe){
		driver.switchTo().frame(homePageIframe);
		//log("switched to the iframe");
	}
	
	public void switchToDefaultContent(){
		driver.switchTo().defaultContent();
		//log("switched to the default Content");
	}
	}


