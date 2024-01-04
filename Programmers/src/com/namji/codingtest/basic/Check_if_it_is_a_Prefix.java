package com.namji.codingtest.basic;

public class Check_if_it_is_a_Prefix {
	public static void main(String[] args) {
		/*
		 * 문자열 my_string과 is_prefix가 매개변수로 주어집니다.
		 * is_prefix의 문자열이 my_string의 접두사인지 확인하여
		 * 접두사면 1을 아니라면 0을 출력하는 문제입니다.
		 * "banana", "ban" > 1 / nan > 0 / abcd > 0 / bananan > 0
		 */
		String my_string = "banana";
		String is_prefix = "ban";
		int answer = 0;
		if (my_string.startsWith(is_prefix)) {
			answer = 1;
		} else {
			answer = 0;
		}
		System.out.println(answer);
	}
}
