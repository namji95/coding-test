package com.namji.codingtest;

public class Converting_a_List_of_Characters_to_a_String {
	public static void main(String[] args) {
		/*
		 * 문자열 배열 arr이 매개변수로 주어집니다.
		 * arr의 원소를 이어 붙이 문자열을 출력하는 문제입니다.
		 * ["a","b","c"] > "abc"
		 */
		String[] arr = {"a","b","c"};
		String answer = "";
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		System.out.println(answer);
	}
}
