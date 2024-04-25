package Sdet;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Please, Enter your number");
		int num = scn.nextInt();
		int orig_num = num;
		int rev = 0;
		
		while(num!= 0)
		{
			rev = rev * 10 + num % 10; 
			num = num/10;
		}
		
		if( orig_num == rev) {
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("It is not a palindrome number");
		}
		
	}

}
