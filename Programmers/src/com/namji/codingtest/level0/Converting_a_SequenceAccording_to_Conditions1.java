package com.namji.codingtest.level0;

import java.util.Arrays;

public class Converting_a_SequenceAccording_to_Conditions1 {
	public static void main(String[] args) {
		/*
		 * 정수 배열 arr이 매개변수로 주어집니다.
		 * 정수 배열의 원소가
		 * 50보다 크거나 같은 짝수라면 2를 나누고
		 * 50보다 작은 홀수라면 2를 곱하는 문제입니다.
		 */
		int[] arr = {1, 2, 3, 100, 99, 98};
		int[] answer = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 50 && arr[i] % 2 == 0) {
				answer[i] = arr[i] / 2;
				} else if (arr[i] < 50 && arr[i] % 2 != 0) {
					answer[i] = arr[i] * 2;
				} else {
					answer[i] = arr[i];
				}
		}
		System.out.println(Arrays.toString(answer));
	}
}
