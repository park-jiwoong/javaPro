package days18;

import java.util.Random;

public class Ex05_02 {

	public static void main(String[] args) {

		int number = 100;
		int result = 0;

		Random rnd = new Random();
		int n = -1;
		for (int i = 0; i < 10; i++) {
			n = rnd.nextInt(5); // 0 <= 정수 <5

			// java.lang.ArithmeticException
			// 예외처리 X
			result = number / n;

			if (n == 0) {
				i--;
				continue;
			} // if
			result = number / n;
			
			System.out.println(result);

		} // for
	}

}
