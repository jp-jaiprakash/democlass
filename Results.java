package models;

public class Results {
	
	public static void main(String[] args) {
		
		// create a new object
		Student student1= new Student();
		
		student1.marks=10;
		student1.name="Jai";
		
		
Student student2= new Student();
		
		student2.marks=15;
		student2.name="Veeru";
		
		getResult(student2);
		getResult(student1);
		
		System.out.println(student1.name+" result is::"+student1.result);
		System.out.println(student2.name+" result is::"+student2.result);
		
	}
	
	public static void getResult(Student student) {
		if(student.marks < 11) {
			student.result= "Fail";
		}else {
			student.result ="Pass";
		}
	}

}
