package MockData;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class Dummy {
	
	public static void main(String[] args) {
		
		RestAssured.get("https://run.mocky.io/v3/da0f257e-9dd6-4507-8bf5-e835a1e23457")
		.then().body("salary", Matchers.greaterThan(0));
	}

}
