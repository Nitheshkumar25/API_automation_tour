package JsonPathExamples;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonPathForSimpleJsonArray2 {
	
	public static void main(String[] args) {
		String jsonArray = "[\r\n" + 
				"  [\r\n" + 
				"    \"10\",\r\n" + 
				"    \"20\",\r\n" + 
				"    \"30\",\r\n" + 
				"    \"40\",\r\n" + 
				"    \"50\"\r\n" + 
				"  ],\r\n" + 
				"  [\r\n" + 
				"    \"100\",\r\n" + 
				"    \"200\",\r\n" + 
				"    \"300\",\r\n" + 
				"    \"400\",\r\n" + 
				"    \"500\",\r\n" + 
				"    \"600\"\r\n" + 
				"  ]\r\n" + 
				"]";
		
		JsonPath jsonPath  = new JsonPath(jsonArray);
		System.out.println(jsonPath.getString("[1][2]"));
		System.out.println(jsonPath.getList("$").size());
		
		List<Object> internalList = (List<Object>) jsonPath.getList("$").get(1);
		System.out.println(internalList.size());
	}

}
