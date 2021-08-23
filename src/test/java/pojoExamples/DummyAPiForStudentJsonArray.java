package pojoExamples;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class DummyAPiForStudentJsonArray {
	
	public static void main(String[] args) {
		
		Student s1  = new Student();
		s1.setAccountNo(111);
		s1.setBalance(23.34);
		s1.setEmail("cdennerley0@uol.com.br");
		s1.setFirst_name("Amod");
		s1.setLast_name("mahajan");
		s1.setGender("Male");
		
		Student s2  = new Student();
		s2.setAccountNo(222);
		s2.setBalance(22.22);
		s2.setEmail("amodsd@uol.com.br");
		s2.setFirst_name("Rahul");
		s2.setLast_name("Singh");
		s2.setGender("Male");
		
		List<Student> jsonArrayStudent = new ArrayList<>();
		jsonArrayStudent.add(s1);
		jsonArrayStudent.add(s2);
		
		RestAssured
			.given()
			.log()
			.all()
			.body(jsonArrayStudent)
			.when()
			.get();
	}

}
