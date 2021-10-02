package com.programs;

public class Ascending_Order {

	public static void main(String[] args) {

		int b;

		int a[] = { 10, 4, 5, 2, 6 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					b = a[i];
					a[i] = a[j];
					a[j] = b;

				}

			}

		}
		
		
		System.out.println("Ascending Order");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
			
		}
		

	}

}
