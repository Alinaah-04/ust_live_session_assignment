package com;

import java.util.Scanner;

public class Fibannocci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int a = 0;
		int b=1;
		if(n==0)
		{
			System.out.println(a);
		}
		else if(n==1)
		{
			System.out.println(a +" "+b);
			
		}
		else
		{
			System.out.println(a);
			System.out.println(b);
			for(int i =3;i<=n;i++)
			{
				int c = a + b;
				a = b;
				b = c;
				System.out.println(c);
			}
		}

	}

}
