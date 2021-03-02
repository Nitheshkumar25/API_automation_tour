package RestfulBooker;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class WithoutResponseSpecification {
	
	ResponseSpecification responseSpecification;
	
	@BeforeClass
	public void setUpExpectations()
	{
		responseSpecification = RestAssured.expect();
		responseSpecification.statusCode(200);
		responseSpecification.contentType(ContentType.JSON);
		responseSpecification.time(Matchers.lessThan(5000L));
	}

	@Test
	public void createBooking() {
		
		
		
		
	RestAssured
	.given()
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
	.contentType(ContentType.JSON)
	// Hit the request and get the response
	.post()
	// Validate the response 
	.then()
	.log()
	.all()
	.spec(responseSpecification);
	}
	
	
	@Test
	public void createBooking2() {
		
	RestAssured
	.given()
	.log()
	.all()
	.baseUri("https://restful-booker.herokuapp.com/")
	.basePath("booking")
	.body("{\r\n" + 
		"    \"firstname\" : \"Mukesh\",\r\n" + 
		"    \"lastname\" : \"Otwani\",\r\n" + 
		"    \"totalprice\" : 15,\r\n" + 
		"    \"depositpaid\" : false,\r\n" + 
		"    \"bookingdates\" : {\r\n" + 
		"        \"checkin\" : \"2021-01-01\",\r\n" + 
		"        \"checkout\" : \"2021-01-01\"\r\n" + 
		"    },\r\n" + 
		"    \"additionalneeds\" : \"Lunch\"\r\n" + 
		"}")
	.contentType(ContentType.JSON)
	// Hit the request and get the response
	.post()
	// Validate the response 
	.then()
	.log()
	.all()
	.spec(responseSpecification);
	}

}
