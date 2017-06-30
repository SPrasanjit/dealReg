package com.test.automatiom.dealReg.BP_homePage;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.automatiom.dealReg.pageLibrary.LoginPage;



public class TC001_VerifyLoginWithDifferentRecords extends com.test.automatiom.dealReg.testBase.TestBase{


	@DataProvider(name="loginData")
	public String[][] getTestData(){
		String[][] testRecords = getData("TestData.xlsx", "LoginTestData");
		return testRecords;
	}
	

	private String[][] getData(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}


	@BeforeClass
	public void setUp() throws IOException {
     init();
     
	}

	@Test(dataProvider="loginData")
	public void verifyLoginWithDifferentRecords(String emailAddress, String loginPassword, String runMode) {
		
		if(runMode.equalsIgnoreCase("n")){
			throw new SkipException("user marked this record as no run");
		}
		try {
			System.out.println("============= Strting VerifyLoginWithDifferentRecords Test===========");
			//homepage.loginToDemoSite(emailAddress, loginPassword);
			LoginPage login = new LoginPage();
			login.loginToApplication(emailAddress, loginPassword);
			/*boolean status = login.verifyLogoutDisplay();
			 getScreenShot("loginData_"+emailAddress);
			if(status){
				login.clickOnLogout();
			}
			Assert.assertEquals(status, true);*/
			System.out.println("============= Finished VerifyLoginWithDifferentRecords Test===========");
			//getScreenShot("verifyLoginWithDifferentRecords");
		} catch (Exception e) {
			//driver.get("https://www-sso.toronto.ca.ibm.com/usrsrvc/account/userservices/ait/jsp/login.jsp?persistPage=true&page=/TFIM/sps/auth%3FFedName%3DIBM_WWW_SAML20_INTERNAL1%26FedId%3Duuid54de1d12-0140-10bd-a088-d3cdf3d6b5e6&PD-REFERER=none&error=");
			//getScreenShot("verifyLoginWithDifferentRecords");
			
		}
	}

@AfterClass
public void endTest() {
     driver.close();
//	}
}
}
