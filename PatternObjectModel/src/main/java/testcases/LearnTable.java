package testcases;

import java.util.ArrayList;
import java.util.List;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LearnTable {
	@Test
	public void dragdrop() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();


		driver.get("https://erail.in");

		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(30, Timt.seconds(3000));

		driver.findElementById("txtStationFrom").clear();


		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);


		driver.findElementById("txtStationTo").clear();


		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		Thread.sleep(3000);
		WebElement table = driver.findElementByXPath("//table[@class ='DataTable TrainList']");
		
List<WebElement> row = table.findElements(By.tagName("tr"));
System.out.println(row.size());
System.out.println(row.get(0).findElements(By.tagName("td")).get(1).getText());

List<WebElement> column = table.findElements(By.tagName("td"));
System.out.println(column.size());	
List<String> item = new ArrayList<String>();










	}

}
