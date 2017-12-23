package Week2Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//		
		ChromeDriver driver=new ChromeDriver();
		
		//load the url
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		
		
		driver.findElementByXPath("//button[contains(text(),'Try it')]").click();
		
		Alert al1 = driver.switchTo().alert();
		
		String alerttext1 = al1.getText();
		System.out.println(alerttext1);
		String str1 = "Deepa";
		al1.sendKeys(str1);
		
		System.out.println(alerttext1 + str1);
		
		Thread.sleep(5000);
		
		al1.accept();
		
		//driver.switchTo().frame("iframeResult");
		
		String frametext = driver.findElementById("demo").getText();
		
		if(frametext.contains(str1))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Fail");
		}
			

	}

}
