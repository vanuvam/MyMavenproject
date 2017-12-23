package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeads;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004";
		testCaseName = "TC004_DeleteLead";
		testDescription = "To delete the first resulting lead";
		category= "Smoke";
		authors	="Deepa";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void DeleteLeads(String userName, String passWord ,String phonenum,
			String expectederrmsg)
			 {
		
		FindLeads flp =  new LoginPage(driver, test)
						
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMLink()
		.clickLeadLink() 
		.findleadstabclick()
		.clickphoneno()
		.eleenterphonenumber(phonenum)
		.elefindleadsbtn();
	
		String firstreslead = flp.elergetfirstleadid();
		
		flp.eleclickresfirstleadId();
		flp.clickdelete();
		flp.findleadstabclick();
		flp.enterresleadid(firstreslead);
		flp.elefindleadsbtn();
			
		flp.verifyerrormessageafterdelete(expectederrmsg); 

	}

}
