package com.namji.codingtest;

import java.util.Arrays;

public class ChangeSequence {
	public static void main(String[] args) {
		/*
		 * 정수 리스트 num_list, 정수 n이 매개변수로 주어집니다.
		 * num_list를 n번째 원소를 기준으로 나누어
		 *  n번째와 그 이후의 원소를
		 *  n번째 이전의 원소 앞으로 보내는 문제입니다.
		 *  [2, 1, 6], 1 > [1, 6, 2]
		 *  [5, 2, 1, 7, 5], 3 > [7, 5, 5, 2, 1]
		 */
		// 정수 배열에서 n번째를 찾기
		// 그 원소와 이후의 원소 뺴기
		// 
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 3;
		int[] answer = new int[num_list.length];
		int index = 0;
		for (int i = n; i < num_list.length; i++) {
			answer[index++] = num_list[i];
		}
		for (int i = 0; i < n; i++) {
			answer[index++] = num_list[i];
		}
		System.out.println(Arrays.toString(answer));
	}
}
