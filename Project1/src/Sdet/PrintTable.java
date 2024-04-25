package Sdet;

import java.util.Scanner;

public class PrintTable {
	
	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		number = sc.nextInt();
		System.out.println("Please enter the range");
		int range = sc.nextInt();
		
		for (int i=1; i<=range; i++)
		{
			System.out.println(number + " * " + i + "  = " + number*i);
		}
		
	}

}
