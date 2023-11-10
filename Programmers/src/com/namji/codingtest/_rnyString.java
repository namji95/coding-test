package com.namji.codingtest;

public class _rnyString {
	public static void main(String[] args) {
		/*
		 * m과 rm이 비슷하게 생긴 점을 이용하여
		 * 문자열에 있는 모든 m을 rn으로 바꾸는 문제입니다.
		 * 문자열 rny_string이 주어집니다.
		 * ex ) "masterpiece" / "programmers" / "jerry" / "burn"
		 */
		String rny_string = "programmers";
		String answer = rny_string.replace("m", "rn");
		System.out.println(answer);
	}
}
