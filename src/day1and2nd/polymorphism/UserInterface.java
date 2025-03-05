package day1and2nd.polymorphism;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student(138,"Noor","Gen","B.Tech","Male",108000);
		
		//s.setStudentId(128);
		
		System.out.printf("\n%-15s : %s", "Student Id", s.getStudentId());
		System.out.printf("\n%-15s : %s", "Student Name", s.getStudentName());
		System.out.printf("\n%-15s : %s", "Category", s.getCategory());
		System.out.printf("\n%-15s : %s", "Department ", s.getDepartment());
		System.out.printf("\n%-15s : %s", "Gender", s.getGender());
		System.out.printf("\n%-15s : %s", "College Fee", s.getCollegeFee());
		
	}

}
