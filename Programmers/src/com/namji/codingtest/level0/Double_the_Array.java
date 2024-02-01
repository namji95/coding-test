package com.namji.codingtest.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Double_the_Array {
	public static void main(String[] args) {
		/*
		 * 정수 배열 numbers가 매개변수로 주어집니다.
		 * numbers의 각 원소의 두배를
		 * 새로운 배열로 출력하는 문제입니다.
		 * [1, 2, 3, 4, 5] > [2, 4, 6, 8, 10] / [1, 2, 100, -99, 1, 2, 3] > [2, 4, 200, -198, 2, 4, 6]
		 */
		int[] n = {1, 2, 3, 4, 5};
		int[] answer = new int[n.length];
		List<Integer> answer1 = new ArrayList<Integer>();
		for (int num : n) {
			answer1.add(num * 2);
		}
		System.out.println(answer1);
		
		for (int i = 0; i < n.length; i++) {
			answer[i] = n[i] * 2;
		}
		System.out.println(Arrays.toString(answer));
	}
}
