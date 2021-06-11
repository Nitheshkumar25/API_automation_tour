package Payloads;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HandlingDynamicResponseUsingInstanceof {

	public static void main(String[] args) {
		
		Response response = 
		RestAssured.get("https://run.mocky.io/v3/74b1d9af-8ca6-4115-be30-7a0c14123f4a");
		Object responseAsObject = response.as(Object.class);
		if(responseAsObject instanceof List)
		{
			List responseAsList = (List)responseAsObject;
			System.out.println(responseAsList.size());
		}
		else if(responseAsObject instanceof Map)
		{
			Map responseAsMap = (Map)responseAsObject;
			System.out.println(((Map) responseAsObject).keySet());
		}
		
	}
}
