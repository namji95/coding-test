package com.namji.codingtest.basic;

import java.util.Arrays;

public class ConvertCase_of_StringsInside_an_Array {
	public static void main(String[] args) {
		/*
		 * 문자열 배열 strArr이 매개변수로 주어집니다.
		 * 모든 원소가 알파벳으로만 이루어져 있습니다.
		 * 배열의 홀수 인덱스 문자열은 모두 대문자로,
		 * 배열의 짝수 인덱스 문자열은 모두 소문자로
		 * 변환하여 출력하는 문제입니다.
		 * ["AAA","BBB","CCC","DDD"] > ["aaa","BBB","ccc","DDD"]
		 * ["aBc","AbC"] > ["abc","ABC"]
		 */
		String[] strArr = {"aBc","AbC"};
		String[] answer = new String[strArr.length];
//		for (int i = 0; i < strArr.length; i++) {
//			if (i % 2 == 0) {
//				answer[i] = strArr[i].toLowerCase();
//			} else {
//				answer[i] = strArr[i].toUpperCase();
//			}
//		}
		for (int i = 0; i < strArr.length; i++) {
			answer[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
		}
		System.out.println(Arrays.toString(answer));
	}
}
