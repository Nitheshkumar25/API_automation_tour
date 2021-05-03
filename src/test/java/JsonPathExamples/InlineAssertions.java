package JsonPathExamples;

import org.hamcrest.Matchers;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;


public class InlineAssertions {
	
	public static void main(String[] args) {
		RestAssured
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
				.body("token",Matchers.notNullValue())
				.body("token.length()", Matchers.is(15))
				.body("token.length()", Matchers.equalTo(15))
				.body("token", Matchers.matchesRegex("^[a-z0-9]+$"));
		
	}

}
