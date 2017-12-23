package week1day1;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class LeafTaps {

	public static void main(String[] args) {
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
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
	//login
		driver.findElementByClassName("decorativeSubmit").click();
//crms/fa link 
		driver.findElementByLinkText("CRM/SFA").click();
		
		// click create lead
		
		driver.findElementByLinkText("Create Lead").click();
		//enter company name 
		driver.findElementById("createLeadForm_companyName").sendKeys("WIpro");
			//enter first name 
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Sruthi");
		
		//enter last name
		
		driver.findElementById("createLeadForm_lastName").sendKeys("vinay");
		
		// select the source
		
		//Select drp1 = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		
		//drp1.selectByVisibleText("Partner");
		
		WebElement sourceid = driver.findElementById("createLeadForm_dataSourceId");
		
		Select lastoption = new Select (sourceid);
		
		lastoption.selectByIndex(12);
		
		//select marketing campaign
		
		WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select option = new Select (market);
		
		option.selectByVisibleText("Demo Marketing Campaign");
		//select firstname local
		
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("deepa");
		
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("vanu");
		
		driver.findElementById("createLeadForm_personalTitle").sendKeys("MRS");
		
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Testing");
		
		driver.findElementById("createLeadForm_departmentName").sendKeys("Insurance");
		
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("12300");
		
		Select drp3 = new Select(driver.findElementById("createLeadForm_currencyUomId"));
		
         drp3.selectByIndex(3);
		
		Select drp4 = new Select(driver.findElementById("createLeadForm_industryEnumId"));
		drp4.selectByIndex(4);
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("345");
		
		
		Select drp5 = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		drp5.selectByIndex(4);
		
		driver.findElementById("createLeadForm_sicCode").sendKeys("2346789098");
		
		
		driver.findElementById("createLeadForm_sicCode").sendKeys(Keys.TAB);

		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("2342");
		
		driver.findElementById("createLeadForm_description").sendKeys("This is a test");
		
		driver.findElementById("createLeadForm_importantNote").sendKeys("regular practice is key");
		
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("201");
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("2016445789");


		driver.findElementById("createLeadForm_primaryEmail").sendKeys("deepavanu2k@yahoo.com");

		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		
		
		Select drp6 = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
		drp6.selectByVisibleText("Texas");
		
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		
		Select sta = new Select (state);
		sta.selectByValue("SC");
			
		//click on create lead
		driver.findElementByName("submitButton").click();		
		
        
		
		

	}

}
