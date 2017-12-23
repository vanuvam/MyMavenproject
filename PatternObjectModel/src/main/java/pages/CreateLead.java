package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {
	
	public CreateLead(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public CreateLead enterCompanyName(String companyname) {
		type(eleCompanyName, companyname);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLead eleFirstName(String firstname) {
		type(eleFirstName, firstname);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	public CreateLead eleLastName(String lastname) {
		type(eleLastName, lastname);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	private WebElement eleSourceDropDown;
	
	public CreateLead eleSourceIdDropdown(String index ) {
		
		int number1 = Integer.parseInt(index);
		selectDropDownUsingIndex(eleSourceDropDown, number1);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	private WebElement eleMarketingDropDown;
	
	public CreateLead elemarcampaigndropdown(String textvalue ) {
		selectDropDownUsingText(eleMarketingDropDown, textvalue);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmit;

	public ViewLeadPage clickSubmit() {
		click(eleSubmit);
		return new ViewLeadPage(driver,test);
	
	
	}

}
