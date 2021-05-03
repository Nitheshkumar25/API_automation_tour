package JsonPathExamples;

import org.hamcrest.Matchers;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
public class InlineAssertionsForArrays {
	
	public static void main(String[] args) {
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/booking")
			.when()
				.get()
			.then()
				.log()
				.all()
				.body("bookingid",Matchers.hasItems(91,10));
				
		
	}

}
