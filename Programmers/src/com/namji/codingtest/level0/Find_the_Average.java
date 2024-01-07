package com.namji.codingtest.level0;

public class Find_the_Average {
	public static void main(String[] args) {
		/*
		 * 정수 배열 arr이 매개변수로 주어집니다.
		 * arr 원소의 평균을 출력하는 문제입니다.
		 * [1,2,3,4] > 2.5 / [5,5] > 5
		 */
		int[] arr = {1,2,3,4};
		double answer = 0;
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
//		향상 for문 이용해보기
//		for (int intArr : arr) {
//			answer += intArr;
//		}
		System.out.println(answer / arr.length);
	}
}
