package RestfulBooker;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class PathParameterExample4 {

	public static void main(String[] args) {
		
		Map<String,Object> pathParameters = new HashMap<>();
		pathParameters.put("basePath", "booking");
		pathParameters.put("bookingId", 2);
		
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("{basePath}/{bookingId}")
			//.pathParam("basePath", "booking")
			//.pathParam("bookingId", 2)
			.pathParams(pathParameters)
		.when()
			.get()
		.then()
			.log()
			.all();
	}
	
}
