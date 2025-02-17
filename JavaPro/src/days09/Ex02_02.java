package days09;

import java.util.Iterator;

public class Ex02_02 {

	public static void main(String[] args) {
// 거듭제곱 == 멱
// 2^3
		//2를 밑수(base)
		//3을 지수(exponent, power)
		//밑수를 지수만큼 반복해서 곱하는 수
				
		//double result = recursivePower(2,3);  //0.125
		double result = recursivePower(2,-3);	//0.125
		System.out.println(result);
		
		
	}//main
	// 재귀 함수 메서드 (자신을 다시 호출하여 문제를 해결하는 함수)
/*	private static double recursivePower(int b, int e) {
		// 2, 3
		if (e > 0) { //양수일 때 0 보다 크다로 표시
			return b* recursivePower(b, e-1); 
		}
		return 1;
	
	}
*/
	private static double recursivePower(int b, int e) {
	      if( e < 0  )      return 1/recursivePower(b,  -e);
	      else if( e == 1 ) return b; 
	      else              return b * recursivePower( b, e-1);
	   }
	
	// 일반 함수 메서드 (특정 작업을 수행후 종료되는 함수)
	private static double power(int b, int e) {
								//2		//-3
		int result = 1; //반복해서 곱해야 하기때문에 1값 줌
		int e2 = Math.abs(e); // 이걸로 단순화
		for (int i = 1; i <=e2; i++) {
			result *= b;
		}// for i
		return e < 0? 1/result : result;
	
	}// power
	
}//class
