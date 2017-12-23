package Week3Day1;


import org.junit.Test;

//import org.testng.annotations.Test;

import week1day1.ProjectMethods;

public class CLwithmethods extends ProjectMethods {
	
	@Test
	
	
	public void createLead(){
		Login();
		
		click(locateElement("LinkText" , "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "wipro");
		type(locateElement("id", "createLeadForm_firstName"), "Deepa"); 

		type(locateElement("id", "createLeadForm_lastName"), "Vanu");

		selectDropDownUsingIndex(locateElement("id" , "createLeadForm_dataSourceId"), 2);

		selectDropDownUsingText(locateElement("id", "createLeadForm_marketingCampaignId"),"Demo Marketing Campaign");
		type(locateElement("id" , "createLeadForm_firstNameLocal"),"madhu");
		type(locateElement("id" , "createLeadForm_lastNameLocal"),"venkat");
		type(locateElement("id" , "createLeadForm_personalTitle"),"Miss");
		type(locateElement("id" , "createLeadForm_generalProfTitle"),"Testing");
		type(locateElement("id" , "createLeadForm_departmentName"),"Insurance");
		type(locateElement("id" , "createLeadForm_annualRevenue"),"12345");
		selectDropDownUsingIndex(locateElement("id", "createLeadForm_currencyUomId"), 4);
		selectDropDownUsingIndex(locateElement("id", "createLeadForm_industryEnumId"), 3);	

		type(locateElement("id" , "createLeadForm_numberEmployees"),"23");
		selectDropDownUsingIndex(locateElement("id", "createLeadForm_ownershipEnumId"), 5);
		type(locateElement("id" , "createLeadForm_sicCode"),"12345345");
		type(locateElement("id" , "createLeadForm_tickerSymbol"),"345");
		type(locateElement("id" , "createLeadForm_description"),"Test");
		type(locateElement("id" , "createLeadForm_importantNote"),"Practice");

		type(locateElement("id" , "createLeadForm_importantNote"),"Practice");
		type(locateElement("id" , "createLeadForm_primaryPhoneCountryCode"),"91");
		type(locateElement("id" , "createLeadForm_primaryPhoneAreaCode"),"201");
		type(locateElement("id" , "createLeadForm_primaryPhoneNumber"),"24115678");

		type(locateElement("id" , "createLeadForm_primaryEmail"),"deepa123@gmail.com");

		type(locateElement("id" , "createLeadForm_generalCity"),"Chennai");


		selectDropDownUsingText(locateElement("id", "createLeadForm_generalStateProvinceGeoId"),"Texas");


		click(locateElement("Name" , "submitButton"));
		
	}
	
	
	

}
