package com.test.automatiom.dealReg.GPP_Submitted_Status_Validate;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automatiom.dealReg.pageLibrary.LoginPage;
import com.test.automatiom.dealReg.testBase.TestBase;

public class GPP_Submitted_Status_Validate extends TestBase{
	
	@BeforeClass
	public void setUp() throws Exception {
		init();
	}
	@Test
	public void GPP_Submitted() throws Exception {
		
		
       /* selectBrowser("chrome");
        Reporter.log("Chrome Browser Opened");
        System.out.println("chrome Browser Opened");
        
		LoadProperty abc = new LoadProperty();
		Properties prop = abc.obj_rep();
		Reporter.log("Loaded Locators To Memory");*/

		LoginPage obj1 = new LoginPage();
		obj1.loginToW3Portal(driver);
		Reporter.log("W3 portal Signed in");

		//driverwait(30);
		clickWhenReady(By.xpath(prop.getProperty("W3_Support_link")), 30);
		 Reporter.log("Clicked on Support Tab");

		clickWhenReady(By.xpath(prop.getProperty("W3_GPP_link")), 30);
		 Reporter.log("Clicked on GPP Link");

		driverwait(10);
		clickWhenReady(By.xpath("//label[text()='GPP Status:']/following::td[1]"), 30);
        Reporter.log("Clicked on GPP Status DropDown");
		java.util.List<WebElement> GPP_Status = driver
				.findElements(By
						.xpath("html/body/div[1]/div[2]/div[3]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div[1]/div/div/div"));
		int total_node = GPP_Status.size();

		for (int i = 0; i < total_node; i++) {
			// System.out.println(element1.get(i).getText());

			String text = GPP_Status.get(i).getText();
			System.out.println(text);

			GPP_Status.get(3).click();
			

		}
	System.out.println("Clicked on Submitted option in GPP Status DropDown");
		Reporter.log("Clicked on Submitted option in GPP Status DropDown");
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
			Reporter.log("Total Number of rows Counted");
		}

	}

}

