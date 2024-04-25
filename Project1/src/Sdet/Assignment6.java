package Sdet;

//Inheritance - use of super and this in constructor
public class Assignment6 {
	
	Assignment6() {
		this(1,2,3);
		System.out.println("Parent default constructor");

	}
	
	Assignment6(int a) {
		this();
		System.out.println("Parent one parametized constructor");

	}
	
	Assignment6(int a, int b) {
		this(1);
		System.out.println("Parent two parametized constructor");

	}
	
	Assignment6(int a, int b, int c) {
		System.out.println("Parent three parametized constructor");

	}

}
