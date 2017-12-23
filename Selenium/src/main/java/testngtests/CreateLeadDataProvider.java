package testngtests;

import org.testng.annotations.Test;

public class CreateLeadDataProvider extends Projectng{
	
		
	@Test(dataProvider = "getthedata", dataProviderClass = testngtests.Learndata.class)
	
	public void createLeadDataProvider(String companyname, String firstname, String lastname, int indexvalue, String marketvalue){
		
		click(locateElement("LinkText" , "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), companyname);
		type(locateElement("id", "createLeadForm_firstName"), firstname); 

		type(locateElement("id", "createLeadForm_lastName"), lastname);
		selectDropDownUsingIndex(locateElement("id" , "createLeadForm_dataSourceId"),indexvalue );

		selectDropDownUsingText(locateElement("id", "createLeadForm_marketingCampaignId"),marketvalue);
		
		click(locateElement("Name" , "submitButton"));

	}

}
