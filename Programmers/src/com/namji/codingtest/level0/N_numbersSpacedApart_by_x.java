package com.namji.codingtest.level0;

import java.util.Arrays;

public class N_numbersSpacedApart_by_x {
	public static void main(String[] args) {
		/*
		 * 정수 x와 자연수 n이 매개변수로 주어집니다.
		 * x씩 증가하는 숫자를 n개 지니는 리스트를 출력하는 문제입니다.
		 * 2, 5 > [2,4,6,8,10] / 4, 3 > [4,8,12] / -4, 2 > [-4, -8]
		 */
		int x = -4;
		int n = 2;
		long num = x;
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] = num;
			num += x;
		}
//		for (int i = 0; i < n; i++) {
//			answer[i] = (i + 1) * num;
//		}
		System.out.println(Arrays.toString(answer));
	}
}
