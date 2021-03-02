package RestfulBooker;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class MultipleBookings {
	
	RequestSpecification requestSpecification;
	
	@BeforeClass
	public void setupRequestSpec()
	{
		requestSpecification = RestAssured.given();
		requestSpecification
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.contentType(ContentType.JSON);
	}
	

	@Test
	public void createBooking1()
	{
		RestAssured
			.given()
			.spec(requestSpecification)
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
		
		// Hit the request and get the response
		.post()
		// Validate the response 
		.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void updateBooking()
	{
		RestAssured
		.given()
			.spec(requestSpecification)
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.basePath("booking/1")
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
