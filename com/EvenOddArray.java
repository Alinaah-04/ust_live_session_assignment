package com;

import java.util.Scanner;

public class EvenOddArray {

	public static void main(String[] args) {
		System.out.println("enter  number of element");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int even =0;
		int odd = 0;
		System.out.println("enter the elements of array");
		for(int i =0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i =0;i<a.length;i++)
		{
		if(a[i] %2 == 0)
		{
			even++;
		}
		else
		{
			odd++;
		}
		
	}
		System.out.println("no of even : " + even);
		System.out.println("no of odd : " + odd);
	}
}


