package com;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		System.out.println("enter  number of element");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int temp =0;
		System.out.println("enter the elements of array");
		for(int i =0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i =0;i<a.length;i++)
		{
			for(int j = 0;j<i;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
