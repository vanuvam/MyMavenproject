package week1day1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DuplicateLeads {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
		ChromeDriver driver= new ChromeDriver();
		
		//load the url
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		driver.manage().window().maximize();
					
		//getting the user name and password
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
	    //login
		driver.findElementByClassName("decorativeSubmit").click();
        //crms/fa link 
		driver.findElementByLinkText("CRM/SFA").click();
		
		// click create lead
		
				driver.findElementByLinkText("Create Lead").click();
		
	     // click Find leads
				
				driver.findElementByLinkText("Find Leads").click();
				
		//click on email
				
				driver.findElementByXPath("//span[text() = 'Email']").click();
				
				//enter email address
				
                driver.findElementByName("emailAddress").sendKeys("svr@gmail.com");
                
                //Click on button find leads
                
                driver.findElementByXPath("//button[text() = 'Find Leads']").click();
                
                try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
               
                
                //select first name link
                
                               
                WebElement name1 = driver.findElementByXPath("//tr/td/div[@class = 'x-grid3-cell-inner x-grid3-col-firstName'][1]/a");
                
                String str1 = name1.getText();
                
                name1.click();
                
                System.out.println("The first name is " + str1);
                                
                                                              
                //Click duplicate lead button
                driver.findElementByLinkText("Duplicate Lead").click();
                
                //check for Title Duplicate leads 
                String str3 = driver.findElementById("sectionHeaderTitle_leads").getText();
                
                             
                System.out.println("The Title is " + str3);
                
                //click create leads
                
                driver.findElementByClassName("smallSubmit").click();
                
                     
                
                
                //Check for name
                
                WebElement firstname = driver.findElementById("viewLead_firstName_sp");
                
                            
                String str2 = firstname.getText();
                
                System.out.println("The displayed name is " + str2);
                
                if(str1.equals(str2))
                	
                {
                	System.out.println("The first name matches the resulting lead name");
                	
                }
                else
                {
                	System.out.println("There is no match");
                	
                }
                
                
                /*//check for last name
                driver.findElementById("createLeadForm_lastName").isDisplayed();
                */
                //click create leads
                
                //driver.findElementByClassName("smallSubmit").click();
                
               /* // check for first name
                
                driver.findElementById("viewLead_firstName_sp").isDisplayed();
                */
                //check last name
                
                //driver.findElementById("viewLead_lastName_sp").isDisplayed();
                
                //close browser
                driver.close();
						
				
				
				

	}

}
