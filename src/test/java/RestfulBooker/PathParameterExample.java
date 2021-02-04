package RestfulBooker;

import io.restassured.RestAssured;

public class PathParameterExample {

	public static void main(String[] args) {
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("{basePath}/{bookingId}")
		.when()
			.get("https://restful-booker.herokuapp.com/{basePath}/{bookingId}",2,"booking")
		.then()
			.log()
			.all();
	}
	
}
