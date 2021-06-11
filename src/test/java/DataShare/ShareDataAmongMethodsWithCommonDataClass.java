package DataShare;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ShareDataAmongMethodsWithCommonDataClass {
	
	@Test(priority = 1)
	public void createBooking()
	{
		DataStore.BOOKING_ID = 
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
		.post() 
		.then()
		.log()
		.all()
		.statusCode(200)
		.extract()
		.jsonPath()
		.getInt("bookingid");
	}
	
	@Test(priority = 2)
	public void retrieveBooking()
	{
		Response response = 
				RestAssured
				.given()
				.log()
				.all()
				.get("https://restful-booker.herokuapp.com/booking/"+DataStore.BOOKING_ID)
				.then().log().all().extract().response();
	}

}
