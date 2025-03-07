package days22;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * 
 * @author pjw55
 *
 */
public class Ex11 {

	public static void main(String[] args) {

	// Set 인터페이스 특징
	// 중복은 허용 X, 순서 유지 X	
	//	[HashSet 컬렉션 클래스]
	//HashSet<int> hs = new HashSet<int>();
	
		// <>제네릭 : 기본형 X, 참조형 ○
		// HashSet 중복된 데이터는 안들어감
	HashSet<Integer> hs = new HashSet<Integer>();
	//LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
	hs.add(new Integer(100));
	hs.add(20);	// Auto Boxing 가능함
	hs.add(20);	// Auto Boxing 가능함
	hs.add(20);	// Auto Boxing 가능함
	hs.add(15);
	hs.add(15);
	hs.add(15);
	hs.add(30);
	
	System.out.println(hs);
	}//main

}//class
