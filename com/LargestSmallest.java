package com;

import java.util.Scanner;

public class LargestSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements of array");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int largest = arr[0];
		int smallest = arr[0];
		for(int i = 0;i< arr.length;i++)
		{
			if(arr[i] > largest)
			{
				largest = arr[i];
			}
			if(arr[i]< smallest)
			{
				smallest = arr[i];
			}
		}
		System.out.println("Largest is:" + largest);
		System.out.println("Smallest is:" + smallest);
		
		

	}

}
