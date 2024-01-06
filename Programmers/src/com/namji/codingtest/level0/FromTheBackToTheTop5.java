package com.namji.codingtest.level0;

import java.util.Arrays;

public class FromTheBackToTheTop5 {
	public static void main(String[] args) {
		/*
		 * 정수 배열 num_list가 주어집니다.
		 * 무작위로 주어진 정수 배열에서 
		 * 가장 작은 5개의 수를 
		 * 오름차순으로 정렬하여 
		 * 리스트를 출력하는 문제입니다.
		 */
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		int[] answer = {};
		Arrays.sort(num_list);
		answer = Arrays.copyOfRange(num_list, 0, 5);
		System.out.println(Arrays.toString(answer));
	}
}
