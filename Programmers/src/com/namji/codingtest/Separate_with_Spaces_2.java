package com.namji.codingtest;

public class Separate_with_Spaces_2 {
	public static void main(String[] args) {
		/*
		 * 단어가 공백 한 개 이상으로 구분되어 있는 
		 * 문자열 my_string이 매개변수로 주어집니다.
		 * my_string에 나온 단어를 앞에서부터 순서대로
		 * 담은 문자열을 출력하는 문제입니다.
		 * " i    love  you" > ["i", "love", "you"]
		 * "    programmers  " > ["programmers"]
		 */
		String my_string = " i    love  you";
		String[] answer = my_string.trim().split("\\s+");
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
