package Week3Day1;

import org.junit.Test;
import week1day1.ProjectMethods;

public class DeletewithSe extends ProjectMethods{

	@Test
	
	public void deleteLead() throws InterruptedException
	{
		String leadId=null;
		Login();
		click(locateElement("LinkText","Leads"));
		click(locateElement("LinkText","Find Leads"));
		click(locateElement("xpath","//span[text()='Phone']"));
		type(locateElement("Name" , "phoneCountryCode"),"91");
		/*type(locateElement("Name","phoneAreaCode"),"044");
		type(locateElement("Name","phoneNumber"),"23");*/
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(3000);
		
		leadId = getText(locateElement("xpath","(//a[@class='linktext'])[4]"));
		click(locateElement("xpath","(//a[@class='linktext'])[6]"));
		click(locateElement("xpath","//a[text()='Delete']"));
		click(locateElement("LinkText","Find Leads"));
		type(locateElement("xpath","//input[@name='id']"),leadId);
		click(locateElement("xpath","//button[text()='Find Leads']"));
		verifyExactText(locateElement("xpath" , "//div[text() = 'No records to display']") , "No records to display");
		close();	
	}
}
