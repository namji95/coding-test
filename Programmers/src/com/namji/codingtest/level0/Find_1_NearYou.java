package com.namji.codingtest.level0;

public class Find_1_NearYou {
	public static void main(String[] args) {
		/*
		 * 정수 배열 arr과 정수 idx가 매개변수로 주어집니다.
		 * arr은 0과 1로 이루어져 있고
		 * idx가 주어졌을 때 arr의 idx번째 원소 뒤로 1이 있으면 위치를 출력하는 문제입니다.
		 * [0, 0, 0, 1], 1 > 3 / [1, 0, 0, 1, 0, 0], 4 > -1 / [1, 1, 1, 1, 0], 3 > 3
		 */
		int[] arr = {1, 1, 1, 1, 0};
		int idx = 3;
		int answer = 0;
		for (int i = idx; i < arr.length; i++) {
			if (arr[i] == 1) {
				answer = i;
				break;
			} else {
				answer = -1;
			}
		}
		
		int answer1 = -1;
		for (int i = idx; i < arr.length; i++) {
			if (arr[i] == 1) {
				answer1 = i;
			}
		}
		
		System.out.println("answer = " + answer);
		System.out.println("answer1 = " + answer1);
	}
}
