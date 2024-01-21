package com.namji.codingtest.level0;

public class NegativeIntegerPositiveIntegerPlus {
	public static void main(String[] args) {
		/**
		 * 정수 배열 absolutes와
		 * 부호를 대신한 boolean 배열 signs가 
		 * 매개변수로 주어집니다.
		 * absolutes의 원소를 signs원소를 이용하여
		 * 모든 원소의 합을 구하는 문제입니다.
		 * ex) absolutes 첫번째 원소가 2, 두번쨰 원소가 1이고
		 * ex) signs 첫번째 원소가 true, 두번쨰 원소가 false라면
		 * --> true2false1 --> 2-1 --> 1
		 * [4,7,12], [true,false,true] > 9 / [1,2,3], [false,false,true] > 0
		 */
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		int answer = 0;
		for (int i = 0; i < absolutes.length; i++) {
			if (signs[i]) {
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}
		}
		System.out.println(answer);
		
		int answer1 = 0;
		for (int i = 0; i < signs.length; i++) {
			answer1 += absolutes[i] * (signs[i]? 1 : -1);
		}
		System.out.println(answer1);
		
		int answer2 = 0;
		for (int i = 0; i < signs.length; i++) {
			answer2 += signs[i] ? absolutes[i] : -absolutes[i];
		}
		System.out.println(answer2);
	}
}
