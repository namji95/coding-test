package com.namji.codingtest.level0;

public class OfDivisorCount_and_Addition {
	public static void main(String[] args) {
		/*
		 * 정수 left와 right가 매개변수로 주어집니다.
		 * letf부터 right까지의 모든 수 중에서 (left = l, right = r)
		 * 약수의 개수가 짝수인 수는 더하고
		 * 약수의 개수가 홀수인 수는 빼는 문제입니다.
		 * 13, 17 > 43 / 24, 27 > 52
		 */
		int l = 13;
		int r = 17;
		int count = 0;
		int answer = 0;
		
		for (int i = l; i <= r; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			answer += count % 2 == 0 ? i : -i;
			count = 0;
		}
		System.out.println(answer);
		
//		for (int i = l; i <= r; i++) {
//			if (i % Math.sqrt(i) == 0) {
//				answer += -i;
//			}
//			else {
//				answer += i;
//			}
//		}
	}
}
