package Sdet;

public class ConstructorAssign5 {
	
	public void method() {
		this.method4(1,2,3,4);
		System.out.println("Default method");
	}
	
	public void method1(int a) {
		this.method();
		System.out.println("One parametized method");
	}
	
	public void method2(int a, int b) {
		this.method1(2);
		System.out.println("Two parametized method");
	}
	
	public void method3(int a, int b, int c) {
		System.out.println("Three parametized method");
	}
	
	public void method4(int a, int b, int c, int d) {
		this.method3(1,2,3);
		System.out.println("Four parametized method");
	}
	
	public static void main(String[] args) {
		ConstructorAssign5 obj = new ConstructorAssign5();
		obj.method2(1, 2);
		
	}

}
