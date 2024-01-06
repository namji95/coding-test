package com.namji.codingtest.level0;

public class ComparingNumbers {
	public static void main(String[] args) {
		/*
		 * 정수 num1과 num2가 매개변수로 주어집니다.
		 * num1과 num2가 같으면 1을 다르면 -1을 출력하는 문제입니다.
		 * 2, 3 > -1 / 11, 11 > 1 / 7, 99 > -1
		 */
		int num1 = 2;
		int num2 = 3;
		int num3 = 11;
		int num4 = 11;
		System.out.println(num1 == num2 ? 1 : -1);
		System.out.println(num3 == num4 ? 1 : -1);
	}
}
