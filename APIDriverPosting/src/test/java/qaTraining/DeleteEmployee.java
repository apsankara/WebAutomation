package qaTraining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteEmployee {
	
@Test	
public void deleteemp() {
	RestAssured.baseURI="http://localhost:3000/";
	
	RequestSpecification requestspecification=RestAssured.given();
	Response response=requestspecification.request(Method.DELETE,"employees/2");
	System.out.println(response.statusCode());
	
	
}



}
