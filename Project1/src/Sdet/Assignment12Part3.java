package Sdet;

import java.util.Scanner;

public class Assignment12Part3 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int num;
		System.out.println("Please, enter the prime number");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		int count = 0;
		if (num > 1) {
			for(int i = 1; i <= num; i++)
			{
				if(num%i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("It is a prime number");
			}
			else {
					System.out.println("It is not a prime number");
			}
			
			}
		else
		{
			System.out.println("It is not a prime number");
		}
			
	}

}
