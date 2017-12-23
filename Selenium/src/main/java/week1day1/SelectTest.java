package week1day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//		
		ChromeDriver driver=new ChromeDriver();

		//load the url

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//maximise
		driver.manage().window().maximize();


		driver.findElementById("userRegistrationForm:userName").sendKeys("deepa123");

		driver.findElementById("userRegistrationForm:password").sendKeys("srivar@1234");

		driver.findElementById("userRegistrationForm:confpasword").sendKeys("srivar@1234");


		Select drp1 = new Select(driver.findElementById("userRegistrationForm:securityQ"));

		drp1.selectByIndex(2);

		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("rosary");


		Select drp2 = new Select(driver.findElementById("userRegistrationForm:prelan"));

		drp2.selectByVisibleText("English");



		driver.findElementById("userRegistrationForm:firstName").sendKeys("Deepa");

		driver.findElementById("userRegistrationForm:lastName").sendKeys("Vanu");

		driver.findElementById("userRegistrationForm:gender:1").click();

		driver.findElementById("userRegistrationForm:maritalStatus:0").click();


		Select drp3 = new Select(driver.findElementById("userRegistrationForm:dobDay"));

		drp3.selectByVisibleText("15");

		Select drp4 = new Select(driver.findElementById("userRegistrationForm:dobMonth"));

		drp4.selectByVisibleText("FEB");	

		Select drp5 = new Select(driver.findElementById("userRegistrationForm:dateOfBirth"));

		drp5.selectByVisibleText("1984");		


		Select drp6 = new Select(driver.findElementById("userRegistrationForm:occupation"));
		drp6.selectByIndex(3);		

		
		// to select Egypt by using E as first letter using select class
		Select drp7 = new Select(driver.findElementById("userRegistrationForm:countries"));
		List<WebElement> options = drp7.getOptions();
		int cnt = options.size();
		System.out.println(cnt);
		
		int count1 = 0;
		
			
	for(WebElement cntname : options)
		{
			if(cntname.getText().startsWith("E"))
			{
				count1++;
			}
			if(count1 == 2)
			{
				drp7.selectByVisibleText(cntname.getText());
				
				break;
			}
		}
		
			
		driver.findElementById("userRegistrationForm:email").sendKeys("deepavanu2000@gmail.com");

		driver.findElementById("userRegistrationForm:mobile").sendKeys("9876787654");



		Select drp8 = new Select(driver.findElementById("userRegistrationForm:nationalityId"));
		drp8.selectByVisibleText("India");
			
		drp8.selectByVisibleText("India");		

		driver.findElementById("userRegistrationForm:address").sendKeys("10");

		driver.findElementById("userRegistrationForm:pincode").sendKeys("600004",Keys.TAB);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Select drp9 = new Select(driver.findElementById("userRegistrationForm:cityName"));
		drp9.selectByVisibleText("Chennai");	

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Select drp10 = new Select(driver.findElementById("userRegistrationForm:postofficeName"));
		drp10.selectByIndex(2);

		driver.findElementById("userRegistrationForm:landline").sendKeys("24611819");

		driver.findElementById("userRegistrationForm:newsletter:1").click();

		driver.findElementById("userRegistrationForm:commercialpromo:1").click();

		driver.findElementById("userRegistrationForm:irctcsbicard:0").click();

	}

}
