package LearningTestNG;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = { "Functional", "Regression" })
	public void TestCase1() {
		System.out.println("Inside TC 1");
	}

	@Test(groups = { "Functional", "Regression" })
	public void TestCase2() {
		System.out.println("Inside TC 2");
	}

	@Test(groups = { "Functional" })
	public void TestCase3() {
		System.out.println("Inside TC 3");
	}

	@Test(groups = { "Functional", "Performance", "Regression" })
	public void TestCase4() {
		System.out.println("Inside TC 4");
	}
}
