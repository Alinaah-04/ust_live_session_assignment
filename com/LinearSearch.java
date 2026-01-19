package com;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		System.out.println("enter  number of element");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter element to search");
		int s = sc.nextInt();
		int a[] = new int[n];
		int count = 0;
		System.out.println("enter the elements of array");
		for(int i =0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i =0;i<a.length;i++)
		{
			if(a[i] == s)
			{
				count++;
			}
			
		}
			
		
		if(count == 0)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found");
		}

	}

}
