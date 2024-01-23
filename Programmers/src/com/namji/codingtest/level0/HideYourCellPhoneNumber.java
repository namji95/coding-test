package com.namji.codingtest.level0;

public class HideYourCellPhoneNumber {
	public static void main(String[] args) {
		/**
		 * 문자열 phone_number가 매개변수로 주어집니다.
		 * phone_number의 마지막 4자리를 제외하고 전부 *처리하여 출력하는 문제입니다.
		 * "01033334444" > "*******4444" / "027778888" > "*****8888"
		 */
		String phone_number = "01033334444";
		char[] c = phone_number.toCharArray();
		for (int i = 0; i < c.length - 4; i++) {
			c[i] = '*';
		}
		System.out.println(String.valueOf(c));
		
//		String answer = "";
//		for (int i = 0; i < phone_number.length() - 4; i++) {
//			answer += "*";
//		}
//		answer += phone_number.substring(phone_number.length() - 4);
//		System.out.println(answer);
//		
//		System.out.println(phone_number.replaceAll(".(?=.{4})", "*"));
	}
}
