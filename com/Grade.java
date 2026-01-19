package com;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		System.out.println("enter 3 marks");
		Scanner sc = new Scanner(System.in);
		double m1 = sc.nextInt();
		double m2 = sc.nextInt();
		double m3 = sc.nextInt();
		double total = m1 + m2 + m3;
		double avg = total/3;
		System.out.println(total);
		System.out.println(avg);
		if(avg>=90)
		{
			System.out.println("A");
		}
		else if(avg>=75)
		{
			System.out.println("B");
		}
		else if(avg>=60)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}
