package com.namji.codingtest;

import java.util.ArrayList;
import java.util.List;

public class to_do_LIst {
	public static void main(String[] args) {
		/* 
		 * 문자열 배열 todo_list와 
		 * boolean 배열 finished가 매개변수로 주어집니다.
		 * todo_list와 finished의 크기는 같고
		 * finished의 원소의 값이 true면 통과
		 * finished의 원소의 값이 false면
		 *  todo_list의 값을 출력하는 문제입니다.
		 * ["problemsolving", "practiceguitar", "swim", "studygraph"],
		 * [true, false, true, false] >
		 * ["practiceguitar", "studygraph"]
		 */
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		Boolean[] finished = {true, false, true, false};
		List<String> answer = new ArrayList<String>();
		for (int i = 0; i < todo_list.length; i++) {
			if (finished[i] == false) {
				answer.add(todo_list[i]);
			}
		}
		System.out.println(answer + " ");
	}
}
