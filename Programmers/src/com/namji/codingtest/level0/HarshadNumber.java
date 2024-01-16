package com.namji.codingtest.level0;

public class HarshadNumber {
	public static void main(String[] args) {
		/*
		 * 양의 정수 x가 매개변수로 주어집니다.
		 * x가 하샤드 수라면 x의 자릿수 합으로 x가 나누어져야 합니다.
		 * ex) 18은 자릿수합 = 1+8 = 9 -> 18 / 9 를 
		 * 했을 때 나누어 떨어지기 때문에 18은 하샤드 수 입니다.
		 * x가 하샤드 수인지 true / false로 출력하는 문제입니다.
		 * 10 > true / 12 > true / 11 > false / 13 > false
		 */
		int x = 13;
		int a = x;
		int sum = 0;
		while (a > 0) {
			sum += a % 10;
			a /= 10;
		}
		System.out.println((x%sum)==0 ? true : false);
//		if ((a % sum) == 0) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
	}
}
