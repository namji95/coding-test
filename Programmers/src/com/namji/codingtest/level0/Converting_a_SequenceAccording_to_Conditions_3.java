package com.namji.codingtest.level0;

import java.util.Arrays;

public class Converting_a_SequenceAccording_to_Conditions_3 {
	public static void main(String[] args) {
		/*
		 * 정수배열 arr, 자연수 k가 매개변수로 주어집니다.
		 * k가 홀수면 arr에 k를 곱하고
		 * k가 짝수면 arr에 k를 더하는 문제입니다.
		 * ex) arr [1, 2, 3, 100, 99, 98], k 3 > [3, 6, 9, 300, 297, 294]
		 * ex) arr [1, 2, 3, 100, 99, 98], k 2 >	[3, 4, 5, 102, 101, 100]
		 */
		int[] arr = {1, 2, 3, 100, 99, 98};
		int k = 3;
		int[] answer = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (k % 2 == 0) {
				answer[i] = arr[i] + k;
			} else {
				answer[i] = arr[i] * k;
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
