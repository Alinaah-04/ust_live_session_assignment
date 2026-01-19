package com;

import java.util.Scanner;

public class SumAndAvg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int avg = 0;
		System.out.println("enter the number of elements of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements of array");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<arr.length;i++)
		{
		sum = sum + arr[i];
		}
		System.out.println("Sum :" + sum);
		avg = sum / n;
		System.out.println("Average :" + avg);
		
	}

}
