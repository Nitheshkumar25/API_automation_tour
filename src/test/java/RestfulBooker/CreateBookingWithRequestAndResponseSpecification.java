package RestfulBooker;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreateBookingWithRequestAndResponseSpecification {

	public static void main(String[] args) {
		
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification
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
			.contentType(ContentType.JSON);
		
		ResponseSpecification responseSpecification = RestAssured.expect();
		responseSpecification.statusCode(200);
		responseSpecification.contentType(ContentType.JSON);
		responseSpecification.time(Matchers.lessThan(5000L));
		
		RestAssured
			.given(requestSpecification,responseSpecification)
			//.spec(requestSpecification)
			// Hit the request and get the response
			.post()
			// Validate the response 
			.then()
			.log()
			.all();
			//.spec(responseSpecification);
		
	}
}
