package com.namji.codingtest.level0;

import java.util.Arrays;

public class NaturalNumbersUpsideDown_and_MakeArrays {
	public static void main(String[] args) {
		/*
		 * 정수 n이 매개변수로 주어집니다.
		 * n을 뒤집어 각 자리 숫자를 원소로 가진 배열을 출력하는 문제입니다.
		 * 12345 > [5,4,3,2,1]
		 */
		int n = 12345;
		String str = "" + n;
		int[] answer = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			answer[i] = (int)n%10;
			n /= 10;
		}
//		int cnt = 0;
//		while (n > 0) {
//			answer[cnt] = (int)(n%10);
//			n /= 10;
//			cnt++;
//		}
		System.out.println(Arrays.toString(answer));
	}
}
