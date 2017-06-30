package com.test.automatiom.dealReg.BP_homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.test.automatiom.dealReg.testBase.TestBase;

public class googleOpen extends TestBase{
	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	WebDriver driver ;
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\git\\dealReg\\dealReg\\resources\\chromedriver.exe");
    	//driver = new FirefoxDriver();
    	driver=new ChromeDriver();
    	/*DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome();      
    	handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
    	driver = new ChromeDriver (handlSSLErr);*/
    	driver.get("http://sit-stgpwblueweb.lexington.ibm.com:9084/DealRegW3/#Login");
       // String baseUrl = "http://sit-stgpwblueweb.lexington.ibm.com:9084/DealRegW3/#Login";
      /*  String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
       
        // exit the program explicitly
        System.exit(0);*/
    }

}

