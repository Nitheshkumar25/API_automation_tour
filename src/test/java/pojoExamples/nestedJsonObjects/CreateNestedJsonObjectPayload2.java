package pojoExamples.nestedJsonObjects;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class CreateNestedJsonObjectPayload2 {
	
	public static void main(String[] args) {
		
		Employee2 employee = new Employee2();
		employee.setFirstName("Amod");
		employee.setLastName("Mahajan");
		employee.setProfession("Software Tester");
		
		
		Address address = new Address();
		address.setHouseNo(404);
		address.setStreetName("Not found");
		address.setCity("Bengaluru");
		address.setState("KA");
		address.setCountry("IN");
		
		Address address2 = new Address();
		address2.setHouseNo(204);
		address2.setStreetName("Not Prsent");
		address2.setCity("Delhi");
		address2.setState("DL");
		address2.setCountry("IN");
		
		List<Address> allAddresses = new ArrayList<>();
		allAddresses.add(address);
		allAddresses.add(address2);
		
		employee.setAddress(allAddresses);
				
		
		RestAssured.given().log().all()
		.body(employee)
		.post();
		
	}

}
