package days19;

import java.util.Iterator;

public class Ex04_03 {

	public static void main(String[] args) {

		//compareTo				//양수: 호출된 문자열이 비교 문자열보다 사전적으로 뒤에 오는 경우
								//0: 두 문자열이 동일한 경우
								//음수: 호출된 문자열이 비교 문자열보다 사전적으로 앞에 오는 경우

		//compareToIgnoreCase 	//양수: 호출된 문자열이 비교 문자열보다 사전적으로 뒤에 오는 경우
								//0: 두 문자열이 동일한 경우
								//음수: 호출된 문자열이 비교 문자열보다 사전적으로 앞에 오는 경우
		
		//System.out.println("abC".compareTo("abc"));
		//System.out.println("abC".compareToIgnoreCase("abc"));
		
	//  http://
		String url = "http://www.naver.com";	//정규 표현식으로 해보자
		//String url = "www.naver.com";
		//String url = "ftp://www.naver.com";
		//String url = "https://www.naver.com";
		
//		url.charAt(0) == 'h';
//		url.charAt(1) == 't';
//		url.charAt(2) == 't';
//		url.charAt(3) == 'p';
//		url.charAt(4) == ':';
//		url.charAt(5) == '/';
//		url.charAt(6) == '/';
		
//		url.substring(0, 7).equals("http://")
		
		// 메서드 O
		String prefix = "http://";
		//System.out.println( url.startsWith(prefix) ); 
		
		String fileName = "Sample.java";
		
		String suffix = ".java";
		//System.out.println( fileName.endsWith(suffix) );
		
		// startsWith()   접두사
		// endsWith()     접미사
		
		String [] urls = {
				"http://www.naver.com"
				,"www.naver.com"
				, "ftp://www.naver.com" 
				,"https://www.naver.com"
		};

		// String regex = "^http://";  // ^   $
		String regex = "http://.*";  // ^   $
		for (String u : urls) {
			if( u.matches(regex) ) System.out.println( u );
		}
		System.out.println("end");
	} // main

} // class


