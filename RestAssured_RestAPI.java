import org.testng.annotations.Test;

import TestScriptsforAPItesting.TestCase_001_Get_Method;

public class RestAssured_RestAPI {
	//object for the class
	TestCase_001_Get_Method obj = new TestCase_001_Get_Method();
  @Test(priority=1)
  public void GetTestMethod() {
	  obj.Get_API_Test_Method();
  }
  
  @Test(priority=2)
  
  public void PostTestMethod() {
	  obj.Post_API_Test_Method();
	  
  }
  
  @Test(priority=3)
  
  public void DeleteTestMethod() {
	  obj.Delete_API_Test_Method();
  }
}
