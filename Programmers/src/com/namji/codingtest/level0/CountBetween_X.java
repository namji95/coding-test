package com.namji.codingtest.level0;

import java.util.Arrays;

public class CountBetween_X {
	public static void main(String[] args) {
		/*
		 * 문자열 myString이 매개변수로 주어집니다.
		 * myString을 문자 x를 기준으로 나눴을 때
		 * 나눠진 문자열 각각의 길이를 저장한 배열을 출력하는 문제입니다.
		 * "oxooxoxxox" > [1, 2, 1, 0, 1, 0] / "xabcxdefxghi" > [0, 3, 3, 3]
		 */
		String myString = "oxooxoxxox";
		String[] strArr = myString.split("x", myString.length());
		int[] answer = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			answer[i] = strArr[i].length();
		}
		System.out.println(Arrays.toString(answer));
	}
}
