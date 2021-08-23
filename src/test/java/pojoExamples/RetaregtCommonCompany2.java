package pojoExamples;

public class RetaregtCommonCompany2 {

	public static void main(String[] args) {
		
		Employee2 rahul = new Employee2();
		rahul.setId(10);
		rahul.setDeptId(100);
		rahul.setAddress("KA");
		rahul.setGender("male");
		rahul.setMobNo("432353453");
		
		Employee2 animesh = new Employee2();
		animesh.setId(20);
		animesh.setDeptId(200);
		animesh.setAddress("DEL");
		animesh.setGender("male");
		animesh.setMobNo("435");
		
		System.out.println(rahul.getId());
		System.out.println(animesh.getId());
		
	}
}
