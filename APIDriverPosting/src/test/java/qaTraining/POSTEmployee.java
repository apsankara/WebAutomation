package qaTraining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTEmployee {
	
	@Test
	public void postemployee() {
		
		RestAssured.baseURI="http://localhost:3000/";
		
		RequestSpecification requestspecification=
				RestAssured.given()
				.header("Content-Type","application/json; charset=utf-8")
				.body("{\r\n"
						+ "      \"first_name\": \"Riya\",\r\n"
						+ "      \"last_name\": \"Riyaprasath\",\r\n"
						+ "      \"email\": \"Riya@gmail.com\","
						+ "}");
		
		Response response=requestspecification.request(Method.POST,"employees");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
		
	}

}
