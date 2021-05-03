package JsonPathExamples;

import org.testng.annotations.Test;

import io.restassured.internal.path.json.JSONAssertion;
import io.restassured.path.json.JsonPath;

public class JsonPathNonExistence {

	@Test
	public void jsonPathDemo1()
	{
		String json = "{\r\n" + 
				"  \"firstname\": \"Amod\",\r\n" + 
				"  \"lastname\": \"Brown\"\r\n" + 
				"}";
		
		// Get JSON Path instance of given json document
		JsonPath jsonPath = new JsonPath(json);
		//int firstName = jsonPath.getInt("firstname1");
		
		//System.out.println(firstName);
		
		System.out.println((Object)jsonPath.get("$"));
		System.out.println(jsonPath.getString("$"));
		System.out.println((Object)jsonPath.get());
		System.out.println(jsonPath.getString(""));
		
		
	}
}
