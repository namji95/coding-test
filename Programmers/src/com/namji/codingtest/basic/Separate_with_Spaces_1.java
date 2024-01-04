package com.namji.codingtest.basic;

import java.util.Arrays;

public class Separate_with_Spaces_1 {
	public static void main(String[] args) {
		/*
		 * 문자열 my_string이 매개변수로 주어집니다.
		 * my_string의 문자열에는 단어 사이에
		 * 0개 또는 1개의 공백이 존재합니다.
		 * 공백을 제거한 문자열 배열을 출력하는 문제입니다.
		 * "i love you" > ["i", "love", "you"] / "programmers" > ["programmers"]
		 */
		String my_string = "i love you";
		String[] answer = my_string.split("\\s");
		
		System.out.println(Arrays.toString(answer));
		
	}
}
