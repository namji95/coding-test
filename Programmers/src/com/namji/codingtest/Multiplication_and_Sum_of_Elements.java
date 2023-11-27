package com.namji.codingtest;

public class Multiplication_and_Sum_of_Elements {
	public static void main(String[] args) {
		/*
		 * 정수 배열 num_list가 매개변수로 주어집니다.
		 * num_list의 원소들의
		 * 곱한 값이 더한 값의 제곱보다 작으면 1을 출력
		 * 곱한 값이 더한 값의 제곱보다 크면 0을 출력하는 문제입니다.
		 * 3, 4, 5, 2, 1 / 5, 7, 8, 3
		 */
		int[] num_list = {3, 4, 5, 2, 1};
		int answer = 0;
		int multi = 1;
		int sum = 0;
		for (int i = 0; i < num_list.length; i++) {
			multi *= num_list[i];
			sum += num_list[i];
		}
		if (multi < Math.pow(sum, 2)) {
			answer = 1;
		} else {
			answer = 0;
		}
		System.out.println(answer);
	}
}
