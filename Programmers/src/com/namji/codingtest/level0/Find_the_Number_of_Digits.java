package com.namji.codingtest.level0;

public class Find_the_Number_of_Digits {
	public static void main(String[] args) {
		/*
		 * 자연수 N이 매개변수로 주어집니다.
		 * 123 > 6 / 987 > 24
		 */
		int n = 123;
		int answer = 0;
		while (n > 0) {
			answer += n%10;
			n /= 10;
			System.out.println(answer);
			System.out.println(n);
		}
		System.out.println(answer);
	}
}
