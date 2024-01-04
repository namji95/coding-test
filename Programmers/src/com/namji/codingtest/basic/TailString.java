package com.namji.codingtest.basic;

public class TailString {
	public static void main(String[] args) {
		/*
		 * 문자열 배열 str_list와 문자열 ex가 매개변수로 주어집니다.
		 * str_list 안에 ex가 포함되어 있는 원소는 제외한 원소를
		 * 하나의 문자열로 출력하는 문제입니다.
		 * ["abc", "def", "ghi"], "ef" > "abcghi"
		 * ["abc", "bbc", "cbc"], "c" > ""
		 */
		String[] str_list = {"abc", "bbc", "cbc"};
		String ex = "c";
		String answer = "";
		for (int i = 0; i < str_list.length; i++) {
			if (str_list[i].contains(ex) == false) {
				answer += str_list[i];
			}
		}
		System.out.println(answer);
	}
}
