package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods {
	
	private static final String String = null;

	public FindLeads(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	//clicking find leads tab
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement clickfindleadstab;
	
	public FindLeads findleadstabclick() {
		click(clickfindleadstab);
		return this;		
	}
	
	//selecting phone tab
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elephonenotab;
	
	public FindLeads clickphoneno() {
		click(elephonenotab);
		return this;		
	}
	//entering phone no
	@FindBy(how=How.NAME,using="phoneCountryCode")
	private WebElement eleenterphone;
	
	public FindLeads eleenterphonenumber(String phonenum) {
		type(eleenterphone, phonenum);
		return this;		
	}
	
	//clicking find leads
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleclickfindleads;
	
	public FindLeads elefindleadsbtn() {
		click(eleclickfindleads);
		return this;		
	}
	
	//getting first lead id
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	private WebElement elefirstleadid;
	
	public String elergetfirstleadid() {
		
		String str1 = elefirstleadid.getText();
		
		
				return str1;		
	}
	
	//clicking first lead id
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[6]")
	private WebElement clickresleadid;
	
	public FindLeads eleclickresfirstleadId( ) {
		click(clickresleadid);
		return this;		
	}
	

	// entering resultant lead id
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement firstidresultant;
	
		public FindLeads enterresleadid(String firstreslead ) {
		type(firstidresultant,firstreslead);
		return this;		
	}
		
		//clicking delete
		@FindBy(how=How.XPATH,using="//a[text()='Delete']")
		private WebElement eledelete;

		public ViewLeadPage clickdelete() {
			click(eledelete);
			return new ViewLeadPage(driver,test);
		
			}
		
	//error message

	@FindBy(how=How.XPATH,using="//div[text() = 'No records to display']")
	private WebElement verifyerrormessage;

	public FindLeads verifyerrormessageafterdelete(String expectederrmsg) {
		verifyExactText(verifyerrormessage, expectederrmsg);
		return this;
	
		}

}
