package Sdet;

public class Student2 {
	
	int rollNo;
	int age;
	
	public void display1() {
		System.out.println("Welcome to all of you!");
	}
	
	public void display2() {
		System.out.println("Automation is very easy.");
	}
	
	public static void main(String[] args) {
		Student2 student = new Student2();
		student.display1();
		student.display2();
		
		student.rollNo = 4;
		student.age = 20;
		
		System.out.println("The roll number of student is " + student.rollNo + ".");
		System.out.println("The age of student is " + student.age + ".");
		
	}
	

}
