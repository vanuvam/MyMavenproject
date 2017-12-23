package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dragdrop2Item {
	@Test
	public void dragdrop(){
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
				
		driver.get("https://jqueryui.com");
	
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Sortable").click();
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));

		WebElement item1 = driver.findElementByXPath("//li[contains(text(),'Item 1')]");
		WebElement item4 = driver.findElementByXPath("//li[contains(text(),'Item 4')]");
		int x=item4.getLocation().getX();
		int y=item4.getLocation().getY();
		System.out.println(x+":" +y );
		Actions builder = new Actions(driver);
		builder.clickAndHold(item1).moveByOffset(x, y).build().perform();
				
		//builder.dragAndDrop(item1, item4).perform();
	}

}
