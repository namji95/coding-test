package com.namji.codingtest.level0;

public class ColatzGuess {
	public static void main(String[] args) {
		/*
		 * 정수 n이 매개변수로 주어집니다.
		 * n을 이용하여 콜라츠 추측을 증명하는 문제입니다.
		 * 콜라츠 추측은
		 * n이 짝수면 2를 나누고
		 * n이 홀수면 3을 곱하고 1을 더합니다.
		 * 위 과정을 결과가 1이 될때까지 반복하는 추측입니다.
		 * 문제는 위 과정을 거치면서 반복 횟수가 500번을 넘길 시 -1을 그렇지 않고
		 * 1번 반복될 경우 0을 그렇지 않다면 반복한 회수를 출력하는 문제입니다.
		 * 6 > 8 / 16 > 4 / 626331 > -1
		 */
		long n = 626331;
		int count = 0;
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = n * 3 + 1;
			} 
			count++;
			if (count >= 500) {
				count = -1;
				break;
			}
		}
		
//		for (int i = 0; i < 500; i++) {
//			n = (n % 2 == 0) ? (n / 2) : (n * 3 + 1);
//			if (n == 1) {
//				count = i +1;
//				break;
//			}
//			count = -1;
//		}
		
		System.out.println(count);
	}
}
