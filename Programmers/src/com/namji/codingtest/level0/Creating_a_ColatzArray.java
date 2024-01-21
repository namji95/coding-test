package com.namji.codingtest.level0;

import java.util.ArrayList;
import java.util.List;

public class Creating_a_ColatzArray {
	public static void main(String[] args) {
		/**
		 * 정수 n이 매개변수로 주어집니다.
		 * n을 콜라츠 추측의 과정을 거쳐 나온 값들을
		 * answer 배열에 담아서 출력하는 문제입니다.
		 * 콜라츠 추측이란
		 * 1. n이 짝수면 2로 나누고
		 * 2. n의 홀수면 n * 3 + 1 을 해서
		 * n이 1이 될 때까지 반복하는 것이 콜라츠의 추측입니다.
		 * 10 > [10, 5, 16, 8, 4, 2, 1]
		 */
		int n = 10;
		List<Integer> answer = new ArrayList<Integer>();
		answer.add(n);
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
				answer.add(n);
			} else {
				n = n * 3 + 1;
				answer.add(n);
			}
		}
		System.out.println(answer);
	}
}
