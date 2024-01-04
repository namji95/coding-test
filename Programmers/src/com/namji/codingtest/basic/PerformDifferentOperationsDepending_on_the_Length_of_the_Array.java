package com.namji.codingtest.basic;

import java.util.Arrays;

public class PerformDifferentOperationsDepending_on_the_Length_of_the_Array {
	public static void main(String[] args) {
		/*
		 * 정수 배열 arr, 정수 n이 매개변수로 주어집니다.
		 * arr의 길이가 홀수면 arr의 짝수 인덱스의 위치에 n을 더한 배열을,
		 * arr의 길이가 짝수면 arr의 홀수 인덱스의 위치에 n을 더한 배열을
		 * 출력하는 문제입니다.
		 * [49, 12, 100, 276, 33], 27 > [76, 12, 127, 276, 60]
		 * [444, 555, 666, 777], 100 > [444, 655, 666, 877]
		 */
		int[] arr = {444, 555, 666, 777};
		int n = 100;
		int[] answer = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr.length % 2 == 0 && i % 2 != 0) {
				answer[i] = arr[i] + n;
			} else if (arr.length % 2 != 0 && i % 2 == 0) {
				answer[i] = arr[i] + n;
			} else {
				answer[i] = arr[i];
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
