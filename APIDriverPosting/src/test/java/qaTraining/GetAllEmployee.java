package qaTraining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class GetAllEmployee {

	@Test
	public void getAllEmployee() {
		
		RestAssured.baseURI="http://localhost:3000/";
		
		RequestSpecification requestspecification=RestAssured.given();
		Response response=requestspecification.request(Method.GET,"employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		
	}
}
