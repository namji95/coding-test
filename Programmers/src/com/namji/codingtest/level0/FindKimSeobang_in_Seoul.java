package com.namji.codingtest.level0;

import java.util.Arrays;

public class FindKimSeobang_in_Seoul {
	public static void main(String[] args) {
		/*
		 * String 배열 seoul이 매개변수로 주어집니다.
		 * seoul에 있는 원소에서 Kim의 위치를 찾아서
		 * 김서방은 (원소위치)에 있다를 출력하는 문제입니다.
		 * ["Jane", "Kim"] > "김서방은 1에 있다"
		 */
		String[] s = {"Jane", "Kim"};
		String answer = "";
		int idx = Arrays.asList(s).indexOf("Kim");
		for (int i = 0; i < s.length; i++) {
			answer = "김서방은 " + idx + "에 있다.";
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다.";
			}
		}
		System.out.println(answer);
	}
}
