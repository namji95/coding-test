package com.namji.codingtest.basic;

public class Odd_vs_Even {
	public static void main(String[] args) {
		/*
		 * 정수 리스트 num_list가 매개변수로 주어집니다.
		 * 정수 리스트의 첫 번째 원소를 1번 원소라고 할 때,
		 * 홀수 번째 원소들의 합과 
		 * 짝수 번째 원소들의 합 중 
		 * 큰 값을 출력하는 문제입니다.
		 * [4, 2, 6, 1, 7, 6] > 17 / [-1, 2, 5, 6, 3] > 8
		 */
		int [] num_list = {4, 2, 6, 1, 7, 6};
		int answer = 0;
		int even = 0;
		int odd = 0;
		for (int i = 0; i < num_list.length; i++) {
			if ((i+1) % 2 == 0) {
				even += num_list[i];
			} else {
				odd += num_list[i];
			}
		}
		
		answer = even > odd ? even : odd;
		
		System.out.println(answer);
	}
}
