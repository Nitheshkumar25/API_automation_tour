package Payloads;

import java.util.List;
import java.util.Map;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HandlingDynamicJsonResponse {
	
	public static void main(String[] args) {
//		Response response = 
//				RestAssured.get("https://run.mocky.io/v3/74b1d9af-8ca6-4115-be30-7a0c14123f4a");
//		Map responseasMap = response.as(Map.class);
//		System.out.println(responseasMap.keySet());
		
		// Exception in thread "main" com.fasterxml.jackson.databind.exc
		//.MismatchedInputException: Cannot deserialize instance 
		//of `java.util.LinkedHashMap<java.lang.Object,java.lang.Object>` 
		//out of START_ARRAY token
		
		Response response = 
				RestAssured.get("https://run.mocky.io/v3/268f4f8d-578f-40f3-9bd9-12c0b205bf08");
		List responseAsList = response.as(List.class);
		System.out.println(responseAsList.size());
		
		//Exception in thread "main" com.fasterxml.jackson.databind.exc
		//.MismatchedInputException: Cannot deserialize instance 
		// of `java.util.ArrayList<java.lang.Object>` out of START_OBJECT token

	}

}
