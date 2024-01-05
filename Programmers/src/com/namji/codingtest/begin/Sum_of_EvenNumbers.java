package com.namji.codingtest.begin;

public class Sum_of_EvenNumbers {
	public static void main(String[] args) {
		/*
		 * 정수 n이 매개변수로 주어집니다.
		 * n 이하의 짝수의 합을 구하는 문제입니다.
		 * 10 > 30 / 4 > 6
		 */
		int n = 10;
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				answer += i;
			}
		}
		System.out.println(answer);
	}
}
