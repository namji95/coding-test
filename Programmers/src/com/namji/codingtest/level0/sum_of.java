package com.namji.codingtest.level0;

public class sum_of {
	public static void main(String[] args) {
		/*
		 * 정수 n이 매개변수로 주어집니다.
		 * n의 약수를 모두 더한 값을 출력하는 문제입니다.
		 * 12 > 28 / 5 > 6
		 */
		int n = 12;
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
//				System.out.println("n의 약수 : " + i);
				answer += i;
			}
		} 
		System.out.println(answer);
	}
}
