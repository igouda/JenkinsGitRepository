package LearningTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

@Test
public class TestNGAnotation2 {

	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("Inside Before Test Suite");
	}
	
	@BeforeTest
	public void BeforeTest(){
		System.out.println("Inside Before Test");
	}	
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Inside Before Class 2");
	}
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("Inside Before Method 2");
	}
	
	public void Test3()
	{
		System.out.println("Inside TC 3");
	}
	
	public void Test4()
	{
		System.out.println("Inside TC 4");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Inside After Method 2");
	}
	
	@AfterClass
	public void AfterClass(){
		System.out.println("Inside After Class 2");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("Inside After Test");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("Inside After Test Suite");
	}
}
