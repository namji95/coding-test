package com.namji.codingtest;

import java.util.Arrays;

public class FromTheNthElement {
	public static void main(String[] args) {
		/*
		 * 정수배열 num_list와 정수 n이 매개변수로 주어집니다.
		 * num_list의 배열 안에서 n번째 원소부터 마지막 원소까지를
		 * 담은 배열을 출력하는 문제입니다.
		 * 여기서 입출력 예시를 보면
		 * 원소의 위치가 프로그래밍으로서의 위치가 아닙니다.
		 * ex) 2, 1, 6 / 3 = 6 || 5, 2, 1, 7, 5 / 2 = 2,1,7,5
		 */
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 2;
		int[] answer = {};
		answer = Arrays.copyOfRange(num_list, n-1, num_list.length);
		System.out.println(Arrays.toString(answer));
	}
}
