package Sdet;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: " );
		number = sc.nextInt();
		System.out.println("The factorial of entered number is: " + factorial(number));
		
	}
	
	public static int factorial(int n) {
		if( n ==1) {
			return 1;
		}
		return n * factorial(n-1);
	}

}
