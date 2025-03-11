package com.util;// 백준 할 때는 package 없이 올려야 컴파일러 오류 안남

import java.util.ArrayList;
import java.util.Scanner;

public class Main {// Main 무조건 지정

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 막대기 개수 입력
		System.out.print("막대기 개수 입력: ");
		int N = scanner.nextInt();
		scanner.nextInt();

		// 막대기 길이 입력
		System.out.print("막대기 길이 입력 (공백으로 구분)");
		String [] stickLengths = scanner.nextLine().split(" ");

		ArrayList<Integer> sticks = new ArrayList<Integer>();
		for (String stickLenght : stickLengths) {
			sticks.add(Integer.parseInt(stickLenght));
		}//for

		// 막대기 자르기 연산 및 결과 출력
		while (!sticks.isEmpty()) {  // 막대기가 남아있는 동안 반복
            int shortestStick = findShortestStick(sticks);  // 가장 짧은 막대기 길이 찾기
            cutSticks(sticks, shortestStick);  // 막대기 자르기 연산 수행
            System.out.println(sticks.size());  // 남은 막대기 개수 출력
        }//while
		
		scanner.close();

	}// main

	private static int findShortestStick(ArrayList<Integer> sticks) {
		int shortestStick = sticks.get(0);
		for (int stick : sticks) {
			if (stick < shortestStick) {
				shortestStick = stick;
			}//if
		}//for
		return shortestStick;
	}

	public static void cutSticks(ArrayList<Integer> sticks, int shortestStick) {
        for (int i = 0; i < sticks.size(); i++) {
            int newLength = sticks.get(i) - shortestStick;  // 현재 막대기 길이에서 가장 짧은 막대기 길이만큼 자르기
            if (newLength <= 0) {
                sticks.remove(i);  // 길이가 0 이하가 되면 막대기 제거
                i--;  // 막대기 제거 후 인덱스 조정
            } else {
                sticks.set(i, newLength);  // 잘린 막대기 길이로 갱신
            }
        }
    }
	
}// class
