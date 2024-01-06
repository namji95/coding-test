package com.namji.codingtest.level0;

public class Comparing_the_OperationValue_of_TwoNumbers {
	public static void main(String[] args) {
		/*
		 * 정수 a와 b가 매개변수로 주어집니다.
		 * a ⊕ b는 ab로 출력된다고 했을 때
		 * (a ⊕ b)와 (2 * a * b) 의 값을 비교하여
		 * 더 큰 값을 출력하는 문제입니다.
		 * ⊕기호를 +를 사용해서 풀어보겠습니다.
		 * 2, 91 > 364 / 91, 2 > 912
		 */
		int a = 91;
		int b = 2;
		String c = Integer.toString(a) + Integer.toString(b);
		int d = 2 * a * b;
		int e = Integer.parseInt(c);
		int answer = 0;
//		if (e > d) {
//			answer = e;
//		} else if (e < d) {
//			answer = d;
//		} else {
//			answer = e;
//		}
//		System.out.println(answer);
//		System.out.println(
//				e > d ? e : e < d ? d : e
//		);
		System.out.println(
				Math.max(Integer.valueOf("" + a + b), (2 * a * b))
		);
	}
}
