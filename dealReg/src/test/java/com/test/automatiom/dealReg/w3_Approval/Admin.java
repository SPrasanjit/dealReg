package com.test.automatiom.dealReg.w3_Approval;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Admin {
	 @Test
	  public void Approve_Form() throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\git\\dealReg\\dealReg\\resources\\chromedriver.exe");
		    WebDriver driver1=new ChromeDriver();
		    driver1.manage().window().maximize(); 
			driver1.get("http://sit-stgpwblueweb.lexington.ibm.com:9084/DealRegW3/#Admin/Tasks/List");
			

				 Thread.sleep(30000);

				 WebDriverWait wait = new WebDriverWait(driver1,30);
				 {

					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='dijit_form_ValidationTextBox_0']")));
			 	      driver1.findElement(By.xpath(".//*[@id='dijit_form_ValidationTextBox_0']")).sendKeys("prasanjs@in.ibm.com");
			          // click on the compose button as soon as the "compose" button is visible
			 	      driver1.findElement(By.id("dijit_form_ValidationTextBox_1")).sendKeys("PRAsan5@#$");
			 		driver1.findElement(By.id("com_ibm_ciolab_core_Button_0")).click();
			 		Thread.sleep(10000);
			 		driver1.findElement(By.id("com_ibm_ciolab_dr_admin_TasksListFilter_0_solutionIdFilter")).sendKeys("L329129");
			 		driver1.findElement(By.xpath("//span/span/span[contains(text(),'Apply')]")).click(); 
			 		Thread.sleep(55000);
			 		JavascriptExecutor jse = (JavascriptExecutor)driver1;
			 		jse.executeScript("window.scrollBy(0,400)", "");
			 		Thread.sleep(10000);
			 		Actions action2 = new Actions(driver1); 
			 		action2.contextClick(driver1.findElement(By.xpath("//td[contains(text(),'Initial Review')]"))).build().perform();
			 		Thread.sleep(30000);
			 		driver1.findElement(By.xpath("//table/tbody/tr[1]/td[contains(text(),'Reassign')]")).click();
			 		Thread.sleep(25000);
			 		driver1.findElement(By.xpath("//span[contains(text(),'Select user')]/../input[@class='dijitReset dijitInputInner']")).click();
			 		Thread.sleep(3000);
			 		driver1.findElement(By.xpath("//body/div/ul/li[contains(text(),'prasanjs@in.ibm.com')]")).click();
			 		//driver1.findElement(By.xpath("//body/div/ul/li[contains(text(),'prasanjs@in.ibm.com')]"))
			 		//*driver1.findElement(By.id("//div/div[2]/div/div/div[2]/div/div/span[contains(text(),'Select user')]")).sendKeys("ssingha6@in.ibm.com");
			 		driver1.findElement(By.xpath("//span/span/span[contains(text(),'Submit')]")).click();
}
}}