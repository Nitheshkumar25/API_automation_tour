package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBooking {

	public static void main(String[] args) {
		// Build request
		//RequestSpecification requestSpecification = ;
		RestAssured
		  .given()
		  	.log()
		  	.all()
		  	.baseUri("https://restful-booker.herokuapp.com/")
		  	.basePath("booking/{id}")
		  	.pathParam("id", 1)
		// Hit the request and get response
		  .when()
		    .get()
		// Validate the response
		  .then()
		  	.log()
		  	.all()
		  	.statusCode(200);
	}
	
}
