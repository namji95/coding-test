package com.namji.codingtest.level0;

public class DotProduct {
	public static void main(String[] args) {
		/*
		 * 정수 배열 a와 b 가 매개변수로 주어집니다.
		 * a와 b의 길이는 같고, a와 b의 내적을 구하는 문제입니다.
		 * a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
		 * [1,2,3,4], [-3,-1,0,2] > 3 / [-1,0,1], [1,0,-1] > -2
		 */
		int[] a = {1, 2, 3, 4};
		int[] b = {-3, -1, 0, 2};
		int answer = 0;
		for (int i = 0; i < a.length; i++) {
			answer += a[i] * b[i];
		}
		System.out.println(answer);
	}
}
