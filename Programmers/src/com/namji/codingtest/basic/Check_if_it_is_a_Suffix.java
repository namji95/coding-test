package com.namji.codingtest.basic;

public class Check_if_it_is_a_Suffix {
	public static void main(String[] args) {
		/*
		 * 문자열 my_string과 is_suffix가 매개변수로 주어집니다.
		 * is_suffix가 my_string의 접미사면 1을 아니라면 0을 출력하는 문제입니다.
		 * banana, ana > 1 / banana, nan > 0 / banana, wxyz > 0 / banana, abanana >  0
		 */
		String my_string = "banana";
		String is_suffix = "ana" ;
		int answer = my_string.endsWith(is_suffix) ? 1 : 0;
		System.out.println(answer);
	}
}
