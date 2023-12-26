package com.namji.codingtest;

public class ComparingArrays {
	public static void main(String[] args) {
		/*
		 * 정수 배열 arr1, arr2가 매개변수로 주어집니다.
		 * 배열의 길이가 긴 쪽이 더 큽니다.
		 * 배열의 길이가 같다면 각 배열의 원소의 합을 비교하여
		 * arr1이크다면 1, 같다면 0, arr2가 크다면 -1을 출력하는 문제입니다.
		 * [49, 13], [70, 11, 2] > -1
		 * [100, 17, 84, 1], [55, 12, 65, 36] > 1
		 * [1, 2, 3, 4, 5], [3, 3, 3, 3, 3] > 0
		 */
		int[] arr1 = {100, 17, 84, 1};
		int[] arr2 = {55, 12, 65, 36};
		int num1 = 0;
		int num2 = 0;
//		if (arr1.length == arr2.length) {
//			for (int i = 0; i < arr1.length; i++) {
//				num1 += arr1[i];
//				num2 += arr2[i];
//			}
//			if (num1 > num2) {
//				System.out.println(1);
//			} else if (num1 < num2) {
//				System.out.println(-1);
//			} else {
//				System.out.println(0);
//			}
//		} else if (arr1.length > arr2.length) {
//			System.out.println(1);
//		} else {
//			System.out.println(-1);
//		}
		for (int i = 0; i < arr1.length; i++) {
			num1 += arr1[i];
			num2 += arr2[i];
		}
		int number = (num1 > num2 ? 1 : num1 < num2 ? -1 : 0);
//		System.out.println(arr1.length == arr2.length ? (num1 > num2 ? 1 : num1 < num2 ? -1 : 0) : arr1.length > arr2.length ? 1 : -1);
		System.out.println(arr1.length == arr2.length ? number : arr1.length > arr2.length ? 1 : -1);
	}
}