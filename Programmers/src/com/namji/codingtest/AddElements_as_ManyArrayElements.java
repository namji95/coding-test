package com.namji.codingtest;

import java.util.ArrayList;
import java.util.List;

public class AddElements_as_ManyArrayElements {
	public static void main(String[] args) {
		/*
		 * 양의 정수 arr이 매개변수로 주어집니다.
		 * arr의 각 자리의 원소의 수만큼
		 * 각 자리의 원소를 늘려서 출력하는 문제입니다.
		 * ex) [5, 1, 4] > [5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
		 * ex) [6, 6] > [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
		 * ex) [1] > [1]
		 */
		int[] arr = {5, 1, 4};
		List<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				answer.add(arr[i]);
			}
		}
		System.out.println(answer);
	}
}
