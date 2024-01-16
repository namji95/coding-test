package com.namji.codingtest.level0;

import java.util.Arrays;
import java.util.Collection;

public class Sort_by_Integer_in_DescendingOrder {
	public static void main(String[] args) {
		/*
		 * 정수 n이 매개변수로 주어집니다.
		 * n의 각 자릿수를 큰 수부터 작은 수로 정렬한 값을 출력하는 문제입니다.
		 * 118372 > 873211
		 */
		long n = 118372;
		String[] str = String.valueOf(n).split("");
		Arrays.sort(str);
		
		StringBuilder sb = new StringBuilder();
		for (String strList : str) {
			sb.append(strList);
		}
	
		System.out.println(Long.parseLong(sb.reverse().toString()));
	}
}
