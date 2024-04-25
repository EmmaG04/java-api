package Sdet;

// Inheritance - use of super and this in method
public class Assignment9 extends Assignment8 {
	
	public void Assignment1() {
		
		System.out.println("Child default method");
	}

	public void Assignment2(int a) {
		System.out.println("Child one parametized method");
	}
	
	public  void  Assignment3(int a, int b) {
		super.Assignment(1);
		System.out.println("Child two parametized method");
	}
	
	public  void  Assignment4(int a, int b, int c) {
		this.Assignment3(1,2);
		this.Assignment2(1);
		this.Assignment1();
		System.out.println("Child three parametized method");
	}
	
	public static void main(String[] args) {
		Assignment9 ob = new Assignment9();
		ob.Assignment4(1,2,3);
	}

}
