package testngtests;

import org.testng.annotations.Test;

public class Editwithng extends Projectng {
	@Test(groups = "regression")
//@Test (dependsOnMethods = "testngtests.CreLeadng.createleadwithng")
	public void editleadwithng(){
	click(locateElement("LinkText","Leads"));
	click(locateElement("LinkText","Find Leads"));
	type(locateElement("xpath","(//input[@name='firstName'])[3]"),"a");
	click(locateElement("xpath","//button[text()='Find Leads']"));
	try {	
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	click(locateElement("xpath","(//a[@class='linktext'])[6]"));
	verifyTitle("View Lead | opentaps CRM");
	click(locateElement("xpath","(//a[@class='subMenuButton'])[3]"));
	String oldName = getText(locateElement("id","updateLeadForm_companyName"));
	System.out.println("The old company name is :" +oldName);
	type(locateElement("id","updateLeadForm_companyName"),"Accenture");
	click(locateElement("class","smallSubmit"));


	verifyPartialText(locateElement("id", "viewLead_companyName_sp"), "Accenture");
}
}
