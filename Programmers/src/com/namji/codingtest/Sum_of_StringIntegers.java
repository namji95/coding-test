package com.namji.codingtest;

public class Sum_of_StringIntegers {
	public static void main(String[] args) {
		/*
		 * 정수로 이루어진 문자열 num_str이 매개변수로 주어집니다.
		 * 각 자리수의 합을 구하시오
		 * ex) "123456789" - 45 / "1000000" - 1
		 */
		String numstr = "123456789";
		int answer = 0;
		
		for (int i = 0; i < numstr.length(); i++) {
			answer += (int)numstr.charAt(i) -48;
		}
		System.out.println(answer);
	}
}
