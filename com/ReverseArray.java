package com;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		System.out.println("enter  number of element");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the elements of array");
		for(int i =0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i =a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
