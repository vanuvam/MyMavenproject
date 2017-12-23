package week1day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicate {

	public static void main(String[] args) throws InterruptedException {
    
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://leaftaps.com/opentaps/control/main");
    driver.manage().window().maximize();
    
    driver.findElementByClassName("decorativeSubmit").click();
    driver.findElementById("username").sendKeys("DemoCSR");
    driver.findElementById("password").sendKeys("crmsfa");
    driver.findElementByClassName("decorativeSubmit").click();
    
    driver.findElementByLinkText("CRM/SFA").click();
    
    driver.findElementByPartialLinkText("Leads").click();
    driver.findElementByPartialLinkText("Find Leads").click();
    driver.findElementByXPath("//span/span[contains(text(),'Email')]").click();
    driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("a");
    
    driver.findElementByXPath("//td/em/button[contains(text(),'Find Leads')]").click();
    Thread.sleep(5000);
    
    WebElement web1= driver.findElementByXPath("//tr/td/div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a");
    String str=web1.getText();
    System.out.println("First Resulting Lead is - "+str);
    
    web1.click();
    
    driver.findElementByLinkText("Duplicate Lead").click();
    
    String str1=driver.findElementById("sectionHeaderTitle_leads").getText();
    System.out.println("The title of the page is -"+str1);
    
    driver.findElementByXPath("//tr/td/input[@value ='Create Lead']").click();
    
    String str2=driver.findElementById("viewLead_firstName_sp").getText();
    System.out.println("Name is "+str2);
    
    if(str.equals(str2)){
        System.out.println("Duplicate Lead name is same as captured Lead Name .. Verified");
    }
    else{
        System.out.println("Duplicate Lead name is not same as captured Lead Name .. Not Verified");
    }
    
    driver.close();

}

}