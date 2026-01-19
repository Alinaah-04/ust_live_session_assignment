package com;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Calculator");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choice");
		int choice = sc.nextInt();
		System.out.println("enter number1");
		int a = sc.nextInt();
		System.out.println("enter number2");
		int b = sc.nextInt();
		
		
		switch(choice)
		{
		case 1:
			int sum = a + b;
			System.out.println("sum : "+sum);
			break;
		case 2:
			int sub = a - b;
			System.out.println("difference : "+sub);
			break;
		case 3:
			int mul = a * b;
			System.out.println("Product : "+mul);
			break;
		case 4:
			int div = a / b;
			System.out.println("division : "+div);
			break;
			default:
				System.out.println("invalid choice");
			
		}

	}

}
