package com.namji.codingtest;

public class OperationsBasedOnLength {
	public static void main(String[] args) {
		/*
		 * 정수 배열 num_list가 주어집니다.
		 * 배열의 길이가 11 이상이면 모든 원소를 합을 출력하고
		 * 배열의 길이가 10 이하이면 모든 원소를 곱을 출력하는
		 * 문제입니다.
		 */
		int[] num_list = {2, 3, 4, 5};
		int answer = 0;
		if (num_list.length <= 10) {
			answer++;
		}
		for (int i = 0; i < num_list.length; i++) {
			if (num_list.length >= 11) {
				answer += num_list[i];
			} else {
				answer *= num_list[i];
			}
		}
		System.out.println(answer);
	}
}
