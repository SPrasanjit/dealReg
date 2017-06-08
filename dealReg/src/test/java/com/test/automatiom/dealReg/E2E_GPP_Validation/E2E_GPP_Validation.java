package com.test.automatiom.dealReg.E2E_GPP_Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automatiom.dealReg.testBase.TestBase;
import com.test.automatiom.dealReg.utills.Utills;
import com.test.automatiom.dealReg.w3_Approval.W3_Approve;

public class E2E_GPP_Validation extends TestBase{
	@BeforeClass
	public void setUp() throws Exception {
		init();
	}

	@Test
	public void GPP_Validate() throws Exception {
		try {
		
		String s =new W3_Approve().Approve_Form();
		
		driverwait(30);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-600)", "");
		driverwait(30);
		clickWhenReady(By.xpath(prop.getProperty("W3_Support_link")), 30);
		Reporter.log("Clicked on Support Tab");

		clickWhenReady(By.xpath(prop.getProperty("W3_GPP_link")), 30);
		Reporter.log("Clicked on GPP Link");

		driverwait(10);
		clickWhenReady(
				By.xpath("//label[text()='GPP Status:']/following::td[1]"), 30);
		Reporter.log("Clicked on GPP Status DropDown");
		java.util.List<WebElement> GPP_Status = driver
				.findElements(By
						.xpath("html/body/div[1]/div[2]/div[3]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div[1]/div/div/div"));
		int total_node = GPP_Status.size();

		for (int i = 0; i < total_node; i++) {
			// System.out.println(element1.get(i).getText());

			String text = GPP_Status.get(i).getText();
			System.out.println(text);

			GPP_Status.get(2).click();

		}
		System.out.println("Clicked on Pending option in GPP Status DropDown");
		Reporter.log("Clicked on Pending option in GPP Status DropDown");
		System.out.println("waiting for 15 min.......");
		driverwait(900);
		sendkeysWhenReady(By.xpath(".//*[@id='com_ibm_ciolab_dr_support_GppFilter_0_solutionIdFilter']"), s, 30);
		driverwait(15);
		driver.findElement(
				By.xpath(".//*[@id='com_ibm_ciolab_dr_support_GppFilter_0']/div[9]/span[1]/span//span[3]"))
				.click();
	
		Reporter.log("Clicked on Save button");
		Thread.sleep(3000);

		java.util.List<WebElement> Table_row = driver.findElements(By
				.xpath(".//*[@id='com_ibm_ciolab_dr_support_GppGrid_0']//tr"));
		if (Table_row != null) {
			Assert.assertTrue(true);
			int row_count = Table_row.size();

			System.out.println(row_count - 1);
			Reporter.log("Total Number of Rows counted");
			driverwait(10);
		}
		} catch (Exception e) {
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
		
	/*@AfterClass
	public void tearDown() {
		closeBrowser();
		Reporter.log("Browser Closed");
	}*/

}

