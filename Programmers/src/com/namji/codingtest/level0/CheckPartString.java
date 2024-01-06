package com.namji.codingtest.level0;

public class CheckPartString {
	public static void main(String[] args) {
		/*
		 * 부분 문자열은 문자엘에서 연속된 일부분에 해당하는 문자열을 의미합니다.
		 * 문자열 my_string과 target이라는 매개변수가 주어집니다.
		 * target이 my_string의 문자열과 겹치는 부분이 있다면
		 * 1을 출력하고 아니라면 0을 출력하는 문제입니다.
		 * ex) "banana" / "ana" -> 1 && "banana" / "wxyz" -> 0
		 */
		String my_string = "banana";
		String target = "ana";
		if (my_string.contains(target) == true) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
