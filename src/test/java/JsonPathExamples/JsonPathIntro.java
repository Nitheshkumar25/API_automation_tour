package JsonPathExamples;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPathIntro {

	@Test
	public void jsonPathDemo()
	{
		String json = "{\r\n" + 
				"  \"firstname\": \"123\",\r\n" + 
				"  \"lastname\": \"Brown\"\r\n" + 
				"}";
		
		// Get JSON Path instance of given json document
		JsonPath jsonPath = new JsonPath(json);
		String firstName = jsonPath.getString("firstname");
		
		System.out.println(firstName);
		
		Object fname = jsonPath.get("firstname");
		System.out.println(fname);
		
//		int i = jsonPath.get("firstname");
//		System.out.println(i);
		
		String s = "123";
		System.out.println(Integer.parseInt(s));
	}
}
