package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteBooking {
	
	public static void main(String[] args) {
		
		// Construct request
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/{bookingID}")
			.pathParam("bookingID", "5")
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.header("Content-Type","application/json")
			
		// Hit request
		.when()
			.delete()
		// Validate response
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(201);
	}

}
