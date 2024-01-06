package com.namji.codingtest.level0;

public class Even_and_OddNumbers {
	public static void main(String[] args) {
		/*
		 * 정수 num이 매개변수로 주어집니다.
		 * num이 짝수면 Even, 홀수면 Odd를 출력하는 문제입니다.
		 * 3 > "Odd" / 4 > "Even"
		 */
		int num = 4;
		System.out.println(num % 2 == 0 ? "Even" : "Odd");
//		if (num % 2 == 0) {
//			String answer = "Even";
//		} else {
//			String answer = "Odd";
//		}
//		System.out.println(answer);
	}
}
