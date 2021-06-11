package Payloads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateSimpleJsonArrays {
	
	public static void main(String[] args) {
		Map<String, Object> empDetails = new HashMap<String, Object>();
		empDetails.put("id", 1);
		empDetails.put("first_name", "Claire");
		empDetails.put("last_name", "Dennerley");
		empDetails.put("email", "cdennerley0@uol.com.br");
		empDetails.put("gender", "Male");
		
		Map<String, Object> empDetails2 = new HashMap<String, Object>();
		empDetails2.put("id", 2);
		empDetails2.put("first_name", "Cloe");
		empDetails2.put("last_name", "Stuehmeyer");
		empDetails2.put("email", "cstuehmeyer1@yellowpages.com");
		empDetails2.put("gender", "Female");
		
		List<Map<String,Object>> allEmp = new ArrayList<>();
		allEmp.add(empDetails);
		allEmp.add(empDetails2);
		
		RestAssured
			.given()
			.log()
			.all()
			.body(allEmp)
			.get();
		
		
	}

}
