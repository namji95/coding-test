package com.namji.codingtest;

import java.util.Arrays;

public class SuffixArray {
	public static void main(String[] args) {
		/*
		 * 문자열 배열 my_string이 매개변수로 주어집니다.
		 * my_string의 접미사를
		 * 사전적 순서로 정렬하여 출력하는 문제입니다.
		 * "banana" > ["a", "ana", "anana", "banana", "na", "nana"]
		 * "programmers" > ["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]
		 */
		String my_string = "banana";
		String[] answer = new String[my_string.length()];
		for (int i = 0; i < my_string.length(); i++) {
			answer[i] = my_string.substring(i, my_string.length());
		}
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
	}
}
