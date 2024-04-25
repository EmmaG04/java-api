package Sdet;

import java.util.Scanner;

public class ConditionWithLoop {
	
	public static void main(String[] args) {
		
		int number, even;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, Enter your number");
		number = sc.nextInt();
		if(number > 0) {
		for(int i = 1; i <= number; i++) {
			 even = i  % 2;
			if (even == 0) {
				System.out.println(i);
			}
	
		}
		
		}
	}
}
