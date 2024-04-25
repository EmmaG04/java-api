package Sdet;

//Inheritance - use of super and this in constructor
public class Assignment7 extends Assignment6 {
	
	public Assignment7() {
		super(1,2);
		System.out.println("Child default constructor");
	}

	public Assignment7(int a) {
		this(1,2,3);
		System.out.println("Child one parametized constructor");
	}
	
	public Assignment7(int a, int b) {
		this();
		System.out.println("Child two parametized constructor");
	}
	
	public Assignment7(int a, int b, int c) {
		this(1,2);
		System.out.println("Child three parametized constructor");
	}
	
	public static void main(String[] args) {
		Assignment7 ob = new Assignment7(6);
		
	}
}
