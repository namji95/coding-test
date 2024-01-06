package com.namji.codingtest.level0;

public class CombineBigger {
	public static void main(String[] args) {
		/*
		 *  두 정수 사이에  ⊕기호가 있으면
		 *  두 정수를 붙이는 역할을 합니다.
		 *  양의 정수 a와 b가 주어질 때 
		 *  a ⊕b와 b ⊕a를 했을 때 더 큰 값을 출력하는 문제입니다.
		 *  붙인 두 값이 같다면a ⊕b를 출력합니다.
		 *  a 9 b 91 > 991, 919 / a 89 b 8 > 898, 889
		 */
		int a = 5;
		int b = 5;
		int ab = Integer.parseInt(""+ a + b);
		int ba = Integer.parseInt(""+ b + a);
		int answer = ab > ba ? ab : ba;
		System.out.println(answer);
//		String ab = String.valueOf(a) + String.valueOf(b);
//		String ba = String.valueOf(b) + String.valueOf(a);
//		int AB = Integer.parseInt(ab);
//		int BA = Integer.parseInt(ba);
//		if (AB > BA) {
//			System.out.println(AB);
//		} else if (AB < BA) {
//			System.out.println(BA);
//		} else {
//			System.out.println(AB);
//		}
	}
}