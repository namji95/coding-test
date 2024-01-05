package com.namji.codingtest.begin;

public class AgeOutput {
	public static void main(String[] args) {
		/*
		 * 정수 age가 매개변수로 주어집니다.
		 * age를 이용하여 태어난 년도를 출력하는 문제입니다.
		 * 문제는 2022년 기준입니다.
		 * 40 > 1983 / 23 > 2000
		 */
		int age = 40;
		System.out.println((2022 - age) + 1);
	}
}
