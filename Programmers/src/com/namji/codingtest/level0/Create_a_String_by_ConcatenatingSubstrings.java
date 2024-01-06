package com.namji.codingtest.level0;

public class Create_a_String_by_ConcatenatingSubstrings {
	public static void main(String[] args) {
		/*
		 * 길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다.
		 * parts의 각 원소는 [a, b] 형태로, my_strings의 각 원소의 a부터 b까지의 인덱스를 의미합니다.
		 * 각 인덱스의 원소를 뽑아 이어붙인 문자열을 출력하는 문제입니다.
		 * ["progressive", "hamburger", "hammer", "ahocorasick"]
		 * [[0, 4], [1, 2], [3, 5], [7, 7]]
		 * "programmers"
		 */
		String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
		int[][] parts = {
				{0, 4}, // 0, 0 
				{1, 2}, // 1, 1
				{3, 5}, // 2, 2
				{7, 7}}; // 3, 3
		for (int i = 0; i < my_strings.length; i++) {
			String str = my_strings[i];
			
			System.out.print(str.substring(parts[i][0], parts[i][1]+1));
		}
	}
}
