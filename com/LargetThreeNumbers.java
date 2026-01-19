package com;

import java.util.Scanner;

public class LargetThreeNumbers {

	public static void main(String[] args) {
		System.out.println("enter 3 numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a > b && a> c)
		{
			System.out.println("a is larget");
		}
		else if(b > c)
		{
			System.out.println("b is larget");
		}
		else
		{
			System.out.println("c is largest");
		}

	}

}
