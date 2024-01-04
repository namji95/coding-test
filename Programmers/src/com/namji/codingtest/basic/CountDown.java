package com.namji.codingtest.basic;

import java.util.Arrays;

public class CountDown {
	public static void main(String[] args) {
		/*
		 * 매개변수로 정수 start_num, end_num이 주어집니다.
		 * 매개변수 start_num부터 end_num까지 
		 * 1씩 감소하는 수를 차례로 출력하는 문제입니다.
		 * 출력은 배열에 담은 정수 배열을 출력해야 합니다.
		 */
		int start = 10;
		int end = 3;
		int[] answer = new int [start - end + 1];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = start--;
		}
		System.out.println(Arrays.toString(answer));
	}
}
