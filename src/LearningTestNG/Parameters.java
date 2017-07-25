package LearningTestNG;


import org.testng.annotations.Test;


public class Parameters {
	
	
	@Test
	@org.testng.annotations.Parameters("Param1")
	public void ParameterMethod(String Param1){
		
		System.out.println(Param1);
		
	}

}
