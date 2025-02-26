package days18;

import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) { //throws IOException {
		
		//Unhandled exception type IOException ← 예외가 처리되지 않았다
		//2)
		//Exception
		//	  ↑
		//IOException
		
		// 컴파일러가 예외처리했는 유무를 확인하고 있는 중
		// System.in.read();
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*[★ 시험 문제 ★]
		 * 1. "unchecked 예외"
		 * RuntimeException 및 자식 예외클래스들은 컴파일러가 예외처리를 확인하지 않는 예외이다.
		 * 
		 * 2. "checked 예외" 
		 * 그 외 모든 Exception 클래스들은 컴파일러가 예외처리를 확인하는 예외이다.
		 * 
		 * 		예) read()	IOException 발생시킬 수 있다
		 */
		
	}//main

}//class
