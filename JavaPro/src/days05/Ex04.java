package days05;

import java.util.Iterator;

/**
 * 
 * 
 * @author supernova
 * @date 2025. 2. 7. - 오전 11:09:09
 * @subject 조건반복문 while 문
 * @content
 */

public class Ex04 {

	public static void main(String[] args) {

		
		//[for문] 1~10=55
		//	ㄴ 반복문
		/*
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d+", i );
			
		}// for		
		*/
		
		//[wile문] 1~10=55
		//	ㄴ 조건반복문 : condition이 참일 동안 {} 블럭을 실행바는 반복문 / 거짓(될때 까지) 되면 빠져나옴
	/*	while (condition) { 
		}
		
		do {
			
		} while (condition);
       */			
		int i = 0;
		int sum = 0;
		//while (i++ <= 3) {	// false 4 <= 3	i=4			
		while (++i <= 10) {	
			System.out.printf("%d+", i); // 2+3+4
			sum += ++i; // 9
			//i++;
			//++i; 디버깅시 문제가 발생
		} //whill
		System.out.printf("=%d\n", sum);
		
		
			
			
		
		
	} //main

} //class
