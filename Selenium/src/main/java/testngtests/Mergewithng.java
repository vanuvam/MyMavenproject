package testngtests;

import org.testng.annotations.Test;

public class Mergewithng extends Projectng{
	@Test(groups = "sanity")
//@Test(timeOut = 2000)

public void mergerng() throws InterruptedException{
	try {
		click(locateElement("LinkText" , "Leads")); 
		click(locateElement("LinkText" , "Merge Leads"));
		switchToWindow(1);
		type(locateElement("xpath" , "//div/input[@name  = 'id']"), "10006");
		click(locateElement("xpath" , "//td/em/button[contains(text(),'Find Leads')]"));
		Thread.sleep(5000);
		click(locateElement("xpath", "(//a[@class = 'linktext'])[1]"));
		Thread.sleep(3000);
		switchToWindow(0);
		click(locateElement("xpath" , "(//img[@alt = 'Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("xpath" , "//div/input[@name  = 'id']"), "10007");

		click(locateElement("xpath" , "//td/em/button[contains(text(),'Find Leads')]"));
		Thread.sleep(3000);
		click(locateElement("xpath" , "//a[@class = 'linktext'][1]"));
		Thread.sleep(3000);
		switchToWindow(0);

		click(locateElement("xpath", "//a[@class = 'buttonDangerous']"));
		
		acceptAlert();
		click(locateElement("Linktext" , "Find Leads"));
		
		type(locateElement("xpath" , "//div/input[@name  = 'id']"), "12413");

		click(locateElement("xpath" , "//td/em/button[contains(text(),'Find Leads')]"));

		
		verifyExactText(locateElement("xpath" , "//div[text() = 'No records to display']") , "No records to display");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
