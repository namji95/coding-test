package com.namji.codingtest.level0;

public class ChangeSpecificLetters_to_Uppercase {
	public static void main(String[] args) {
		/*
		 * 문자열 my_string, 문자열 alp가 매개변수로 주어집니다.
		 * my_string은 영소문자로 이루어져 있고,
		 * alp은 영소문자 1글자로 이루어져 있습니다.
		 * my_string의 문자들 중 alp의 문자를 대문자로 변경시키는 문제입니다.
		 * "programmers", "p" > "Programmers" / "lowercase", "x" > "lowercase"
		 */
		String my_string = "programmers";
		String alp = "p";
		String answer = my_string.replace(alp, alp.toUpperCase());
		System.out.println(answer);
	}
}
