package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement elefirstnameverified;
	public ViewLeadPage verifyFirstName(String expectedfirstname) {
		verifyExactText(elefirstnameverified, expectedfirstname);
		System.out.println("The First Name is as expected:  "+expectedfirstname);
		
		return this;
	}
	

}
