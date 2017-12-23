package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dragdrop {
	@Test
	public void dragdrop(){
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
				
		driver.get("https://jqueryui.com");
	
		driver.manage().window().maximize();
		
		
		driver.findElementByLinkText("Draggable").click();
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));

		WebElement drag = driver.findElementById("draggable");
		int initialxcord = drag.getLocation().getX();
		int initialycord = drag.getLocation().getY();
		
		System.out.println("X coordinate : " +initialxcord + "Y coordinate: " + initialycord);
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 50, 50).perform();
		
		
		

				
		
		
		
					
		
	}
	

}
