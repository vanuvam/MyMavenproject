package testngtests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;

public class Projectng extends SeMethods{
	@Parameters({"browser", "url", "username", "password"})
	@BeforeMethod(groups ="common")
	public void Login(String browser ,String url, String username, String password){
		
		startApp(browser, url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, username);		
		type(locateElement("id", "password"),password);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("LinkText" , "CRM/SFA"));
	}
@AfterMethod(groups ="common")
	public void close()
		{
			closeBrowser(); 
		}
		
	}


