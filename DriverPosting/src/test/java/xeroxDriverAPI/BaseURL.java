package xeroxDriverAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseURL {

	 @Test
	 public void supportbaseURL() {
		RestAssured.baseURI="https://www.Google.com/";
		RequestSpecification requestspecification=RestAssured.given();
		Response responce=requestspecification.request(Method.GET);
		
		System.out.println(responce.asPrettyString());
		
		System.out.println(responce.getStatusCode());
		System.out.println(responce.getStatusLine());

	}

}
