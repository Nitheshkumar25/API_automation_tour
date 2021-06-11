package Payloads;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class ConvertJsonArrayResponsToList {
	// Demo D = new Demo();
	// List<Map<String<Object>>
	public static void main(String[] args) {
		List<Map<String, Object>> allEmp = 
		RestAssured
		.get("https://run.mocky.io/v3/7db4566c-3f45-4ad9-a779-b48dbe5a7947")
		//.as(List.class);
		//.as(List<Map<String,Object>>.class); // This is not possible
		.as(new TypeRef<List<Map<String,Object>>>(){});
		
		System.out.println(allEmp.size());
		
		Map<String,Object> emp1 = allEmp.get(0);
		System.out.println(emp1.get("first_name"));
		
		//Map<String,Object> emp1 = (Map<String, Object>) allEmp.get(0);
		//System.out.println(emp1.get("first_name"));
		
	}
}
