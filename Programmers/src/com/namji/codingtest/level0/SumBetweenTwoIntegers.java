package com.namji.codingtest.level0;

public class SumBetweenTwoIntegers {
	public static void main(String[] args) {
		/*
		 * 
		 */
		int a = 5;
		int b = 3;
		long answer = 0;
		long answer1 = 0;
		if (a < b) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		}else {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		}
		
		System.out.println("if문과 for문 사용한 정답 = " + answer);
		
		for (int i = ((a < b) ? a :  b); i <= ((a < b) ? b : a); i++) {
			answer1 += i;
		}

		System.out.println("for문 조건을 삼항연산자로 풀이한 정답 = " + answer1);
	}
}
