package DataShare;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetBookingDetails {
	
	@Test
	public void getBooking(ITestContext context)
	{
				RestAssured
				.given()
				.log()
				.all()
				.get("https://restful-booker.herokuapp.com/booking/"+context.getAttribute("bookingId"))
				.then().log().all().extract().response();
	}

}
