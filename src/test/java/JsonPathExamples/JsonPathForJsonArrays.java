package JsonPathExamples;

import io.restassured.path.json.JsonPath;

public class JsonPathForJsonArrays {
	
	public static void main(String[] args) {
		String jsonArray = "[\r\n" + 
				"  {\r\n" + 
				"    \"firstName\": \"amod\",\r\n" + 
				"    \"lastName\": \"mahajan\",\r\n" + 
				"    \"age\": 28,\r\n" + 
				"    \"address\": [\r\n" + 
				"      {\r\n" + 
				"        \"city\": \"Benagluru\",\r\n" + 
				"        \"country\": \"India\"\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"city\": \"Delhi\",\r\n" + 
				"        \"country\": \"India\"\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"city1\": \"Delhi1\",\r\n" + 
				"        \"country1\": \"India1\"\r\n" + 
				"      }\r\n" + 
				"    ]\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"firstName\": \"Mukesh\",\r\n" + 
				"    \"lastName\": \"Otwani\",\r\n" + 
				"    \"age\": 31,\r\n" + 
				"    \"address\": [\r\n" + 
				"      {\r\n" + 
				"        \"city\": \"Bhopal\",\r\n" + 
				"        \"country\": \"India\"\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"city\": \"Delhi\",\r\n" + 
				"        \"country\": \"India\"\r\n" + 
				"      }\r\n" + 
				"    ]\r\n" + 
				"  }\r\n" + 
				"]";
		
		JsonPath jsonPath = new JsonPath(jsonArray);
		String city1 = jsonPath.getString("[0].address[1].city");
		System.out.println(city1);
		
		String city2 = jsonPath.getString("[1].address[0].city");
		System.out.println(city2);
		
		System.out.println(jsonPath.getList("[0].address.city"));
		System.out.println(jsonPath.getList("address.city"));
	}

}
