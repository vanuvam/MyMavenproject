package testngtests;

import org.testng.annotations.Test;

public class CreLeadng extends Projectng{
	@Test(groups = "smoke")
	public void createleadwithng(){
		
		click(locateElement("LinkText" , "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "wipro");
		type(locateElement("id", "createLeadForm_firstName"), "Deepa"); 

		type(locateElement("id", "createLeadForm_lastName"), "Vanu");

		
		click(locateElement("Name" , "submitButton"));
		
	}
}
