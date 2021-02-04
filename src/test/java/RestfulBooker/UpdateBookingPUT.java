// Update operation
package RestfulBooker;

import io.restassured.RestAssured;

public class UpdateBookingPUT {

	public static void main(String[] args) {
		
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/1")
			.header("Content-Type","application/json")
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.body("{\r\n" + 
				"    \"firstname\" : \"Amod\",\r\n" + 
				"    \"lastname\" : \"Mahajan\",\r\n" + 
				"    \"totalprice\" : 111,\r\n" + 
				"    \"depositpaid\" : true,\r\n" + 
				"    \"bookingdates\" : {\r\n" + 
				"        \"checkin\" : \"2018-01-01\",\r\n" + 
				"        \"checkout\" : \"2019-01-01\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\" : \"Breakfast\"\r\n" + 
				"}")
		.when()
			.put()
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);
			
		
		
	}
}
