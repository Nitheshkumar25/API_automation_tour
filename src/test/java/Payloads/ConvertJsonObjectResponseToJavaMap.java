package Payloads;

import java.util.Map;

import io.restassured.RestAssured;

public class ConvertJsonObjectResponseToJavaMap {
	
	public static void main(String[] args) {
		
		Map jsonResponseAsMap = RestAssured
		.get("https://run.mocky.io/v3/4c28d457-e687-46db-b33c-305de5953507")
		.as(Map.class);
		
		String firstname = (String) jsonResponseAsMap.get("first_name");
		System.out.println(firstname);
		jsonResponseAsMap.keySet().forEach(k -> System.out.println(k));
		
	}

}
