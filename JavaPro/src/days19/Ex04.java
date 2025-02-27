package days19;

/**
 * @author kenik
 * @date 2025. 2. 27. - 오전 10:25:29
 * @subject  [문자열 다루는 클래스 ]
 * @content  1. String 클래스        *****
	 *           2. StringBuffer 클래스
	 *           3. StringBuilder 클래스
 *           4. StringTokenizer 클래스  == String.split()  Ex05_04.java
 *           5. StringJoiner 클래스     == String.join()
 */
public class Ex04 {
	


	public static void main(String[] args) {
		// [1. String 클래스]
		//	ㄴ 문자열 자료형
		//		ㄴ 문자열 나열		char []
		// 	ㄴ (★ 암기 ★) "변경 불가능한(immutable) 클래스 이다"
		
		String name = "이창익";
		//String name = new String("이창익"); // ← 원래 new 연산자를 사용해서 객체를 생성해서 써야하는데...
		//System.out.println( name.toString() );
		System.out.println( name );
		
		String name2 = "이창익"; // ← 같은 인스턴스를 가르키고 있음
		//String name2 = new String("이창익"); 
		System.out.println(name == name2); // 같은 주소값 → 힙 영역에 올라가 있음
		
		int a = 1;
		int b = 1;
		System.out.println(a==b);
		Integer c = new Integer(1);
		Integer d = c;
		System.out.println(c);
		System.out.println(d);
		System.out.println(c==d);
		
		
		
	}//main

}//class
