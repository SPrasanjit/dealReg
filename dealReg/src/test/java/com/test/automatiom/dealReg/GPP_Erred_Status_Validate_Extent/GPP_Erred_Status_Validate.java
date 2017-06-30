package com.test.automatiom.dealReg.GPP_Erred_Status_Validate_Extent;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.test.automatiom.dealReg.pageLibrary.LoginPage;
import com.test.automatiom.dealReg.testBase.TestBase;

public class GPP_Erred_Status_Validate extends TestBase{
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void startReport() {
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/MyOwnReport.html",true);
		//extent = new ExtentReports("C:\\Users\\IBM_ADMIN\\Desktop\\Maven_project-master\\Maven_project-master\\test-output\\MyOwnReport.html",true);
		extent.addSystemInfo("HostName", "Prasanjit")
				.addSystemInfo("Environment", "QA")
				.addSystemInfo("User Name", "Prasanjit Sahoo");
		extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
		//extent.loadConfig(new File("C:\\Users\\IBM_ADMIN\\Desktop\\Maven_project-master\\Maven_project-master\\extent-config.xml"));

	}

	@Test
	public void GPP_Erred() throws Exception {

		test = extent.startTest("Verify Erred GPP Status");

		test.log(LogStatus.INFO, "Browser is up and running");
		/*selectBrowser("chrome");
		LoadProperty abc = new LoadProperty();
		Properties prop = abc.obj_rep();*/
        init();
        driverwait(10);
		test.log(LogStatus.INFO, "Application is up and running and login");
		LoginPage obj1 = new LoginPage();
		obj1.loginToW3Portal(driver);
		driverwait(30);
		clickWhenReady(By.xpath(prop.getProperty("W3_Support_link")), 30);
		test.log(LogStatus.INFO, "Clicked on Support Tab");

		clickWhenReady(By.xpath(prop.getProperty("W3_GPP_link")), 30);
		test.log(LogStatus.INFO, "Clicked on GPP Link");
		clickWhenReady(
				By.xpath("//label[text()='GPP Status:']/following::td[1]"), 30);
		test.log(LogStatus.INFO, "Clicked on GPP Status Dropdown");
		driverwait(10);

		java.util.List<WebElement> GPP_Status = driver
				.findElements(By
						.xpath("html/body/div[1]/div[2]/div[3]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div[1]/div/div/div"));
		test.log(LogStatus.INFO, "GPP Status options Captured");
		int total_node = GPP_Status.size();

		for (int i = 0; i < total_node; i++) {
			// System.out.println(element1.get(i).getText());

			String text = GPP_Status.get(i).getText();
			System.out.println(text);

			GPP_Status.get(1).click();

		}
		test.log(LogStatus.PASS, "Clicked on Erred Option in GPP Status DD");
		Thread.sleep(5000);
		driver.findElement(
				By.xpath(".//*[@id='com_ibm_ciolab_dr_support_GppFilter_0']/div[9]/span[1]/span//span[3]"))
				.click();
		Thread.sleep(3000);

		java.util.List<WebElement> Table_row = driver.findElements(By
				.xpath(".//*[@id='com_ibm_ciolab_dr_support_GppGrid_0']//tr"));
		if (Table_row != null) {
			Assert.assertTrue(true);
			int row_count = Table_row.size();

			System.out.println(row_count - 1);
			test.log(LogStatus.PASS, "Erred Records Counted");

		}

	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getThrowable());
		}
		extent.endTest(test);

	}

	@AfterTest
	public void endReport() {
		extent.flush();
		extent.close();
	}

}

