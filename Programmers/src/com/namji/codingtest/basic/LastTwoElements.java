package com.namji.codingtest.basic;

import java.util.Arrays;

public class LastTwoElements {
	public static void main(String[] args) {
		/*
		 * 매개변수로 정수 리스트 num_list가 주어집니다.
		 * num_list의 마지막 원소가 그 전 원소보다 크면
		 * 마지막 원소 빼기 그 전 원소
		 * num_list의 마지막 원소가 그 전 원소보다 작으면
		 * 마지막 원소를 두 배한 값을 추가하여 출력하는 문제입니다.
		 * ex) "2, 1, 6" - [2, 1, 6, 5] / "5, 2, 1, 7, 5" - [5, 2, 1, 7, 5, 10]
		 */
		int [] num_list = {5, 2, 1, 7, 5};
		int endNum = 0;
		int[] answer = Arrays.copyOf(num_list, num_list.length+1);
		if (num_list[num_list.length-1] > num_list[num_list.length-2]) {
			endNum = num_list[num_list.length-1] - num_list[num_list.length-2];
		} else {
			endNum = num_list[num_list.length-1] * 2;
		}
		answer[num_list.length] = endNum;
		System.out.print(Arrays.toString(answer));
	}
}
