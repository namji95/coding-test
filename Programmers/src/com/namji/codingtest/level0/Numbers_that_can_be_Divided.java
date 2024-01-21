package com.namji.codingtest.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers_that_can_be_Divided {
	public static void main(String[] args) {
		/**
		 * 정수 배열 arr과 정수 divisor가 매개변수로 주어집니다
		 * arr의 원소를 divisor로 나눠지면 그 원소는 answer 배열에 담아 출력하는 문제입니다.
		 * 출력되는 배열은 오름차순 정렬된 상태로 출력되어야 합니다.
		 * [5, 9, 7, 10], 5 > [5, 10] / [2, 36, 1, 3], 1 > [1, 2, 3, 36] / [3,2,6], 10 > [-1]
		 */
		int[] arr = {3,2,6};
		int divisor = 10;
		Arrays.sort(arr);
		List<Integer> answer = new ArrayList<Integer>();
		for (int arrList : arr) {
			if (arrList % divisor == 0) {
				answer.add(arrList);
			}
		}
		if (answer.isEmpty()) {
			answer.add(-1);
		}
		System.out.println(answer);
	}
}
