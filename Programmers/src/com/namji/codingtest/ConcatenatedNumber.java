package com.namji.codingtest;

public class ConcatenatedNumber {
	public static void main(String[] args) {
		/*
		 * 정수 배열 num_list가 주어집니다.
		 * 정수 배열 안에 있는 숫자 중,
		 * 홀수끼리 이어 붙이고 짝수끼리 이어 붙여서
		 * 나온 두 수를 합하는 문제입니다.
		 * ex) 3,4,5,2,1이 있다면 351 + 42 = 393
		 * 이렇게 출력되게 하는 문제입니다.
		 */
		int[] num_list = {5, 7, 8, 3};
		int answer = 0;
		String even = "";
		String odd = "";
		
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				even += Integer.toString(num_list[i]);
			} else {
				odd += Integer.toString(num_list[i]);
			}
		}
		answer = Integer.parseInt(even) + Integer.parseInt(odd);
		System.out.println(answer);
	}
}
