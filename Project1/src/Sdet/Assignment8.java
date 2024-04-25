package Sdet;

//Inheritance - use of super and this in method
public class Assignment8 {
	
	public void Assignment() {
		System.out.println("Parent default method");

	}
	
	public void Assignment(int a) {
		this.Assignment(1,2);
		this.Assignment();
		this.Assignment(1,2,3);
		System.out.println("Parent one parametized method");

	}
	
	public void Assignment(int a, int b) {
		System.out.println("Parent two parametized method");

	}
	
	public void Assignment(int a, int b, int c) {
		
		System.out.println("Parent three parametized method");

	}

}
