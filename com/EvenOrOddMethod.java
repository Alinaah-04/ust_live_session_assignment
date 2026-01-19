package com;

import java.util.Scanner;

public class EvenOrOddMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		CheckOddEven(n);

	}


public static void CheckOddEven(int n)
{
	if(n % 2 == 0)
	{
	System.out.println("even");	
	}
	else
	{
		System.out.println("odd");
	}

}
}