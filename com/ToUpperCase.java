package com;

import java.util.Scanner;

public class ToUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s =sc.nextLine();
		String t =s.toUpperCase();
		System.out.println(t);

	}

}
