package com.namji.codingtest.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSmallestNumber {
	public static void main(String[] args) {
		/*
		 * 정수 배열 arr이 매개변수로 주어집니다.
		 * arr의 원소 중에서 가장 작은 수를 제거한 배열을 출력하는 문제입니다.
		 * 배열의 크기가 1이하면 -1을 출력합니다.
		 * [4,3,2,1] > [4,3,2] / [10] > [-1]
		 */
		int[] arr = {10};
		int min = Arrays.stream(arr).min().getAsInt();
		List<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min) {
				answer.add(arr[i]);
			} else if (arr.length <= 1) {
				answer.add(-1);
			}
		}
		System.out.println(answer);
	}
}
