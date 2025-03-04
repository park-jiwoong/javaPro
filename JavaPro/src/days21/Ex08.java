package days21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
 * 
 *  형식화 클래스 4가지
 *  j.t.formate 패키지
 *  		ㄴ DataTimeFormatter 형식화 클래스
 *  			날짜와 시간을 형식화 ~
 * 			ㄴ 날짜 객체를 → 내가 원하는 형식으로 변환
 * 
 * 
 */
public class Ex08 {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.now();
		//2025-03-04T15:13:04.263668400
		System.out.println(dt);
		
		System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE));
		//2025-03-04

		System.out.println(dt.format(DateTimeFormatter.BASIC_ISO_DATE));
		//20250304
		
		// 2025/03/04 화요일 15:16:45.123 이렇게 출력 해보자
/*		//[1]
		String pattern = "yyyy/MM/dd E요일 HH:mm:ss.SSS";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String s = dtf.format(dt);
		System.out.println(s);
*/
		
		//[2]
		// Full 	: 2025년 3월 4일 화요일
		// Long		: 2025년 3월 4일
		// MEDIUM	: 2025. 3. 4.
		// SHORT	: 25.3.4
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String s = dtf.format(dt);
		System.out.println(s);
		
	}//main

}//class
