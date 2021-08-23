package pojoExamples;

public class RetaregtCommonCompany {

	public static void main(String[] args) {
		
		Employee rahul = new Employee();
		rahul.id = 10;
		rahul.deptId = 100;
		rahul.address = "KA";
		rahul.gender = "male";
		rahul.mobNo  = "432353453";
		
		Employee animesh = new Employee();
		animesh.id = 20;
		animesh.deptId = 200;
		animesh.address = "DEL";
		animesh.gender = "male";
		animesh.mobNo  = "45657657";
		
		System.out.println(rahul.id);
		System.out.println(animesh.id);
		
	}
}
