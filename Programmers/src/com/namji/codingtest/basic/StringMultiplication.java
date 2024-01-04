package com.namji.codingtest.basic;

public class StringMultiplication {
	public static void main(String[] args) {
		/*
		 * 문자열 my_string과 정수 k가 매개변수로 주어집니다.
		 * my_string을 k번 반복한 값을 출력하는 문제입니다.
		 * "string", 3 >	"stringstringstring"
		 * "love", 10 >	"lovelovelovelovelovelovelovelovelovelove"
		 */
		String my_string = "love";
		int k = 10;
		System.out.println(my_string.repeat(k));
//		String answer = "";
//		for (int i = 0; i < k; i++) {
//			answer += my_str;
//		}
	}
}
