package days19;

import java.util.Arrays;

/**
 * 
 * [문자열 다루는 클래스] 1. String 클래스 2. StringBuffer 클래스 3. String Builder 클래스 4.
 * String Tokenizer 클래스
 * 
 */
public class Ex04_02 {

	
	public static void main(String[] args) {
		
		String name = "true\n";
		System.out.println(name.length());
		System.out.printf("%c\n", 65);
	// Alt + Shift + s (오버라이딩 창 키는 법)

		//String s = "public static void main(String[] args) {";
		
/*		// 1. 문자열 길이 반환하는 메서드
		//System.out.println(s.length()); // 40
		
		// 2. 문자열 속에서 특정 위치의 한 문자를 반환하는 메서드
		//System.out.println(s.charAt(0));
		for (int i = 0; i < s.length(); i++) {
			System.out.printf("%c", 'b');
		}// for i
		
		// 3. 대문자 변환, 소문자 변환
		// 대문자로 변환하는 새로운 문자열 반환.
		// s 문자열 불변 X
		System.out.println(s.toUpperCase() ); //대문자 return
		System.out.println(s.toLowerCase() ); //소문자 return
		System.out.println(s);
	
		// 4. 
		 String[] s.split(regex)
		 
		// 5. String -> char []
		char [] sArr = s.toString();
		System.out.println(Arrays.toString(sArr));
		
		// 6. char[] -> String 문자열로 다시 바꾸고 싶다
		String s2 = new String(sArr);
		String s2 = String.valueOf(sArr);
		System.out.println(s2);
		
		// 7. trim() 문자열 앞 뒤의 공백 제거해서 문자열 반환하는 메서드
		System.out.printf("[%s]", " 홍길동 " .trim());
*/			
		
/*		
		//[문제] s 문자열 속에 main 문자열 찾아서 MAIN으로 변경 코딩
		
		String searchword = "in"; // 검색어 i999	i\d*n
		String searchword(s.contains(searchword); //20 21 22 23
		//[1]
			if (s.contains(searchword)) { // [true], false
			int moanStart = s.indexOf(searchWord);
			s.substring(s.substring(0, index));
			s.substring(s.substring(index + searchword.length()));
			System.out.println(s.toUpperCase());
			System.out.println(s.subSequence(index + searchWord.lastIndexOf(moanStart)));
		
			//[2]
			String [] sArr = s.split(searchWord);
			System.out.println(String.join(searchWord.toUpperCase(), sArr));
		
			//[3]
			System.out.println(s.replace(searchword, searchWord.toUpperCase();
			System.out.println(s.replaceAll(searchword, searchWord.toUpperCase();
			System.out.println(s.replaceFirst(searchword, searchWord.toUpperCase();
		
			System.out.println(s.indexOf(main)); //21
			System.out.println(s.lastIndexOf(main)); // 27
	
		
		//문자열 연결
		String s2 = "aaa" + "bbb" + "ccc"; //문자열 여결 연산자 +
		String s3 = "aaa".concat("bbb").concat("ccc"); // 메서드
		
		// 문자열
		s2.equals(s3);
		s2.equalsIgnoreCase(s3);
*/			
		//[1]
		String s = "public static void main(String[] args) {";
/*		
		String originalString = "public static void main(String[] args) {";
		StringBuilder reversedString = new StringBuilder(originalString).reverse();
				
				System.out.println("원래 문자열: " + originalString);
				System.out.println("뒤집힌 문자열: " + reversedString);
*/				
		//[2]
		// s 문자열 속에 한글을 제외한 모든 문자는 제거
		
		System.out.println(s.replaceAll("[a`zA-Z() {}\\[\\]]", ""));
		//	. 임이의 모든 문자에서 한글을 제외 하겠다 정규표현식
				
		String s2 = reverse(s);
		//System.out.println(s2);
				
	// [시험 문제 과제] 비밀번호
	//				알파벳 대문자 1개, 소문자 1개, 숫자 1개, 특수문자 1개
	//				문자열 길이 8~15 사이
	// String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=.{8,15})$"
		
		
	}// main

	private static String reverse(String s) {
		
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			result = result.charAt(i) + result;
		}//for i
		return result;
	}
	
}// class
