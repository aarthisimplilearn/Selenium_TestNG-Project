package TestScriptsforAPItesting;

import java.io.Reader;
import java.util.Properties;

import org.mozilla.javascript.ConstProperties;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.support.FileReader;
import io.restassured.response.Response;

public class TestCase_001_Get_Method {
	ConstProperties P;
	FileReader FR;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my first code");
		
	}
		
	public static void Get_API_Test_Method() {
		Properties P = new Properties();
		FileReader FR = new FileReader("C:\\Users\\Admin\\eclipse\\java-2024-03\\eclipse\\RestAssured_API_Testing\\TestDataInput\\TestAPIData.properties");
		P.load(FR);
		String BaseURIGet = P.getProperty("burig");
		RestAssured.baseURI = BaseURIGet;
		
		String EndPointGet = "/api/users/2";
		Response res = RestAssured.get("epg");
		
		int StatusCode = res.getStatusCode();
		System.out.println("The status code for the Get-API is"+" "+StatusCode);
		
	}
		
		//Post Method
	
	public static void Post_API_Test_Method() {
		
		String BasePost1 = "https://reqres.in/";
		
		String EndPointPost1 = "/api/users";
		String APIBody1 = "{\"name\":\"morpheus\",\"job\":\"leader\"}";
		int Expstatuscode = 201;
		
		Response res1 = RestAssured.given().contentType(ContentType.JSON).body(APIBody1).post(EndPointPost1);
		int StatusCodePost = res1.getStatusCode();
		System.out.println("The status code for the Post-API is"+" "+StatusCodePost);
		
		int actstatuscode =  res1.getStatusCode();

		if(Expstatuscode == actstatuscode)
		{
			System.out.println("Valid Status Code Generated");
		}
		
		else {
			System.out.println("Invalid Status Code Generated");
		}
	}
	
		//Delete Method
	
	public static void Delete_API_Test_Method() {
		
        String BaseDelete1 = "https://reqres.in/";
		
		String EndPointDelete1 = "/api/users/2";
		String APIBody2 = "{\"name\":\"morpheus\",\"job\":\"leader\"}";
		
		Response res2 = RestAssured.given().contentType(ContentType.JSON).body(APIBody2).delete(EndPointDelete1);
		int StatusCodeDelete = res2.getStatusCode();
		System.out.println("The status code for the Delete-API is"+" "+StatusCodeDelete);

		
	}
	
}


