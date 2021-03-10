package RestfulBooker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;

public class HeadersExample {
	
	@Test
	public void passHeader()
	{
		RestAssured
			.given()
			.log()
			.all()
			.header("Header1", "value1")
			.header("Header2", "value1", "value2","value3")
		.when()
		.get();
	}
	
	@Test
	public void passHeader1()
	{
		RestAssured
			.given()
			.log()
			.all()
			.header("Header1", "value1")
			.header("Header1", "value2")
		.when()
		.get();
	}
	
	@Test
	public void passHeader2()
	{
		Header header = new Header("Header1", "value1");
		RestAssured
			.given()
			.log()
			.all()
			.header(header)
		.when()
		.get();
	}
	
	@Test
	public void passHeader3()
	{
		//Header header = new Header("Header1", "value1");
		RestAssured
			.given()
			.log()
			.all()
			.headers("h1","v1","h2","v2","h3","v3", "h3","v4")
		.when()
		.get();
	}
	
	@Test
	public void passHeader4()
	{
		
		List<Header> allHeaders = new ArrayList<>();
		Header header = new Header("Header1", "value1");
		Header header1 = new Header("Header2", "value2");
		allHeaders.add(header);
		allHeaders.add(header1);
		
		Headers headers = new Headers(allHeaders);
		
		RestAssured
			.given()
			.log()
			.all()
			.headers(headers)
		.when()
		.get();
	}
	
	@Test
	public void passHeader5()
	{
		Map<String,String> headerMap = new HashMap<>();
		headerMap.put("h1", "v1");
		headerMap.put("h2", "v2");
		headerMap.put("h3", "v3");
		headerMap.put("h3", "v4");
		
		RestAssured
			.given()
			.log()
			.all()
			.headers(headerMap)
		.when()
		.get();
	}

}
