package Week2Day1;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//		
		ChromeDriver driver=new ChromeDriver();

		//load the url

		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximise
		driver.manage().window().maximize();

		//logout 

		//driver.findElementByClassName("decorativeSubmit").click();

		//getting the user name and password
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		//login
		driver.findElementByClassName("decorativeSubmit").click();
		//crms/fa link 
		driver.findElementByLinkText("CRM/SFA").click();

		// leads tab click

		driver.findElementByLinkText("Leads").click();

		driver.findElementByLinkText("Merge Leads").click();

		//From leads image icon click

		//driver.findElementByXPath("//img[@alt='Lookup'][1]").click();
		
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'][1])").click();

		//Window handling 
		
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		
				allwindows.size();

		System.out.println(driver.getTitle());

		for (String  currentwind : allwindows) {

			System.out.println(currentwind);

			driver.switchTo().window(currentwind);


		}

		driver.getTitle();
		driver.findElementByXPath("//div/input[@name  = 'id']").sendKeys("12412");

		driver.findElementByXPath("//td/em/button[contains(text(),'Find Leads')]").click();
		Thread.sleep(5000);

		driver.findElementByXPath("(//a[@class = 'linktext'])[1]").click();

		Thread.sleep(2000);
		
		// bring focus to main window
		driver.switchTo().window(parentwindow);
        driver.getTitle();
		// To lead click


      		driver.findElementByXPath("(//img[@alt = 'Lookup'])[2]").click();
		
		//driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'][2])").click();


		//Window handling 
		Set<String> allwindows2 = driver.getWindowHandles();

		allwindows2.size();

		System.out.println(driver.getTitle());

		for (String  currentwind2 : allwindows2) {

			System.out.println(currentwind2);

			driver.switchTo().window(currentwind2);

		}

		driver.getTitle();
		driver.findElementByXPath("//div/input[@name  = 'id']").sendKeys("12410");

		driver.findElementByXPath("//td/em/button[contains(text(),'Find Leads')]").click();
		Thread.sleep(5000);

		driver.findElementByXPath("//a[@class = 'linktext'][1]").click();
		
		driver.switchTo().window(parentwindow);
		
		Thread.sleep(5000);
		
	   //click on merge leads
		
		driver.findElementByXPath("//a[@class = 'buttonDangerous']").click();
		
		//accept the alert
		Alert al1 = driver.switchTo().alert();
		String alerttext1 = al1.getText();
		System.out.println(alerttext1);
		al1.accept();
		
		// click on find leads tab link
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//div/input[@name  = 'id']").sendKeys("12412");
		
		driver.findElementByXPath("//td/em/button[contains(text(),'Find Leads')]").click();
		
		String str1 = driver.findElementByClassName("x-paging-info").getText();
		
		System.out.println(" The error message is  :" + str1);
		
		driver.close();

 
	}

}
