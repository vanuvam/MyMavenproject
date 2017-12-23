package testCases;

import org.junit.Test;
//import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import week1day1.ProjectMethods;
public class DupwithSE extends ProjectMethods{

	@Test
	public  void duplicateLead() throws InterruptedException {
		Login();
		click(locateElement("Linktext" , "Create Lead"));
		click(locateElement("Linktext" , "Find Leads"));
		click(locateElement("xpath", "//span[text() = 'Email']"));
		type(locateElement("Name", "emailAddress"), "a");
		click(locateElement("xpath", "//button[text() = 'Find Leads']"));
		Thread.sleep(3000);
		//click(locateElement("xpath" ,"//tr/td/div[@class = 'x-grid3-cell-inner x-grid3-col-firstName'][1]/a" ));
		//getText(locateElement("xpath" ,"//tr/td/div[@class = 'x-grid3-cell-inner x-grid3-col-firstName'][1]/a"));
		//System.out.println("The first name " +str);
		WebElement ele = locateElement("xpath" ,"//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName'][1]/a");
        String str = getText(ele);
        click(ele);
        click(locateElement("Linktext", "Duplicate Lead"));
        WebElement ele1 = locateElement("id", "sectionHeaderTitle_leads");
        getText(ele1);
            
        verifyTitle("View Lead");
        click(locateElement("class" , "smallSubmit"));
        WebElement ele2 = locateElement("id", "viewLead_firstName_sp");
        String str2 = getText(ele2);
        if(str.equals(str2))
        {
        	
        	System.out.println("The first name matches the resulting lead name");
        	
        }
        else
        {
        	System.out.println("There is no match");
        	
        }
        
        close();
        
             
        
        
        
		
	}
}
