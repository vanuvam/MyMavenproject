package week4day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class trialTestng {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method");
	}
	@Test
	public void test1(){
		System.out.println("test");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("after Method");
	}

	@AfterClass
	public void afterClass(){
		System.out.println("after Class");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("after Suite");
	}

	@Test
	public void test3(){
		System.out.println("test3");
	}
	
	@Test
	public void test2(){
		System.out.println("test2");
	}
	
	

}
