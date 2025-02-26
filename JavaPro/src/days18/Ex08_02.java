package days18;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오후 2:48:35
 * @subject   예외처리 2번째 방법         : throw[s]문 설명
 * @content   예외를 강제로 발생시키는 문 : throw문 설명
 *            사용자 정의 예외 객체 
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
		// System.in.read(); 이해
		
		// 국어점수를 입력받아서 수~가 출력.
		int kor = 0;
		try {
			kor = getScore();
			System.out.println("kor = " + kor);
		} catch (ScoreOutofBoundException e) {
			System.out.println( e.getERROR_CODE() +"\n" + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("end");
	} // main

	private static int getScore() throws ScoreOutofBoundException{
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		System.out.print("> 점수 입력 ? ");
		String input = scanner.next(); // "90"
		
		// 0 ~ 100 유효성 검사
		String regex = "^(\\d|[1-9]\\d|100)$";
		
		if( input.matches(regex) ) {
			score = Integer.parseInt(input);
		}else {
			// 강제 예외 발생 시키겠다. :   throw문 사용
			// throw new IOException("> 점수 범위 0~100 ~~");
			//throw new ArithmeticException("> 점수 범위 0~100 ~~");
			throw new ScoreOutofBoundException("> 점수 범위 0~100 ~~");
		}
		
		return score;
	}

} // class

// class ScoreOutofBoundException extends RuntimeException{ // unchecked 예외
class ScoreOutofBoundException extends Exception{ // checked 예외 
	
	private static final long serialVersionUID = -1361386386864749666L;
    
	
	// 예외 코드 번호
	private final int ERROR_CODE;
	
	// getter 
	public int getERROR_CODE() {
		return ERROR_CODE;
	}

	
	public ScoreOutofBoundException(int error_code, String message) {
		super(message);
		this.ERROR_CODE = error_code; 
	}
	
	public ScoreOutofBoundException(String message) {
		this(1001, message);
	}
	
}








  