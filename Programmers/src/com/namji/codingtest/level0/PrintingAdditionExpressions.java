package com.namji.codingtest.level0;

import java.util.Scanner;

public class PrintingAdditionExpressions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a + b));
		sc.close();
	}
}
