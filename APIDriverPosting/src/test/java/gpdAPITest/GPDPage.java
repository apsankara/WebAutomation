package gpdAPITest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GPDPage {

	@Test
	public void GET_Request() {
		
		given()
		.when()
			.get("https://www.support.xerox.com/en-us/product/global-printer-driver")		
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.header("Content-Type", "text/html; charset=utf-8")
			.log()
			.all();
		
		
		
		
	}
	

}
