package pojoExamples.nestedJsonObjects;

import io.restassured.RestAssured;

public class CreateNestedJsonObjectPayload {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setFirstName("Amod");
		employee.setLastName("Mahajan");
		employee.setProfession("Software Tester");
		
		Address address = new Address();
		address.setHouseNo(404);
		address.setStreetName("Not found");
		address.setCity("Bengaluru");
		address.setState("KA");
		address.setCountry("IN");
		
		employee.setAddress(address);
				
		
		RestAssured.given().log().all()
		.body(employee)
		.post();
		
	}

}
