package com.namji.codingtest;

import java.util.ArrayList;
import java.util.List;

public class Remove_ad {
	public static void main(String[] args) {
		/*
		 * 문자열 배열 strArr이 매개변수로 주어집니다.
		 * strArr의 내부 원소들 중 ad를 포함한 문자는 제외하고
		 * ad를 포함하지 않는 문자열을 새로운 배열에 담아 출력하는 문제입니다.
		 * ["and","notad","abcd"] > ["and","abcd"] / ["there","are","no","a","ds"] > ["there","are","no","a","ds"]
		 */
		String[] strArr = {"there","are","no","a","ds"};
		List<String> answer = new ArrayList<String>();
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].contains("ad") == false) {
				answer.add(strArr[i]);
			}
		}
//		for (String str : strArr) {
//			if (!str.contains("ad")) answer.add(str);
//		}
		System.out.println(answer);
	}
}
