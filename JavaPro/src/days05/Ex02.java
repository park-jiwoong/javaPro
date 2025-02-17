package days05;

public class Ex02 {

	public static void main(String[] args) {

		// 동일한 작업을 10번 반복 -> 반복문
		/*
		System.out.println("이창익");
		System.out.println("이창익");
		System.out.println("이창익");
		System.out.println("이창익");
		System.out.println("이창익");
		System.out.println("이창익");
		System.out.println("이창익");
		System.out.println("이창익");
		System.out.println("이창익");  // 설명... 
		*/
		// for ( 초기식 ;  조건식 ; 증감식) {}
		
		//  i=10      10<10 t
		/*
		 * 1 2 3 4 5 6 7 8 9 10
		 */
		
		/*
		 * 
		System.out.println("test");
		System.out.println("test2");
		System.out.println("test");
		System.out.println("test");
		
		for (byte i = 1; i <= 10 ; i--) {
			System.out.printf( "홍길동-%d\n",  i );
		} // for i

		// System.out.println("홍길동-1");

		System.out.println("test");
		System.out.println("test");
		System.out.println("test7");
		System.out.println("test");
		
		//System.out.println("홍길동-1")
		System.out.println("end");
		*/
		
		/*
		int i = Integer.MIN_VALUE;
		System.out.println( i );  // -2147483648
		long l = i - 1;
		System.out.println(  l  );
		*/
		
		String n1 = "admin", n2 = "Admin" ;
		// 대소문자를 구분하지 않고 문자열 비교
		System.out.println( n1.equalsIgnoreCase(n2) );
 
/*		/*
		n1 =  n1.toUpperCase();
		n2 =  n2.toUpperCase();
		
		n1 =  n1.toLowerCase();
		n2 =  n2.toLowerCase();
		System.out.println( n1.equals(n2) );
		*/
		
		/* [1] 풀이~
		// == X
		// ?:  삼항연산자 / 조건연산자
		System.out.println( n1.equals(n2) ? "같다" : "다르다"  );
		
		if ( n1.equals(n2) ) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		} // if
		*/

	}

}
