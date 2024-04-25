package Sdet;

/** 
 * Run time/Dynamic/Method Overriding Polymorphism
 * method name - same 
 * method input parameter- always diff 
 * method output parameter- same or diff
 * Here it shows the sum()-overriding method is called instead of parent method
 **/

public class Assignment11 extends Assignment10 {
	
	public void sum( int a, int b) {
		int c = a - b ;
		System.out.println("The result of subtraction is " + c);
	}
	
	
	public static void main(String[] args) {
		Assignment11 assign = new Assignment11();
		assign.sum(9, 3);
		
	}

}
