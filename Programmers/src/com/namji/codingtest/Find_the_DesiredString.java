package com.namji.codingtest;

public class Find_the_DesiredString {
	public static void main(String[] args) {
		/*
		 * 알파벳으로 이루어진 문자열 myString과 pat이 매개변수로 주어집니다.
		 * myString의 문자열 중 pat이 존재하면 1을 아니라면 0을 출력하는 문제입니다.
		 * "AbCdEfG", "aBc" > 1 / "aaAA", "aaaaa" > 0
		 */
		String myString = "AbCdEfG";
		String pat = "aBc";
		String str = myString.toLowerCase();
		String str1 = pat.toLowerCase();
		if (str.contains(str1)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		if (str.indexOf(str1) != -1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		System.out.println(str.contains(str1) == true ? 1 : 0);
		System.out.println(str.indexOf(str1) != -1 ? 1 : 0);
	}
}
