package com.namji.codingtest;

public class Make_with_l {
	public static void main(String[] args) {
		/*
		 * 알파벳 소문자로 이루어진 문자열 myString이 매개변수로 주어집니다.
		 * 문자열에서 l보다 앞에 있는 문자는 모두 l로 바꿔서 출력하는 문제입니다.
		 * "abcdevwxyz" > "lllllvwxyz" / "jjnnllkkmm" > "llnnllllmm"
		 */
		String myString = "abcdevwxyz";
		String answer = myString.toLowerCase().replaceAll("[a-k]", "l");
		System.out.println(answer);
//		StringBuilder sb = new StringBuilder();
//		for (char ch : myString.toCharArray()) {
//			if (ch < 'l') sb.append('l');
//			else sb.append(ch);
//		}
//		System.out.println(sb);
	}
}
