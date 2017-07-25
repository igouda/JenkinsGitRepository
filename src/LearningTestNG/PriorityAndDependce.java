package LearningTestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class PriorityAndDependce {
	
	@Test(priority=2)
	public void TestCase1(){
		System.out.println("Test Case 1");
	}
	
	@Test(priority=1)
	public void TestCase2(){
		System.out.println("Test Case 2");
		assertEquals(1, 2);
	}
	
	@Test(priority=3)
	public void TestCase3(){
		System.out.println("Test Case 3");
		try
		{
			assertEquals(1, 2);
		}
		catch(Throwable t)
		{
			System.out.println(t);
		}
		
	}
	
	@Test(priority=3, dependsOnMethods={"TestCase2"})
	public void TestCase4(){
		System.out.println("Test Case 4");
	}
	
	@Test(priority=3, dependsOnMethods={"TestCase1"})
	public void TestCase5(){
		System.out.println("Test Case 5");
	}
	
	@Test(priority=3, dependsOnMethods={"TestCase3"})
	public void TestCase6(){
		System.out.println("Test Case 6");
	}
	

}
