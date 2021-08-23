package pojoExamples;

import io.restassured.RestAssured;

public class DummyAPiForStudent {
	
	public static void main(String[] args) {
		
		Student s1  = new Student();
		s1.setAccountNo(111);
		s1.setBalance(23.34);
		s1.setEmail("cdennerley0@uol.com.br");
		s1.setFirst_name("Amod");
		s1.setLast_name("mahajan");
		s1.setGender("Male");
		
		
		RestAssured
			.given()
			.log()
			.all()
			.body(s1)
			.when()
			.get();
	}

}
