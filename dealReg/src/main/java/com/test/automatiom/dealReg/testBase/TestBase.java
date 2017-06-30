package com.test.automatiom.dealReg.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

import com.test.automatiom.dealReg.testUtills.Utills;



	public class TestBase extends Utills{
		
		public static Properties prop = new Properties();
		public File f;
		public FileInputStream FI;
		//public Xls_Reader Data;
		
		
		
		public void init() throws IOException{
			Reporter.log("Loading Properties into memory");
			loadPropertiesFile();
		    Reporter.log("Browser is up and running");
			selectBrowser("chrome");
			impliciteWait(30);
			
		}
		
		
		public  void loadPropertiesFile() throws IOException {
			//C:\Workspace_Prasanjit005\Deal_Reg_seleniumProject\src\com\delReg1\pageLocators\BP_Temp.properties
			f = new File(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\test\\automatiom\\dealReg\\Property_Files\\BP_Temp.properties");
			FI = new FileInputStream(f);
			prop.load(FI);
			//C:\Workspace_Prasanjit005\dealReg\src\main\java\com\test\automatiom\dealReg\Property_Files\BP_Temp.properties
			f = new File(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\test\\automatiom\\dealReg\\Property_Files\\W3_Approve.properties");
			FI = new FileInputStream(f);
			prop.load(FI);
			

		}
		
		public void closeBrowser(){
			driver.quit();
			Reporter.log("Browser Closed");
			
		}
}