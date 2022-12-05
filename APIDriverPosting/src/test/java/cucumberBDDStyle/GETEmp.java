package cucumberBDDStyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETEmp {
	
	@Test
	public void getallemp() {
		
		RestAssured
		.given()
			.baseUri("http://localhost:3000/")
		.when()
			.get("employees")
			.prettyPrint();
		
			
	}

}
