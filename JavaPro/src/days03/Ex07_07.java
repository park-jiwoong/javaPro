package days03;

public class Ex07_07 {

	public static void main(String[] args) {

		
//		System.out.println(+3);
//		System.out.println(-3);
		
		// instanceof 연산자 : 클래스 수업 X 
		
		
		// [ 증감연산자 ++ -- ]
		// [시험문제] 어떤 기억공간의 값은 1증가 시키는 코딩을 하세요
		// [시험문제] 어떤 기억공간의 값은 1감소 시키는 코딩을 하세요
		// [시험문제] 어떤 기억공간의 값은 n증가 시키는 코딩을 하세요
		
		int x = 10;
		// x = 11;
		// 1) x = x + 1;			X = x - 1
		// 2) x +=  1;				X -= 1
		
		//단독으로 증감연산자를 사용할 때는 전위형 == 후위형
		System.out.println( x );  // 10
		
		//int y = ++x; // 전위형
		int y = x++; // 후위형
		
		System.out.printf("> x=%d, y=%d\n", x, y);
		
		
	} // main

} // class
