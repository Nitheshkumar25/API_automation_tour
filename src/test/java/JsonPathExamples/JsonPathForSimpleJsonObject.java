package JsonPathExamples;

import io.restassured.path.json.JsonPath;

public class JsonPathForSimpleJsonObject {
	
	public static void main(String[] args) {
		String jsonObject = "{\r\n" + 
				"  \"firstName\" : \"amod\",\r\n" + 
				"  \"lastName\" : \"mahajan\",\r\n" + 
				"  \"age\" : 28,\r\n" + 
				"  \"address\" : \"Bengaluru\",\r\n" + 
				"  \"salary\" : 10.50,\r\n" + 
				"  \"married\" : false\r\n" + 
				"}";
		
		JsonPath jp = new JsonPath(jsonObject);
		String firstName = jp.getString("firstName");
		System.out.println(firstName);
		
		int age = jp.getInt("age");
		System.out.println(age);
		
		boolean married = jp.getBoolean("married");
		System.out.println(married);
		
		float salary = jp.getFloat("salary");
		System.out.println(salary);
		
		double salaryd = jp.getDouble("salary");
		System.out.println(salaryd);
	}
	
	
	

}
