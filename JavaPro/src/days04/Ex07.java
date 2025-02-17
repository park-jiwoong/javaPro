package days04;

import java.util.Scanner;

/**
 * 
 * 
 * @author pjw55 분기문 / 스위치문 switch coast
 */

public class Ex07 {

	public static void main(String[] args) {
		// [시험 문제] switch 문 사용
		// 정수를 입력받아서 "홀수"/"짝수" 라고 출력
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 정수(n) 입력 ? ");
		n = scanner.nextInt();
		// key : 수식, 변수 상수X
		// value: 값(byte, short, int, char, String, 또는 열거형(enum) 타입), 변수 X
		String result = null;
		switch (n % 2) {
		case 0:
			// System.out.println("짝수(Even Number)");
			result = "짝수(Even Number)";
			break;
		case 1:
			// System.out.println("홀수(Odd Number)");
			result = "홀수(Odd Number)";
			break;
//				default:
//					System.out.println("홀수(Odd Number)");
//					break;
		} // switch
		System.out.println(result);

		System.out.println("end");
	}

}
