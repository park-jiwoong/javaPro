package days09;

public class Ex02 {

	public static void main(String[] args) {

		// 팩토리얼(factorial) == 계승
		// n!
		// 0! = 1 정의한다
		// int result = factorial (5);
		int result = recursiveFactorial(5);
		System.out.println("=" + result);

	}

	private static int recursiveFactorial(int n) {
	      if( n == 1  || n == 0 ) return 1;
	      else         return n * recursiveFactorial(n-1);
	   }

	   private static int factorial(int n) {
	      // 1*2*3*4*....*n = n!
	      int result = 1;
	      for (int i = 1; i <= 0; i++) {
	         System.out.printf("%d*", i);
	         result *= i;
	      } // for i
	      
	      return result;
	}// main

}// class
