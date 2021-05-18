package Payloads;

import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateNestedJsonOPbjects {
	
	public static void main(String[] args) {
		Map<String,Object> jsonObjectPayload = new LinkedHashMap<>();
		jsonObjectPayload.put("id", "1");
		jsonObjectPayload.put("first_name", "Amod");
		jsonObjectPayload.put("last_name", "Mahajan");
		jsonObjectPayload.put("married", "false");
		jsonObjectPayload.put("salary", "123.45");
		
		
		Map<String,Object> addressMap = new LinkedHashMap<String, Object>();
		addressMap.put("no", "#81");
		addressMap.put("streetName", "404 Not Found");
		addressMap.put("city", "BLR");
		addressMap.put("state", "KA");
		
		
		jsonObjectPayload.put("address", addressMap);
		
		RestAssured
		.given()
		.log()
		.all()
		.body(jsonObjectPayload)
		.get();
		
	}

}
