package com;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println("value of a before swapped :" + a);
		System.out.println("value of b before swapped :" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("value of a after swapped :" + a);
		System.out.println("value of b after swapped :" + b);
	}

}
