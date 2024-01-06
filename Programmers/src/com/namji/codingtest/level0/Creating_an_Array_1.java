package com.namji.codingtest.level0;

import java.util.ArrayList;
import java.util.List;

public class Creating_an_Array_1 {
	public static void main(String[] args) {
		/*
		 * 정수 n과 k가 매개변수로 주어집니다.
		 * 1이상 n이하의 정수 중에서
		 * k의 배수를 오름차순으로 저장한 배열을 
		 * 출력하는 문제입니다.
		 * 10	, 3 > [3, 6, 9] / 15, 5 > [5, 10, 15]
		 */
		int n = 15;
		int k = 5;
		List<Integer> answer = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (i % k == 0) {
				answer.add(i);
			}
		}
		System.out.println(answer);
	}
}
