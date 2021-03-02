// This is demo comment
package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ExtractResponseAsString {

	public static void main(String[] args) {
		
		String responseBody= 
		RestAssured
			.given()
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
			.post()
			.then()
			.extract()
		//	.body()
			.asPrettyString();
		System.out.println(responseBody);
			
		
//		

		
	}
}
