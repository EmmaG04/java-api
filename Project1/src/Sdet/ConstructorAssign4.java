package Sdet;

public class ConstructorAssign4 {
	
	public ConstructorAssign4() {
		this(1,2,3);
		System.out.println("Default constructor");
		
	}
	
	public ConstructorAssign4(int a) {
		this();
		System.out.println("One parametized constructor");
		
	}
	
    public ConstructorAssign4(int a, int b) {
    	this(1);
    	System.out.println("Two parametized constructor");
    	
	}
    
    public ConstructorAssign4(int a, int b, int c) {
    	System.out.println("Three parametized constructor");
		
	}
    
    public ConstructorAssign4(int a, int b, int c, int d) {
    	this(1,2);
    	System.out.println("Four parametized constructor");
		
	}
    
    public static void main(String[] args) {
		
		ConstructorAssign4 obj = new ConstructorAssign4(1,2,3,4);
	
	}
	

}
