package MockData;

import io.restassured.RestAssured;

public class MockyDesign {
	
	public static void main(String[] args) {
		
		RestAssured
			.given()
			.log()
			.all()
			.get("https://run.mocky.io/v3/f6dd2694-c32f-41f8-a901-f272dc5ef8d2")
			.then()
			.log()
			.all();
	}

}
