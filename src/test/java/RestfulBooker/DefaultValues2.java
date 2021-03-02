package RestfulBooker;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DefaultValues2 {
	
	@Test
	public void createBooking1()
	{
		System.out.println(Thread.currentThread().getId());
		RestAssured
		.given()
		.log()
		.all()
		.basePath("auth")
		.body("{\r\n" + 
				"    \"username\" : \"admin\",\r\n" + 
				"    \"password\" : \"password123\"\r\n" + 
				"}")
		.contentType(ContentType.JSON)
		.post() 
		.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	

}
