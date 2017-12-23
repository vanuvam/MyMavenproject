package Week3Day1;


import org.junit.Test;

import week1day1.ProjectMethods;

public class EditWithSe extends ProjectMethods {

	@Test
	
	public void editLead()
	{
	Login();
		click(locateElement("LinkText","Leads"));
		click(locateElement("LinkText","Find Leads"));
		type(locateElement("xpath","(//input[@name='firstName'])[3]"),"F");
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
		/*String newName = getText(locateElement("id","viewLead_companyName_sp"));

	if(oldName .equals(newName))
	{
		System.out.println(("The company has not been updated successfully"));
	}
	else
	{
		System.out.println("The company has been updated successfully");
	}
		 */
		
	}
}
