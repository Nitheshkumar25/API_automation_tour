package DataShare;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestModuleTwoWithThreadLocalDatamap {
	
	@Test(priority = 1)
	public void createBooking()
	{
		int id = 
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
		
		DataStoreAsMap.setValue(Constants.BOOKING_ID, id);
		System.out.println("Thread ID is ----> "+ Thread.currentThread().getId()+
				"Created booking id ---> "+DataStoreAsMap.getValue(Constants.BOOKING_ID));
	}
	
	@Test(priority = 2)
	public void retrieveBooking() throws InterruptedException
	{
		Thread.sleep(20000);
		System.out.println("Thread ID is ----> "+ Thread.currentThread().getId()+
				"Retrieved booking id ---> "+DataStoreAsMap.getValue(Constants.BOOKING_ID));
		int id = (int) DataStoreAsMap.getValue(Constants.BOOKING_ID);
		Response response = 
				RestAssured
				.given()
				.log()
				.all()
				.get("https://restful-booker.herokuapp.com/booking/"+id)
				.then().log().all().extract().response();
	}

}
