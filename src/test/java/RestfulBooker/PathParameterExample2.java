package RestfulBooker;

import io.restassured.RestAssured;

public class PathParameterExample2 {

	public static void main(String[] args) {
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("{basePath}/{bookingId}")
			.pathParam("basePath", "booking")
			.pathParam("bookingId", 2)
		.when()
			.get()
		.then()
			.log()
			.all();
	}
	
}
