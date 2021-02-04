package RestfulBooker;

import io.restassured.RestAssured;

public class PathParameterExample3 {

	public static void main(String[] args) {
		
		// https://token.herokuapp.com/2/3
		// https://{baseAddress}.herokuapp.com/2/3
		// https%3A/token/herokuapp/com/2/3
		RestAssured
		.given()
			.log()
			.all()
			.pathParam("baseAddress", "token")
		.when()
		.get("https:/{baseAddress}/herokuapp/com/{basePath}/{bookingId}",2,3)
		.then()
			.log()
			.all();
	}
	
}
