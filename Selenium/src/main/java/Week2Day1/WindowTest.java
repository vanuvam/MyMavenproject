package Week2Day1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//		
		ChromeDriver driver=new ChromeDriver();
		
		//load the url
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> ContactWindow = driver.getWindowHandles();
		System.out.println(ContactWindow.size());
		
		for (String currentwindow : ContactWindow) {
			
			System.out.println(currentwindow);
			
			driver.switchTo().window(currentwindow);
			
			
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}

}
