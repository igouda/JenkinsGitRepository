package LearningTestNG;

import org.testng.annotations.Test;

public class DataProvider {

	@Test(dataProvider="data")
	public void TestCases(String FName, String SName, String MName, String LName){
		
		System.out.println(FName);
		System.out.println(SName);
		System.out.println(MName);
		System.out.println(LName);
	}
	
	
	
	
	@org.testng.annotations.DataProvider(name="data")
	private Object[][] TestData(){
		Object[][] obj=new Object[3][4];
		
		obj[0][0]= "Islam 1";
		obj[0][1]= "Gouda 1";
		obj[0][2]= "Kamal 1";
		obj[0][3]= "Eliwa 1";
		
		obj[1][0]= "Islam 2";
		obj[1][1]= "Gouda 2";
		obj[1][2]= "Kamal 2";
		obj[1][3]= "Eliwa 2";
		
		obj[2][0]= "Islam 3";
		obj[2][1]= "Gouda 3";
		obj[2][2]= "Kamal 3";
		obj[2][3]= "Eliwa 3";
		
		return obj;
		
	}
}
