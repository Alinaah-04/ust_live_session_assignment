package com;

import java.util.Scanner;

public class MaxofTwoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number");
		int n = sc.nextInt();
		int m = sc.nextInt();

		int s = Max(n,m);
		System.out.println(s);
	}


public static int Max(int n,int m)
{
	if(m>n)
	{
		return m;
	}
	else
	{
		return n;
	}
}

}