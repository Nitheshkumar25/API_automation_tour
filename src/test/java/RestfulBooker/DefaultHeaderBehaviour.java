package RestfulBooker;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;

public class DefaultHeaderBehaviour {
	
	@Test
	public void defaultBehaviour()
	{
		RestAssured
			.given()
			.header("header1", "value1", "value2")
			//.header("header1", "value1")
			.log()
			.all()
		.when()
			.get();
	}
	
	@Test
	public void overwriteHeaderValue()
	{
		RestAssured
			.given()
			.config(RestAssuredConfig.config()
					.headerConfig(HeaderConfig
							.headerConfig()
							.overwriteHeadersWithName("header1", "header2")))
			
			.config(RestAssuredConfig.config()
					.headerConfig(HeaderConfig.headerConfig()
							.overwriteHeadersWithName("header1")))
			/*
			 * header1=value1
				header1=value2
				header3=value3
				header3=value4
				header2=value5
				header2=value6
			 */
			.header("header1","value1")
			.header("header1","value2")
			.header("header3","value3")
			.header("header3","value4")
			.header("header2","value5")
			.header("header2","value6")
			.log()
			.all()
		.when()
			.get();
	}

}
