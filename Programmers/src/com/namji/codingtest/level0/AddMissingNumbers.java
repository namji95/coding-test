package com.namji.codingtest.level0;

public class AddMissingNumbers {
	public static void main(String[] args) {
		/**
		 * 정수 배열 numbers가 매개변수로 주어집니다.
		 * numbers는 0~9까지의 숫자 중 일부가 들어가 있는 배열입니다.
		 * numbers에서 0~9까지의 숫자 중 없는 숫자들의 합을 출력하는 문제입니다.
		 * [1,2,3,4,6,7,8,0] > 14 / [5,8,4,0,6,7,9] > 6
		 */
		int[] numbers = {1,2,3,4,6,7,8,0};
		int answer = 45;
		for (int n : numbers) {
			answer -= n;
		}
		System.out.println(answer);
	}
}
