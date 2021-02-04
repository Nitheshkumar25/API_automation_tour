// This is demo comment
package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBooking {

	public static void main(String[] args) {
		
		//Build Request
		//RequestSpecification requestSpecification = RestAssured.given();
		//RequestSpecification requestSpecification = RestAssured.given().log().all();
		//RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/");
		// Setup request
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
			// Hit the request and get the response
			.post()
			// Validate the response 
			.then()
			.log()
			.all()
			.statusCode(200);
		
		
		//Hit Request and get Response
		//Response response= requestSpecification.post();
		
		//Validate Response
//		ValidatableResponse validatableResponse = response.then().log().all();
//		validatableResponse.statusCode(200);
		
		
//		RestAssured
//		 .given()
//		 .baseUri("https://restful-booker.herokuapp.com/")
//		 .basePath("booking")
//		 .contentType(ContentType.JSON)
//		 .post()
//		 .then()
//		 .statusCode(200);
//		

		
	}
}
