package Sdet;

/** 
 * Compile time/Static/Method Overloading Polymorphism
 * method name - same 
 * method input parameter- always diff 
 * method output parameter- same or diff
 **/

public class Assignment10 {
	
	public void sum(int a, int b)
	{
		int c = a + b;
		System.out.println("The sum is " + c);
		
	}
	
	public void sum(int x, int y, int z) {
		int s = x + y + z;
		System.out.println("The sum is " + s);
			
	}
	
	public void sum(int a, float b) {
		float c = a + b;
		System.out.println("The sum is " + c);
	}
	
	public int sum(int x, int y, int z, int v) {
		int s = x + y + z + v;
		System.out.println("The sum is " + s);
		return s;
	}
	
	public static void main(String[] args) {
		Assignment10 assign = new Assignment10();
		assign.sum(5, 8);
		assign.sum(6, 6f);
		assign.sum(3, 4, 9);
		assign.sum(4, 6, 3, 0);
	}

}
