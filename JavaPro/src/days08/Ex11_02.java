package days08;

/**
 * @author kenik
 * @date 2025. 2. 12. - 오후 5:28:00
 * @subject 1+2+3+4+5+6+7+8+9+10 = 50
 * @content
 */
public class Ex11_02 {

	public static void main(String[] args) {
        // 1~10=55
		// int result = sum(10);
		
		// 1~10 재귀함수
		int result = recursiveSum(10);
		System.out.println( result );

	} // main
	//[★시험문제★] 재귀 함수
	private static int recursiveSum(int n) {
		if( n == 1) return 1;
		else        return n + recursiveSum(n-1);
	}

	private static int sum(int n) {
		int result = 0 ;
		for (int i = 1; i <= n; i++) {
			result += i;
		} // for i
		return result;
	}

} // class