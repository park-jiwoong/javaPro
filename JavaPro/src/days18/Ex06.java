package days18;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오후 12:25:28
 * @subject Chapter 11 예외처리 p466
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// [try ~ catch 블럭 실행 과정 이해.]
		System.out.println("1 - DB Open..."); // ⓐ
		try {
			System.out.println("2");
			System.out.println(100 / 10); // 예외 발생
			System.out.println("3");

		} catch (ArithmeticException e) {
			System.out.println("4");
		} catch (Exception e) {
			System.out.println("5");
		} finally {						// 이 블럭은 try {} 블럭에서 예외가 발생 유무에 상관없이
										// 실행할 코딩을 하는 블럭이다. (필수는 아님 꼭 해야하 하는 경우 ⓐ)
			System.out.println("6 - DB Cloos..."); // ⓐ
		}
		System.out.println("7");
		System.out.println("end");

	}// main

}// class
