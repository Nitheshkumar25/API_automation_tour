package Payloads;

import java.util.Map;

import io.restassured.RestAssured;

public class ConvertNestedJsonObjectResponseToJavaMap {
	
	public static void main(String[] args) {
		
		Map jsonResponseAsMap = RestAssured
		.get("https://run.mocky.io/v3/1732fc78-94f3-4728-996a-23c5d9877c06")
		.as(Map.class);
		
		String firstname = (String) jsonResponseAsMap.get("first_name");
		System.out.println(firstname);
		
		
		Map<String,String> skillsMap = 
				(Map<String,String>)jsonResponseAsMap.get("skills");
		System.out.println(skillsMap.get("name"));
		System.out.println(skillsMap.get("proficiency"));
		
	}

}
