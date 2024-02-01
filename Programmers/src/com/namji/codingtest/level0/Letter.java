package com.namji.codingtest.level0;

public class Letter {
	public static void main(String[] args) {
		/*
		 * 문자열 message가 매개변수로 주어집니다.
		 * message의 문자열을 2cm의 크기의 글자로 만들려고 가정을 합니다.
		 * 이때 message 변수가 필요한 크기를 출력하는 문제입니다.
		 * "happy birthday!" > 30 / "I love you~" > 22
		 */
		String m = "I love you~";
		System.out.println(m.length() * 2);
	}
}
