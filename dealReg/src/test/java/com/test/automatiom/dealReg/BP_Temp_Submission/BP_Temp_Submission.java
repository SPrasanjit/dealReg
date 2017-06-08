package com.test.automatiom.dealReg.BP_Temp_Submission;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.test.automatiom.dealReg.LoginPage.LoginPage;
import com.test.automatiom.dealReg.testBase.TestBase;
import com.test.automatiom.dealReg.utills.Utills;

import freemarker.core.ReturnInstruction.Return;

public class BP_Temp_Submission extends TestBase{

	@BeforeTest
	public void setUp() throws Exception {
		init();
		
	}

	@Test
	public String BPTemp_SubmissionID() throws Exception {

	try {
	
	    //new BP_LoginPage().loginToBPPortal(driver);
		
			
		LoginPage obj1 = new LoginPage();
		obj1.loginToBPPortal(driver);
		driverwait(60);

		WebDriverWait wait=new WebDriverWait(driver, 180);
		driverwait(10);
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id(prop
						.getProperty("BP_Reg_TEmp_id")))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("BP_Temp"))).click();

		Actions a = new Actions(driver);
		a.contextClick(
				driver.findElement(By.xpath(prop.getProperty("BP_Temp"))))
				.build().perform();
		driver.findElement(By.xpath(prop.getProperty("BP_copy_create")))
				.click();
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath(prop
				.getProperty("BP_Select_Storage")));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath(prop.getProperty("BP_Select_Linux")))
				.click();

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_LeadBrand_Opty_DD")))).click();
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_LeadBrand_Opty_Select")))).click();
        driverwait(5);
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("Storage_Click")))).click();
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("Linux_Click")))).click();
		Thread.sleep(3000);
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Distributor_Name_DD")))).click();
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Distributor_Name_Select")))).click();
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Additional_optyInfo")))).click();

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Hardware_Activity_DD")))).click();
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Hardware_Activity_Select")))).click();

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_MachineType_Xpath")))).sendKeys(
				prop.getProperty("BP_MachineType"));
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Current_Bbus_App_xpath")))).sendKeys(
				prop.getProperty("BP_Current_Bbus_App"));
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Installation_Date_Xpath")))).click();
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Installation_Date_Xpath")))).click();
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Installation_Date_Xpath")))).sendKeys(
				prop.getProperty("BP_Installation_Date"));

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Storage_EST_Price_xpath")))).sendKeys(
				prop.getProperty("BP_Storage_EST_Price"));
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Storage_End_UserPrice_xpath"))))
				.sendKeys(prop.getProperty("BP_Storage_End_UserPrice"));

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Storage_Portion_xpath")))).click();
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Storage_Portion")))).click();

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_LinuxONE_DistName1_DD")))).click();
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_LinuxONE_DistName1_Select")))).click();

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Hardware_Activity1_DD")))).click();
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Hardware_Activity1_Select")))).click();

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_linuxONE_mac_type_serial_xpath"))))
				.sendKeys(prop.getProperty("BP_linuxONE_mac_type_serial"));

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_OS_purposed1_xpath")))).sendKeys(
				prop.getProperty("BP_OS_purposed1"));
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Hardware_Solution1_xpath"))))
				.sendKeys(prop.getProperty("BP_Hardware_Solution1"));

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Installation_Date1_Xpath")))).click();
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Installation_Date1_Xpath")))).click();

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Installation_Date1_Xpath"))))
				.sendKeys(prop.getProperty("BP_Installation_Date1"));

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Linux_Est_Price1_xpath")))).sendKeys(
				prop.getProperty("BP_Linux_Est_Price1"));
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_linuxONE_est_end_user_price1_xpath"))))
				.sendKeys(prop.getProperty("BP_linuxONE_est_end_user_price1"));

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_linuxONE_exculsive1_DD")))).click();
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_linuxONE_exculsive1_Select"))))
				.click();

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(prop
						.getProperty("BP_Submit")))).click();

		String str = driver.findElement(
				By.xpath(".//*[@id='ibm-content-main']/div/div[1]/p[2] "))
				.getText(); // taking the submission id
	    Reporter.log("BP Template submitted successfully");
		String RegNo = str.replaceAll("[^0-9]", "");
		 System.out.println(str);
		 Reporter.log("extracting the submission id from the entire text");
		  // extracting the submission id from the entire text
		return RegNo;
		
	   }catch (Exception e) {
		   throw e;
	   }
	
}
		
@AfterMethod

	public void attachScreenshot(ITestResult result)
	{
	 
	if(ITestResult.FAILURE==result.getStatus()){
	Utills.captureScreenshotOnTestFailure(driver, "GPP_ScreenShot");
	//Utills.sendEmailOnTestFailure();
}
	}
	
@AfterClass
public void tearDown() {
	closeBrowser();
	Reporter.log("Browser Closed");
}
}
		
		
		
 	/* }catch(Exception e){
	  //TakesScreenshot driver= new FirefoxDriver();
	  File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
	  
	  FileUtils.copyFile(file1, new File(System.getProperty("user.dir")+"/screenshots/error_screenshot.png")); 
	 
		throw e;
		}
	}
}*/

