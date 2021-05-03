package JsonPathExamples;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;


public class WithoutInlineAssertions {
	
	public static void main(String[] args) {
		
		String jsonResponse = "";
		
		jsonResponse = 	RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/auth")
				.body("{\r\n" + 
						"    \"username\" : \"admin\",\r\n" + 
						"    \"password\" : \"password123\"\r\n" + 
						"}")
				.contentType(ContentType.JSON)
			.when()
				.post()
			.then()
				.log()
				.all()
				.extract()
				.asString();
		JsonPath jsonPath = new JsonPath(jsonResponse);
		Assert.assertNull(jsonPath.get("token"));
		
	}

}
