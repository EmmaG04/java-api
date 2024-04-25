package Sdet;

public class Assignment3 {
	
	//((((10+2)+2)-2)*2/2)
	//((((10/2)-2)+2)-2/2)
	
	public int sum(int a, int b) {
		
		return a+b;
		
	}
	
	public int substract(int x1, int x2) {
		
		return x1-x2;
	}
	
	public int multiply(int y1, int y2) {
		
		return y1*y2;
	}
	
	public int division(int z1, int z2) {
		
		return z1/z2;
	}
	
	public static void main(String[] args) {
		Assignment3 cal = new Assignment3();
		int sum1 = cal.sum(10, 2);
		int sum2 = cal.sum(sum1, 2);
		int sub1 = cal.substract(sum2,2);
		int mult1 = cal.multiply(sub1, 2);
		int div1 = cal.division(mult1, 2);
		System.out.println("The final output is " + div1 + ".");
		
		
		int div2 = cal.division(10, 2);
		int sub2 = cal.substract(div2,2);
		int sum3 = cal.sum(sub2, 2);
		int sub3 = cal.substract(sum3,2);
		int div3 = cal.division(sub3, 2);
		System.out.println("The final output is " + div3 + ".");
		
		
		
	}

}
