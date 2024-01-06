package com.namji.codingtest.level0;

import java.util.Scanner;

public class DistinguishBetweenOdd_and_Even {
	public static void main(String[] args) {
		/*
		 * 자연수 n을 scanner를 이용하여 입력할 수 있게 주어집니다.
		 * n이 짝수면 "n is even"을
		 * n이 홀수면 "n is odd"를 출력하는 문제입니다.
		 * n 100 > 100 is even / n 1 > 1 is odd
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");
		}
		sc.close();
	}
}
