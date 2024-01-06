package com.namji.codingtest.level0;

public class Protractor {
	public static void main(String[] args) {
		/*
		 * 정수 angle이 매개변수로 주어집니다.
		 * angle이 0 ~ 90도 미만은 1을
		 * angle이 90도는 2를
		 * angle이 91 ~ 180도 미만은 3을
		 * angle이 180도는 4를 출력하는 문제입니다.
		 * 70 > 1 / 91 > 3 / 180 > 4
		 */
		int angle = 70;
		int answer = 0;
		if (0 < angle && angle < 90) {
	        answer = 1;
	    } else if (angle == 90) {
	        answer = 2;
	    } else if (90 < angle && angle < 180) {
	        answer = 3;
	    } else if (angle == 180) {
	        answer = 4;
	    }
		System.out.println(answer);
	}
}
