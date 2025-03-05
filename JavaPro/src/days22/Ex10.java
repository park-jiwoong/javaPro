package days22;

import java.util.HashSet;

/**
 * 
 * 
 * C → L → ArrayList, Vector, LinkedList, Stack, Queue(LinkedList)
 * C → Set → HashSet 컬랙션 클래스
 * 		 중복허용 X
 * 		 순서유지 X
 *
 */
public class Ex10 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(15); 	// 예외 발생 X
		hs.add(15);		// 에외 발생 X
		hs.add(null);	
		hs.add(null);	// 예외 발생 X
		
		// [1, 9, 15]
		// 중복 허용 X 15 1번만 추가됨
		// 15 1번만 추가됨
		// 순서 유지 X
		System.out.println(hs);
		
	}//main

}//class
