package week1day1;

import org.openqa.selenium.WebElement;
import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods {

	public void Login(){
		
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");		
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("LinkText" , "CRM/SFA"));
	}

	public void close()
		{
			closeBrowser(); 
		}
		
	}

