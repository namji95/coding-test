package com.namji.codingtest.begin;

public class AverageValue_of_Array {
	public static void main(String[] args) {
		/*
		 * 정수 배열 numbers가 매개변수로 주어집니다.
		 * numbers 원소의 평균값을 구하는 문제입니다.
		 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] > 5.5
		 * [89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99] > 94.0
		 */
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double answer = 0;
		for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}
		System.out.println(answer / numbers.length);
	}
}
