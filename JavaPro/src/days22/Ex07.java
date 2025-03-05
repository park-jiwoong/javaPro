package days22;

import java.util.Stack;

/**
 * 
 * ArrayList - 읽기 빠르다
 * LinkedList
 * 	1) 순차적으로 추가/삭제 : ArrayList 가 빠르다 2) 중간 추가/삭제 :
 * LinkedList 가 빠르다 vector - 멀티쓰레드에 안전 하다
 * 
 * Ex07 stack and Qeeue
 */
public class Ex07 {

	public static void main(String[] args) {
		// 스택 (Stack) and 큐(Queue)
		/*
		 * [Stack]
		 * 1. java.unil 패키지
		 * 
		 * 2. LIFO(Last In, First Out) 자료구조
		 * 3. push() 요소 추가 pop() 요소 얻어오기, 제거 가능 peek() isEmpty() index search() 검색
		 * 
		 * 4. Vector 클래스
		 * 
		 */

		Stack s = new Stack();
		s.push("박지웅"); // 1			4
		s.push("서주원"); // 2			3
		s.push("안우혁"); // 3			2	
		s.push("최인식"); // 4 LIFO 구조	1
		
		s.search(s.search("서주원")); // 3	통에서 꺼내는 형식의 방식
		
		//push(), pop(), peek(), isEmpty(), search()	(★ 암기 ★)
		/*		
		while (s.isEmpty() ) {
			System.out.println(s.pop());
		}
		*/
		/*	
		System.out.println(s.peek()); // 값을 제거 하지 않고 읽어 오는게 peek 함수
		System.out.println(s.peek()); 
		*/
		
		
		
	}// main

}// class
