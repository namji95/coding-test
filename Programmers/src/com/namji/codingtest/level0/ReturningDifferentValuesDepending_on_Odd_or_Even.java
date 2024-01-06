package com.namji.codingtest.level0;

public class ReturningDifferentValuesDepending_on_Odd_or_Even {
	public static void main(String[] args) {
		/*
		 * 양의 정수 n이 매개변수로 주어집니다.
		 * n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을,
		 * n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을
		 * 출력하는 문제입니다.
		 *  7 > 16 / 10 > 220
		 */
		int n = 10;
		int answer = 0;
		if (n % 2 == 0) {
			for (int i = n; i > 0; i--) {
				if (i % 2 == 0) {
					answer += Math.pow(i, 2);
				}
			}
		} else {
			for (int i = n; i > 0; i--) {
				if (i % 2 != 0) {
					answer += i;
				}
			}
		}
		System.out.println(answer);
	}
}
