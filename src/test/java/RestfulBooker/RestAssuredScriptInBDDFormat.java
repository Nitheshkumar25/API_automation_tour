package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestAssuredScriptInBDDFormat {
	
	public static void main(String[] args) {
		
		//Given - Build request
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking")
				.body("{\r\n" + 
					"    \"firstname\" : \"Amod\",\r\n" + 
					"    \"lastname\" : \"Mahajan\",\r\n" + 
					"    \"totalprice\" : 15,\r\n" + 
					"    \"depositpaid\" : false,\r\n" + 
					"    \"bookingdates\" : {\r\n" + 
					"        \"checkin\" : \"2021-01-01\",\r\n" + 
					"        \"checkout\" : \"2021-01-01\"\r\n" + 
					"    },\r\n" + 
					"    \"additionalneeds\" : \"Lunch\"\r\n" + 
					"}")
				.contentType(ContentType.JSON)
			.when()
				.post()
			.then()
				.statusCode(200);
		
		// When
		//Then
	}

}
