package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kenik
 * @date 2025. 2. 5. - 오후 12:20:05
 * @subject 
 * @content
 */
public class Ex05_02 {
	
	public static void main(String[] args) throws IOException {
		// [시험문제]
		// 국어 점수를 키보드로 부터 입력받아서
		// 변수에 저장하고
		// "국어=90" 이라고 출력하는 코딩을 하자.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		String kor; // String kor;
		
		System.out.print("> 국어 입력 ? ");
		
		// Type mismatch: cannot convert from String to byte
		// Unhandled exception type IOException
		kor = br.readLine();
		
		System.out.printf("국어=%s\n", kor);
	
		
	} // main

} // class






