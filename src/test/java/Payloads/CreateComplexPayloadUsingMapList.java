package Payloads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateComplexPayloadUsingMapList {
	
	public static void main(String[] args) {
		
		// Parent JSON Array
		List<Map<String,Object>> finalPayload = new ArrayList<Map<String,Object>>();
		
		Map<String,Object> firstJsonObject = new LinkedHashMap<String, Object>();
		firstJsonObject.put("id", 1);
		firstJsonObject.put("first_name", "Claire");
		firstJsonObject.put("last_name", "Dennerley");
		firstJsonObject.put("email", "cdennerley0@uol.com.br");
		firstJsonObject.put("gender", "Male");
		
//		List<String> mobileNo = new ArrayList<String>();
//		mobileNo.add("1232432432");
//		mobileNo.add("324324324");
		
		List<String> mobileNo = Arrays.asList("1232432432","324324324");
		
		firstJsonObject.put("mobile", mobileNo);
		
		Map<String,Object> skillSet1 = new HashMap<String, Object>();
		skillSet1.put("name", "Testing");
		skillSet1.put("proficiency", "Medium");
		
		firstJsonObject.put("skills",skillSet1);
		
		
		
		Map<String,Object> secondJsonObject = new LinkedHashMap<String, Object>();
		secondJsonObject.put("id", 2);
		secondJsonObject.put("first_name", "Cloe");
		secondJsonObject.put("last_name", "Stuehmeyer");
		secondJsonObject.put("email", "cstuehmeyer1@yellowpages.com");
		secondJsonObject.put("gender", "Female");
		
		List<Map<String,Object>> skillsList = new LinkedList<Map<String,Object>>();
		skillsList.add(skillSet1);
		
		Map<String,Object> javaSkill = new HashMap<String, Object>();
		javaSkill.put("name","Java");
		javaSkill.put("proficiency","Medium");
		
		List<String> allCert = Arrays.asList("OCJP 11","OCJP 12");
		
		javaSkill.put("certiciations", allCert);
		
		skillsList.add(javaSkill);
		
		secondJsonObject.put("skills", skillsList);
		
		
		finalPayload.add(firstJsonObject);
		finalPayload.add(secondJsonObject);

		
		
		RestAssured.given().log().all().body(finalPayload).get();
		
		
	}

}
