package com.namji.codingtest.level0;

public class TheRest_1_BecomeNumberFind {
	public static void main(String[] args) {
		/*
		 * 자연수 n이 매개변수로 주어집니다.
		 * n을 x로 나눈 나머지가 1이 되는 가장 작은 수를 출력하는 문제입니다.
		 * 10 > 3 / 12 > 11
		 */
		int n = 10;
		for (int i = 1; i <= n; i++) {
			if (n % i == 1) {
				System.out.println(i);
				break;
			}
		}
	}
}
