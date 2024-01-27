package com.namji.codingtest.level0;

public class GetMiddleLetter {
	public static void main(String[] args) {
		/*
		 * 문자열 s가 매개변수로 주어집니다.
		 * s의 문자의 길이가 홀수라면 가운데 문자 하나를
		 * s의 문자의 길이가 짝수라면 가운데 문자 두개를 
		 * 출력하는 문제입니다.
		 * "abcde" > "c" / "qwer" > "we"
		 */
		String s = "abcde";
		String answer = "";
		if (s.length() % 2 == 0) {
			answer = s.substring(s.length()/2-1, s.length()/2+1);
		} else {
			answer = s.substring(s.length()/2, s.length()/2+1);
		}
		System.out.println(answer);
	}
}
