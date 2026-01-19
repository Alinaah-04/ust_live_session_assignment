package com;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s =sc.next();
		String m = s;
		String t ="";
		for(int i = s.length() - 1 ;i>=0;i--)
		{
			char ch = s.charAt(i);
			t = t + ch;
		}
		if(t.equals(m))
			{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println(" not palindrome");
		}
	}


}
