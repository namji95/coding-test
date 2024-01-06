package com.namji.codingtest.level0;

public class PartString {
	public static void main(String[] args) {
		/*
		 * 문자열 str1, str2가 매개변수로 주어집니다.
		 * str1의 문자열이 str2 문자열 안에
		 * 속하면 1을 출력 아니라면 0을 출력하는 문제입니다.
		 * ex) str1 = "abc" str2 = "aabcc" 라고 하면 1이 출력되게 해야 됩니다.
		 * "abc" , "aabcc" / "tbt:" , "tbbttb"
		 */
		String str1 = "abc";
		String str2 = "aabcc";
		if (str2.contains(str1) == true) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
