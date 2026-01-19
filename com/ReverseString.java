package com;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s =sc.next();
		String t ="";
		for(int i = s.length() - 1 ;i>=0;i--)
		{
			char ch = s.charAt(i);
			t = t + ch;
		}
		System.out.println("Reversed String : " + t);

	}

}
