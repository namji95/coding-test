package com.namji.codingtest.level0;

public class A_to_Emphasize {
	public static void main(String[] args) {
		/*
		 * 문자열 myString이 매개변수로 주어집니다.
		 * myString의 문자 중 a는 A로 변환하고
		 * a가 아닌 모든 대문자는 소문자로 변환하는 문제입니다.
		 * "abstract algebra" > "AbstrAct AlgebrA" / "PrOgRaMmErS" > "progrAmmers"
		 */
		String myString = "abstract algebra";
//		myString = myString.toLowerCase();
		String answer = myString.toLowerCase().replace('a', 'A');
		System.out.println(answer);
	}
}
