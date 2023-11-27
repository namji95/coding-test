package com.namji.codingtest;

import java.util.*;

public class Print_by_Pasting_a_String {
	public static void main(String[] args) {
		/*
		 * 문자열을 입력할 수 있는 매개변수 str1, str2가 주어집니다.
		 * java util 패키지의 Scanner를 이용하여 문자열 두개를 입력하고
		 * 출력은 두 문자열을 붙여서 출력하는 문제입니다.
		 * apple pen > applepen / Hello World! > HelloWorld!
		 */
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.print(a + b);
		sc.close();
	}
}
