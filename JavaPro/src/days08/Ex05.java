package days08;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//오버로딩(중복함수==)
		//drawLine()
		//drawLine(int)
		//drawLine(int, String)
	
		int x, y, result;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> x, y inpute?");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		//result = x + y;
		//두 정수의 합을 반환하는 sum() 메서드를 선언 -> 호출
		result = sum( x, y ); // 30값이 와 있다고 생각
		
		System.out.printf("%d+%d=%d\n", x, y, result);
	
	
	
	
	}//main
	
	// 메소드 선언부
	private static int sum(int x, int y) {
		int result = x + y;
		//return result; // return 문에는 수식을 사용할 수 있음;
		 return x + y;
	}
	
}//class
