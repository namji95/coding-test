package com.namji.codingtest;

import java.util.*;

public class FivePeopleEach {
	public static void main(String[] args) {
		/*
		 * 문자열 배열 names가 매개변수로 주어집니다.
		 * 최대 5명씩 탑승 가능한 놀이기구를 타기 위해 줄을 서 있는 사람들의 이름이 담긴 문자열 배열 names
		 * 앞에서 부터 5명씩  묶은 그룹의 가장 앞에 서 있는 사람들의 이름을 담은 리스트를 출력하는 문제입니다.
		 * ["nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"] > ["nami", "vex"]
		 */
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		List<String> answer = new ArrayList<String>();
		for (int i = 0; i < names.length; i++) {
			if (i % 5 == 0) {
				answer.add(names[i]);
			}
		}	
		System.out.println(answer);
	}
}
