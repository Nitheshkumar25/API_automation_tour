package JsonPathExamples;

import io.restassured.path.json.JsonPath;

public class JsonPathForNestedJsonObject {
	
	public static void main(String[] args) {
		String jsonObject = "{\r\n" + 
				"  \"firstName\" : \"amod\",\r\n" + 
				"  \"lastName\" : \"mahajan\",\r\n" + 
				"  \"age\" : 28,\r\n" + 
				"  \"address\" : {\r\n" + 
				"    \"flatNo\" : 401,\r\n" + 
				"    \"buildingName\" : \"ABC\",\r\n" + 
				"    \"streetName\" : \"XYZ\",\r\n" + 
				"    \"pin\" : 123456\r\n" + 
				"  },\r\n" + 
				"  \"salary\" : 10.50,\r\n" + 
				"  \"married\" : false\r\n" + 
				"}";
		
		JsonPath jp = new JsonPath(jsonObject);
		int fn = jp.getInt("address.flatNo");
		System.out.println(fn);
		
		Object obj = jp.get("address");
		System.out.println(obj);
		
	}
	
	
	

}
