package com.namji.codingtest.level0;

public class ConvertString_to_Integer {
	public static void main(String[] args) {
		/*
		 * 문자열 s가 매개변수로 주어집니다.
		 * s는 (+,-)부호와 숫자로만 구성되어 있고,
		 * s를 정수로 변환하여 출력하는 문제입니다.
		 * "1234" > 1234 / "-1234" > 1234
		 */
		String s = "-1234";
		System.out.println(Integer.parseInt(s));
	}
}
