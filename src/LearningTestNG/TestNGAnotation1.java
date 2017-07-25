package LearningTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;

public class TestNGAnotation1 {
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Inside Before Class");
	}
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("Inside Before Method");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("Inside TC 1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Inside TC 2");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Inside After Method");
	}
	
	@AfterClass
	public void AfterClass(){
		System.out.println("Inside After Class");
	}

}
