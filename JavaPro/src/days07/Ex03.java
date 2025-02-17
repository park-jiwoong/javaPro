package days07;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오전 11:11:43
 * @subject 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		String data = "홍길동,이창익,서영학,정창기";
		String regex = ",";
		String [] names = data.split(regex);
		
		// [홍길동, 이창익, 서영학, 정창기]
		// System.out.println( Arrays.toString( names ) );
		
		// [for문]
		// 배열명.length => 배열크기
		/*
		int size = names.length;
		for (int i = 0; i < size; i++) {
			System.out.printf("names[%d]=\"%s\"\n", i, names[i]);
		} // for i
		*/
		
		// [foreach문] == 확장for문
		/*
		for (   :  배열 또는 컬렉션클래스 ) {
			
		} // for
		*/
		
		for(String name : names) {
			System.out.println( name );
		} // for	//변수명

		
		// 1. charAt() [문자 추출] [예) (문자 추출) charAt(2) "자"]
		// 2. equals() [문자열 비교] 함수 / equals (정수, 상수 변수의 값 비교시 == 연산자 사용, 문자열은 == X)
		// 3. length() [문자열 길이] 문자열 길이는 공백을 포함 [예) (문자열 길이) 6개]
		// 4. valueOf() [문자열 변환] 정수, 상수 = 기본타입 값 문자열로 변환 기능
		// 5. toUpperCase() / toLowerCase() [문자열 알파벳 대·소문자 변경]
		// 6. format () [문자열 특정형식으로 변경시 사용] %s(문자형) %d (정수형) %f (실수)
		// 7. toCharArray()[문자열을 문자배열로 변환]
		// 8. "-".repeat (10) [문자열을 지정된 횟수만큼 반복] "-" ☞ "----------"
		// 9. split (String regex); // [문자열 분리] 정규 표현식을 쪼개 달라고 함
		// 10. trim() [문자열 앞뒤 공백 잘라내기]
		
	}//main
	
}//class
