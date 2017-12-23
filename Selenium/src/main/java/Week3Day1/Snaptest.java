package Week3Day1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snaptest {
	
	

	public static void main(String[] args) {
		
		int count =0;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//		
		ChromeDriver driver=new ChromeDriver();
		//int i = 0;
		//load the url
		
		driver.get("https://www.google.co.in");
		
		driver.manage().window().maximize();
		driver.findElementById("lst-ib").sendKeys("Sruthi");
		driver.findElementById("lst-ib").sendKeys(Keys.ENTER);
        //List<WebElement> wordsearch = driver.findElementsByPartialLinkText("Sruthi");
		List<WebElement> wordsearch = driver.findElementsByTagName("a");
		
		
		System.out.println(wordsearch.size());
		//wordsearch.get(2).click();
		for(WebElement eachlink : wordsearch)
		{
			
			if(eachlink.getText().contains("Sruthi"))
					{
							
				
				        System.out.println(eachlink.getText());
				        count++;
				        if(count==2){
				        //eachlink.get
				        
				        eachlink.click();break;
				        }
					}
					
		}
		/*for (int j = 0; j < wordsearch.size(); j++) {
			if (wordsearch.get(j).getText().contains("Sruthi")) {
				System.out.println(wordsearch.get(j));
			}
		}*/
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File desc = new File("./screenshots/wotdsearch.jpeg");
		
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
