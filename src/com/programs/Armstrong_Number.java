package com.programs;

import java.util.Scanner;

public class Armstrong_Number {
			
	public static void main(String[] args) {
		
	
		int n, a, i=0, j=0, c=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		n = input.nextInt();
		
		a = n;
		
		while (a>0) {
			
			i = a % 10;
			j = j + (i*i*i);
			a = a / 10;
			
		}
		
		if (n == j) {
			
			System.out.println("Armstrong number");
			c++;
			System.out.println("Count"+c);
			
			
		} else {
			System.out.println("Not a Armstrong number");
		}
		
		
		}


}
