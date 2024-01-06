package com.namji.codingtest.level0;

public class DiceGame1 {
	public static void main(String[] args) {
		/*
		 * 정수 a, b가 매개변수로 주어집니다.
		 * 1부터 6까지 적힌 주사위가 두개 있다고 가정합니다.
		 * 굴렸을 때 나온 숫자를 각각 a, b라고 할 때
		 * a와 b 모두 홀수 -> a제곱 + b제곱
		 * a와 b 중 하나만 홀수 2*(a+b)
		 * a와 b 모두 홀수가 아니면 |a-b| 를 출력하는 문제입니다.
		 */
		int a = ((int)(Math.random() * 6) + 1);
		int b = ((int)(Math.random() * 6) + 1);

		System.out.println("a : " + a + "b : " + b);
		
		System.out.println(a%2!=0&&b%2!=0?a*a+b*b:a%2!=0||b%2!=0?2*(a+b):Math.abs(a-b));
		
//		if (a % 2 != 0 && b % 2 != 0) {
//			System.out.println((int)Math.pow(a, 2) + (int)Math.pow(b, 2));
//		} else if (a % 2 != 0 || b % 2 != 0) {
//			System.out.println((int)2*(a + b));
//		} else {
//			System.out.println((int)Math.abs(a-b));
//		}
	}
}
