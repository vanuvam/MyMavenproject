package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	int i=0; 
	RemoteWebDriver driver = null ;
	WebElement ele = null;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Browser "+browser+" Launched successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*finally	{
			takeSnap();

}*/

	}
	public void startApp(String browser)  {

		startApp(browser, "");
	}

	public WebElement locateElement(String locator, String locValue){
	try {
		switch (locator) {
		case "id": 
			ele = driver.findElementById(locValue);
			break;
		case "xpath": 
			ele = driver.findElementByXPath(locValue);
			break;	
		case "class": 
			ele = driver.findElementByClassName(locValue);
			break;
		case "LinkText": 
			ele = driver.findElementByLinkText(locValue);
			break;	
		case "Name": 
			ele = driver.findElementByName(locValue);
			break;	

		}		

	} catch (NoSuchElementException e) {

		e.printStackTrace();
	} catch (WebDriverException e) {

		e.printStackTrace();
	}

	/*finally
	{
		takeSnap();

	}*/
	return ele;
}

	public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		try {
			ele=driver.findElementByLinkText(locValue);


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			takeSnap();

		}
		return ele;
	}
	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("Given Value :"+data+" Is Entered Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			takeSnap();

		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("Element is Clicked Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			takeSnap();

		}

	}
	public String getText(WebElement ele){
		// TODO Auto-generated method stub
		String Text=null;
		try{

		 Text = ele.getText();
			System.out.println("Text found is: "+Text);
		}
		catch(Exception e){	
			e.printStackTrace();
		}
		finally
		{
			takeSnap();

		}
		return Text;
	}

	public void selectDropDownUsingText(WebElement ele, String value){

		Select dropElement = new Select(ele);
		try {
			dropElement.selectByVisibleText(value);
		}
		catch (Exception e)
		{

			e.printStackTrace();
		}
		finally
		{
			takeSnap();

		}
	}

	public void selectDropDownUsingValue(WebElement ele, String value) 
	{
		// TODO Auto-generated method stub
		
		
		try {
			
			Select dropElementValue = new Select(ele);
			dropElementValue.selectByValue(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			takeSnap();
			
		}
	}
	public void selectDropDownUsingIndex(WebElement ele, int string) {
		// TODO Auto-generated method stub
		
		try {
			Select indexDrop = new Select(ele);
			indexDrop.selectByIndex(string);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			takeSnap();
			
		}

	}
	public String verifyTitle(String expectedTitle) {

		// TODO Auto-generated method 
String title = null;

		 try {
			title =	driver.getTitle();
			System.out.println("title"+title);

			if( title .equals(expectedTitle))
			{
				System.out.println("Title is as expected");
				
			}
			else
			{
				System.out.println("Title is not as expected");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally
			{
				takeSnap();
				
			}  
return title;
	}
	public void verifyExactText(WebElement ele, String expectedText){
		// TODO Auto-generated method stub
		String exactText= ele.getText();
		try {
			if(exactText .equals(expectedText))
			{
				System.out.println("Text is the same as expected");
			}
			else
			{
				System.out.println("Text is not same");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			takeSnap();
			
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText)  {
		// TODO Auto-generated method stub
		String text=ele.getText();
		try {
			if(text.contains(expectedText))
			{
				System.out.println("Verification of partial text successful");
			}
			else
			{
				System.out.println("Verification of partial text is not successful");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			takeSnap();
			
		}
	}


	public void verifyExactAttribute(WebElement ele, String attribute, String value){
		// TODO Auto-generated method stub
		String ExactAttributeText =ele.getAttribute(attribute);
		if(ExactAttributeText.equalsIgnoreCase(value)){
			System.out.println("exact attribute verified");
		}
		else{
			System.out.println("exact attribute not verified");
		}

	}
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub
		String attributeText=ele.getAttribute(attribute);
		if(attributeText.contains(value)){
			System.out.println("partial attribute verified");
		}
		else{
			System.out.println("partial attribute not verified");
		}

	}


	public void verifySelected(WebElement ele){
		// TODO Auto-generated method stub

		try {
			if(ele.isSelected()){
				System.out.println("webelement is Selected");
			}
			else{
				System.out.println("webelement is not selected");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			takeSnap();
			
		}
	}
	public void verifyDisplayed(WebElement ele){
		// TODO Auto-generated method stub
		try {
			if(ele.isDisplayed()){
				System.out.println("webelement is displyed");
			}
			else{
				System.out.println("webelement is not displayed");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			takeSnap();
			
		}
	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		try {
			Set<String> allWindowHandles = driver.getWindowHandles();

			List<String> allHandles = new ArrayList<>();		
			allHandles.addAll(allWindowHandles);
			driver.switchTo().window(allHandles.get(index));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(ele);
			System.out.println("Switched to new frame");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			finally
			{
				takeSnap();
				
			}
		}
	

	
	public void acceptAlert(){
		// TODO Auto-generated method stub
		Alert alert = null;
		try {
			 alert =driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			takeSnap();
			
		}
		
	}
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			takeSnap();
			
		}
	}


	public String getAlertText() {
		// TODO Auto-generated method stub
		Alert alert=null;
		String alertText=null;
		try {
			alert =driver.switchTo().alert();
			alertText=alert.getText();
			System.out.println("Alert text is "+alertText);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			takeSnap();
			
		}
		return alertText;
	}


	public void takeSnap() {
		// TODO Auto-generated method stub
		try {
			File src= driver.getScreenshotAs(OutputType.FILE);
			File dest= new File("./snaps/snap"+i+".jpeg");
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException();

		}

		catch (WebDriverException e) {

			System.err.println("Driver does not exist");
			throw new RuntimeException();
		}

		i++;

	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			System.out.println("Browser closed successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			System.out.println("Browser closed successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
