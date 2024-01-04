package com.namji.codingtest.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Cut_and_SortStrings {
	public static void main(String[] args) {
		/*
		 * 문자열 myString이 매개변수로 주어집니다.
		 * myString은 x를 포함한 문자열로 되어 있고
		 * x를 기준으로 문자열을 잘라내 배열을 만든 후
		 * 사전적 순서로 정렬하여 출력하는 문제입니다.
		 * "axbxcxdx" > ["a","b","c","d"] / "dxccxbbbxaaaa" > ["aaaa","bbb","cc","d"]
		 */
		String myString = "dxccxbbbxaaaa";
		String[] strList = myString.split("x");
		ArrayList<String> answer = new ArrayList<String>();
		for (String str : strList) {
			if (!str.isEmpty()) {
				answer.add(str);
			}
		}
		String[] result = answer.toArray(new String[answer.size()]);
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}
}
