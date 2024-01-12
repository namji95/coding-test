package com.namji.codingtest.level0;

public class DetermineIntegerSquareRoot {
	public static void main(String[] args) {
		/*
		 * 양수 n이 매개변수로 주어집니다.
		 * n이 양의 정수 x의 제곱이면 (x + 1)의 제곱을 출력하고 
		 * 제곱이 아니라면 -1을 출력하는 문제입니다.
		 * 121 > 144 / 3 > -1
		 */
		long n = 121;
		double x = Math.sqrt(n);
		if (x % 1 == 0) {
			System.out.println((long)((x+1)*(x+1)));
		} else {
			System.out.println(-1);
		}
		System.out.println((x%1==0?(long)((x+1)*(x+1)):-1));
	}
}
