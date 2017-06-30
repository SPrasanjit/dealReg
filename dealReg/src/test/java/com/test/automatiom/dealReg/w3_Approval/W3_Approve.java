package com.test.automatiom.dealReg.w3_Approval;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automatiom.dealReg.BP_Temp_Submission.BP_Temp_Submission;
import com.test.automatiom.dealReg.pageLibrary.LoginPage;
import com.test.automatiom.dealReg.testBase.TestBase;
import com.test.automatiom.dealReg.testUtills.Utills;

import freemarker.core.ReturnInstruction.Return;

public class W3_Approve extends TestBase {

	@BeforeClass
	public void setUp() throws Exception {
		init();
	}

	@Test
	public String Approve_Form() throws Exception {
		try {
			
			String regno = new BP_Temp_Submission().BPTemp_SubmissionID();
			System.out.println(" Registration No. from function call==="
					+ regno);
			driverwait(10);

			String s = "P" + regno;
			driverwait(10);
			Reporter.log("W3 Application is up and running");	
			LoginPage login = new LoginPage();
			login.loginToW3Portal(driver);
			driverwait(10);

			WebDriverWait wait = new WebDriverWait(driver, 30);
			{

				driver.findElement(By.linkText("Admin")).click();
				driverwait(30);
				 		driver.findElement(By.id("com_ibm_ciolab_dr_admin_TasksListFilter_0_solutionIdFilter")).sendKeys(s);
				 		System.out.println("waiting for 15 min.......");
				 		driverwait(1000);
				 		driver.findElement(By.cssSelector(".dijitReset.dijitInline.dijitButtonNode")).click(); 
				 		driverwait(30);
				 		JavascriptExecutor jse = (JavascriptExecutor)driver;
				 		jse.executeScript("window.scrollBy(0,400)", "");
				 		driverwait(30);
				 		Actions action = new Actions(driver); 
				 		action.contextClick(driver.findElement(By.xpath("//td[contains(text(),'Initial Review')]"))).build().perform();
				 		driverwait(15);
				 		driver.findElement(By.xpath("//table/tbody/tr[1]/td[contains(text(),'Reassign')]")).click();
				 		driverwait(15);
				 		driver.findElement(By.xpath("//span[contains(text(),'Select user')]/../input[@class='dijitReset dijitInputInner']")).click();
				 		driverwait(15);
				 		//driver.findElement(By.xpath(".//*[@id='dijit_form_FilteringSelect_1']")).sendKeys("prasanjs@in.ibm.com");
				 		driver.findElement(By.xpath("//body/div/ul/li[18][contains(text(),'prasanjs@in.ibm.com')]")).click();
				 		//*driver1.findElement(By.id("//div/div[2]/div/div/div[2]/div/div/span[contains(text(),'Select user')]")).sendKeys("ssingha6@in.ibm.com");
				 		driver.findElement(By.xpath("//span/span/span[contains(text(),'Submit')]")).click();
				 		Thread.sleep(19000);
				 		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
				 	    jse3.executeScript("window.scrollBy(0,-400)", "");
		 		driver.findElement(By.linkText("Tasks")).click();
				Thread.sleep(10000);
				 		driver.findElement(By.id("com_ibm_ciolab_dr_mytasks_ListFilter_0_request_Id")).sendKeys(s);
				 		Thread.sleep(7000);
				 		driver.findElement(By.xpath("//span/span/span[contains(text(),'Apply')]"
				 				+ "")).click();
				 		Thread.sleep(15000);
				 		((JavascriptExecutor) driver).executeScript("scroll(0,450)");
				 		Actions action1 = new Actions(driver); 
				 		action1.contextClick(driver.findElement(By.xpath("//td[contains(text(),'Initial Review')]"))).build().perform();
				 		Thread.sleep(10000);
				 		//* driver1.findElement(By.xpath("//td[contains(text(),'Claim')]")).click();
				 		//* driver1.findElement(By.xpath("//span[contains(text(),'Submit')]/../span[3]")).click();
				 		Thread.sleep(9000);
				 		action.contextClick(driver.findElement(By.xpath("//td[contains(text(),'Initial Review')]"))).build().perform();
				 		Thread.sleep(9000);
				 		driver.findElement(By.xpath("//td[@colspan='2'][contains(text(),'Review')]")).click();
				 		Thread.sleep(25000);






				 		 driver.findElement(By.xpath("//label[contains(text(),'Customer name')]/../../div[2]/div/input")).click();
				 		 Thread.sleep(5000);
				 		 driver.findElement(By.xpath("//label[contains(text(),'Customer name')]/../../div[2]/div/input")).sendKeys("Power brand end user");

				 		 driver.findElement(By.xpath("//span/span[3][contains(text(),'Search')]")).click();
				 		Thread.sleep(11000);
				 		driver.findElement(By.xpath("//td[contains(text(),'Power brand end user')]")).click();
				 		Thread.sleep(5000);
				 		driver.findElement(By.xpath("//span[3][contains(text(),'Select')]")).click(); 

				 		((JavascriptExecutor)driver).executeScript(("document.getElementById('com_ibm_ciolab_core_Button_7_label').scrollIntoView(true);"));
				 		Thread.sleep(5000);
				 		driver.findElement(By.xpath("//div[@class='dijitBorderContainer dijitContainer']/span[2]/span/span/span[contains(text(),'Continue')]")).click();

				 		Thread.sleep(15000);

				 		((JavascriptExecutor)driver).executeScript(("document.getElementById('com_ibm_ciolab_core_Button_7_label').scrollIntoView(true);"));
				 		Thread.sleep(5000);
				 		driver.findElement(By.xpath("//div[@class='dijitBorderContainer dijitContainer']/span[2]/span/span/span[contains(text(),'Continue')]")).click();
				 		Thread.sleep(35000); 

				((JavascriptExecutor)driver).executeScript(("document.getElementById('com_ibm_ciolab_core_Button_7_label').scrollIntoView(true);"));
		 		Thread.sleep(5000);
		 		//driver.findElement(By.xpath("html/body/div[1]/div[2]/div[3]/div/div/div[1]/div[1]/div/div/div/div/div[4]/div[7]/span[2]/span/span/span[3]")).click();
		 		driver.findElement(By.xpath("//div[@class='dijitBorderContainer dijitContainer']/span/span/span/span[contains(text(),'Continue')]")).click();

		 		Thread.sleep(25000);
				driver.findElement(By.xpath("//div/fieldset/div[1]/label[contains(text(),'Approve')]")).click();
		 		Thread.sleep(5000);
		 		driver.findElement(By.xpath("//span[3][contains(text(),'Auto-generate')]")).click();
		 		driver.findElement(By.xpath("//a[@id='commentsLabel']")).click();
		 		driver.findElement(By.xpath("//div/div[2][@class='dijitEditorIFrameContainer']/iframe"));


		 		Thread.sleep(9000);
		 		driver.switchTo().frame((WebElement)driver.findElement(By.xpath("//div/div[2][@class='dijitEditorIFrameContainer']/iframe")));
		 		Thread.sleep(19000);
		 		driver.findElement(By.cssSelector("#dijitEditorBody")).sendKeys("testing"); 
		 		driver.switchTo().defaultContent();
		 		((JavascriptExecutor)driver).executeScript(("document.getElementById('com_ibm_ciolab_core_Button_7_label').scrollIntoView(true);"));
		 		Thread.sleep(5000);
		 		driver.findElement(By.xpath("//div[@class='dijitBorderContainer dijitContainer']/span[2]/span/span/span[contains(text(),'Continue')]")).click();
		 		Thread.sleep(25000);
		 		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		 		jse2.executeScript("window.scrollBy(0,550)", "");
		 		Thread.sleep(25000);
		 		driver.findElement(By.xpath("//div[@class='dijitBorderContainer dijitContainer']/span[2]/span/span/span[contains(text(),'Submit')]")).click();


		 		System.out.println("YOUR REGISTRATION IS SUCCESSFULLY SUBMITTED");
		 		Reporter.log("YOUR REGISTRATION IS SUCCESSFULLY SUBMITTED");
		 		Thread.sleep(10000);
		 		return s;

			}
		} catch (Exception e) {
			throw e;
		}
		
	}

	@AfterMethod
	public void attachScreenshot(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {
			Utills.captureScreenshotOnTestFailure(driver, "GPP_Pending");
			// Utills.sendEmailOnTestFailure();
		}
	}}
/*
	@AfterClass
	public void tearDown() {
		closeBrowser();

	}*/
