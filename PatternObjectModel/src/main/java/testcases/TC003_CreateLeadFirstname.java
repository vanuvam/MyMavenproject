package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLeadFirstname extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_CreateLeadFirstname";
		testDescription = "To Create lead with mandatory fields";
		category= "Smoke";
		authors	="Deepa";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void CreateLeadFirstName(String userName, String passWord , String companyname , String firstname, String lastname , String sourceid,
			String democampaign, String expectedfirstname  ) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMLink()
		.clickCreateLeadLink()
		.enterCompanyName(companyname)
		.eleFirstName(firstname)
		.eleLastName(lastname)
		.eleSourceIdDropdown(sourceid)
		.elemarcampaigndropdown(democampaign)
		.clickSubmit()
	    .verifyFirstName(expectedfirstname);

				 
//		.clickLogout();
		
		
		
		
		
		
		
	}

}
