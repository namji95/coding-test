package com.namji.codingtest.level0;

public class Add_until_Greater_than_N {
	public static void main(String[] args) {
		/*
		 * 정수배열 numbers, 정수 n이 매개변수로 주어집니다.
		 * numbers 의 원소를 앞에서부터 하나씩 더합니다
		 * 그 값이 n보다 커지는 순간의 값을 출력하는 문제입니다.
		 * ex) [34, 5, 71, 29, 100, 34], 123 > 139 / [58, 44, 27, 10, 100], 139 > 239
		 */
		int[] numbers = {34, 5, 71, 29, 100, 34};
		int n = 123;
		int answer = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
			if (answer > n) {
				break;
			}
		}
		
//		for (int i = 0; i < numbers.length; i++) {
//			if (answer <= n) {
//				answer += numbers[i];
//			}
//		}
		
//		for (int i = 0; answer <= n; i++) {
//			answer += numbers[i];
//		}
		
		System.out.println(answer);
	}
}
