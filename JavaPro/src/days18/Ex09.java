package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오후 12:25:28
 * @subject 자동 자원 반환 try ~ with ~ resources 문 설명
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {

		// "days17.16일차복습_홍길동.txt" 텍스트파일을 읽어와서 출력
		// *** FileReader 파일 읽기 클래스
		// FileWriter파일 쓰기 클래스
		
		//[★ 파일 열어서 경로 붙히기 시험 출제 ★]
		String fileName = "C:\\Class\\JavaClass\\JavaPro\\src\\days17\\16일차복습_홍길동.txt"; //경로 절대경로 / 상대 경로
		FileReader reader = null; // 지역 변수는 나중에 초기화 해야하니까
		
		int one;
		
		try {
			reader = new FileReader(fileName);
			//one = reader.read();
			//System.out.println(one);
			while ((one = reader.read()) != -1) {
				System.out.printf("%c", (char)one);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				reader.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}

		System.out.println("end");
	}// main

}// class
