package com.namji.codingtest.basic;

import java.util.ArrayList;
import java.util.List;

public class DeletingElements_from_an_Array {
	public static void main(String[] args) {
		/*
		 * 정수 배열 arr과 delete_list가 매개변수로 주어집니다.
		 * arr의 원소 중 delete_list의 원소를 모두 삭제하고
		 * 남은 원소들은 기존의 arr에 있던 순서를 유지하여
		 * 출력하는 문제입니다.
		 * arr [293, 1000, 395, 678, 94], delete_list [94, 777, 104, 1000, 1, 12] > [293, 395, 678]
		 * arr [110, 66, 439, 785, 1] delete_list [377, 823, 119, 43] > [110, 66, 439, 785, 1]
		 */
		int[] arr = {293, 1000, 395, 678, 94};
		int[] delete_list = {94, 777, 104, 1000, 1, 12};
		List<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			answer.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < delete_list.length; j++) {
				if (arr[i] == delete_list[j]) {
					answer.remove(Integer.valueOf(arr[i]));
				}
			}
		}
		System.out.println(answer);
	}
}
