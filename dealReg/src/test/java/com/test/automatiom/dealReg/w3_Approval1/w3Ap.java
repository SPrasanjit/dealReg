package com.test.automatiom.dealReg.w3_Approval1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class w3Ap {
  @Test
  public void Approve_Form() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\git\\dealReg\\dealReg\\resources\\chromedriver.exe");
	    WebDriver driver1=new ChromeDriver();
	    driver1.manage().window().maximize(); 
		driver1.get("http://sit-stgpwblueweb.lexington.ibm.com:9084/DealRegW3/#Login");
		

			 Thread.sleep(30000);

			 WebDriverWait wait = new WebDriverWait(driver1,30);
			 {

				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='dijit_form_ValidationTextBox_0']")));
		 	      driver1.findElement(By.xpath(".//*[@id='dijit_form_ValidationTextBox_0']")).sendKeys("prasanjs@in.ibm.com");
		          // click on the compose button as soon as the "compose" button is visible
		 	      driver1.findElement(By.id("dijit_form_ValidationTextBox_1")).sendKeys("PRAsan5@#$");
		 		driver1.findElement(By.id("com_ibm_ciolab_core_Button_0")).click(); 
			 		
			 		Thread.sleep(20000);
			 		driver1.findElement(By.linkText("Admin")).click();
					Thread.sleep(10000);
					 		driver1.findElement(By.id("com_ibm_ciolab_dr_admin_TasksListFilter_0_solutionIdFilter")).sendKeys("P329156");
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
					 		driver1.findElement(By.xpath("//body/div/ul/li[18][contains(text(),'prasanjs@in.ibm.com')]")).click();
					 		//driver1.findElement(By.xpath("//body/div/ul/li[contains(text(),'prasanjs@in.ibm.com')]"))
					 		//*driver1.findElement(By.id("//div/div[2]/div/div/div[2]/div/div/span[contains(text(),'Select user')]")).sendKeys("ssingha6@in.ibm.com");
					 		driver1.findElement(By.xpath("//span/span/span[contains(text(),'Submit')]")).click();
					 		Thread.sleep(10000);
					 		Thread.sleep(11000);
					 		JavascriptExecutor jse3 = (JavascriptExecutor) driver1;
					 	    jse3.executeScript("window.scrollBy(0,-500)", ""); 
					 	   		 	   Thread.sleep(90000); 
			 		driver1.findElement(By.linkText("Tasks")).click();
					Thread.sleep(10000);
					 		driver1.findElement(By.id("com_ibm_ciolab_dr_mytasks_ListFilter_0_request_Id")).sendKeys("P329156");
					 		Thread.sleep(17000);
					 		driver1.findElement(By.xpath("//span/span[@role='button']/span[3][contains(text(),'Apply')]")).click();
					 		Thread.sleep(25000);
					 		((JavascriptExecutor) driver1).executeScript("scroll(0,450)");
					 		Actions action = new Actions(driver1); 
					 		action.contextClick(driver1.findElement(By.xpath("//td[contains(text(),'Initial Review')]"))).build().perform();
					 		Thread.sleep(10000);
					 		//driver1.findElement(By.xpath("//td[contains(text(),'Claim')]")).click();
					 		 //driver1.findElement(By.xpath("//span[contains(text(),'Submit')]/../span[3]")).click();
					 		Thread.sleep(10000);
					 		Thread.sleep(9000);
					 		action.contextClick(driver1.findElement(By.xpath("//td[contains(text(),'Initial Review')]"))).build().perform();
					 		Thread.sleep(9000);
					 		driver1.findElement(By.xpath("//td[@colspan='2'][contains(text(),'Review')]")).click();
					 		Thread.sleep(25000);
					 		
					 		
					 		driver1.findElement(By.xpath("//label[contains(text(),'Customer name')]/../../div[2]/div/input")).click();
					 		 Thread.sleep(5000);
					 		driver1.findElement(By.xpath("//label[contains(text(),'Customer name')]/../../div[2]/div/input")).sendKeys("Power brand end user");
					 		
					 		 driver1.findElement(By.xpath("//span/span[3][contains(text(),'Search')]")).click();
					 		Thread.sleep(11000);
					 		driver1.findElement(By.xpath("//td[contains(text(),'Power brand end user')]")).click();
					 		Thread.sleep(5000);
					 		driver1.findElement(By.xpath("//span[3][contains(text(),'Select')]")).click();
					 		
					 		((JavascriptExecutor)driver1).executeScript(("document.getElementById('com_ibm_ciolab_core_Button_7_label').scrollIntoView(true);"));
					 		Thread.sleep(5000);
					 		driver1.findElement(By.xpath("//div[@class='dijitBorderContainer dijitContainer']/span/span/span/span[contains(text(),'Continue')]")).click();
					 		
					 		Thread.sleep(15000);
					 		
					 		((JavascriptExecutor)driver1).executeScript(("document.getElementById('com_ibm_ciolab_core_Button_7_label').scrollIntoView(true);"));
					 		Thread.sleep(5000);
					 		driver1.findElement(By.xpath("//div[@class='dijitBorderContainer dijitContainer']/span/span/span/span[contains(text(),'Continue')]")).click();
					 		Thread.sleep(35000); 
					
					((JavascriptExecutor)driver1).executeScript(("document.getElementById('com_ibm_ciolab_core_Button_7_label').scrollIntoView(true);"));
			 		Thread.sleep(15000);
			 		driver1.findElement(By.xpath("//div[@class='dijitBorderContainer dijitContainer']/span/span/span/span[contains(text(),'Continue')]")).click();
			 		
			 		Thread.sleep(95000);
			 	
			 		JavascriptExecutor je = (JavascriptExecutor)driver1;
			 		je.executeScript("window.scrollBy(0,-250)", "");
			 		
					driver1.findElement(By.xpath("//div/fieldset/div[1]/label[contains(text(),'Approve')]")).click();
			 		Thread.sleep(5000);
			 		driver1.findElement(By.xpath("//span[3][contains(text(),'Auto-generate')]")).click();
			 		driver1.findElement(By.xpath("//a[@id='commentsLabel']")).click();
			 		driver1.findElement(By.xpath("//div/div[2][@class='dijitEditorIFrameContainer']/iframe"));
			 		
			 		
			 		Thread.sleep(9000);
			 		driver1.switchTo().frame((WebElement)driver1.findElement(By.xpath("//div/div[2][@class='dijitEditorIFrameContainer']/iframe")));
			 		Thread.sleep(19000);
			 		driver1.findElement(By.cssSelector("#dijitEditorBody")).sendKeys("testing"); 
			 		driver1.switchTo().defaultContent();
			 		((JavascriptExecutor)driver1).executeScript(("document.getElementById('com_ibm_ciolab_core_Button_7_label').scrollIntoView(true);"));
			 		Thread.sleep(5000);
			 		driver1.findElement(By.xpath("//div[@class='dijitBorderContainer dijitContainer']/span[2]/span/span/span[contains(text(),'Continue')]")).click();
			 		Thread.sleep(25000);
			 		JavascriptExecutor jse1 = (JavascriptExecutor)driver1;
			 		jse1.executeScript("window.scrollBy(0,550)", "");
			 		Thread.sleep(25000);
			 		driver1.findElement(By.xpath("//div[@class='dijitBorderContainer dijitContainer']/span[2]/span/span/span[contains(text(),'Submit')]")).click();
			 		
			 		System.out.println("Reddy to Susccessful");
			 		System.out.println("YOUR REGISTRATION IS SUCCESSFULLY SUBMITTED");
			 		Thread.sleep(10000);
			 	driver1.quit();
			 }
  }
}
					 		
					 		
					 		
			