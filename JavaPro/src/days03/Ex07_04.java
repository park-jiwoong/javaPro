package days03;
/**
 * 
 * 
 * @subject 논리연산자
 *
 */

public class Ex07_04 {

	public static void main(String[] args) {
		/*
		 * 1. 일반 논리 연산자
		 * 	1) !	부정연산자 또는 Not 연산자
		 * 	2) &&	일반 논리 AND 연산자 (	논리곱 )
		 * 		ture && true	=> ture
		 * 		false && true	=> false
		 * 		true && false	=> false
		 * 		false && false 	=> false
		 * 
		 * 	3) ||	일반 논리 OR 연산자 ( 논리합 )
		 *		true || true	=> true
		 *		false || true	=> true
		 *		true || false	=> true
		 *		false || false	=> false
		 *

		 
		 *		연산자 우선 순위 : ! > && > ||
		 *
		 * 2. 비트 논리 연산자
		 * 	1) ~	비트 부정연산자 or 틸트 연산자
		 * 	2) &	비트 논리 AND 연산자
		 * 	3) |	비트 논리 OR 연산자
		 * 	4) ^	e[X]clusive	or 연산자,	XOR 연산자  *exclusive : 배타적인
		 * 
		 * 논리연산자의 우선 순위👌 (시험문제 암기)
		 * ~ > 	&	>	^	|	>	&&	>	||
		 * 
		 */
		
		System.out.println(10 & 3);	// 2
		//		0000 1010
		//	&	0000 0011	// AND
		//		0000 0010
		
		System.out.println(10 | 3);	// 11
		//		0000 1010
		//	|	0000 0011	// OR
		//		0000 0010
		
		System.out.println(10 ^ 3);	// 09
		//		0000 1010
		//	^	0000 0011	// XOR
		//		0000 0010
		
		 //System.out.println(10); 	//10
		 //System.out.println(~10); 	//-11
		
		//							0000 1010
		//							1111 0101
		//							1111 0100
		//							0000 1011		
		
		//연산자 우선 순위 파악			[!]			>
		//The operator ! is undefined for the argument type(s) int
		//System.out.println(!5 > 3);	// false	[!]사용 불가능
		System.out.println(!true); 	// false
		System.out.println(!false);	// false
		
		System.out.println(3>5 && 5<7); // true
		//						false &&
		//						 효율적 연산 (short circuit evaluation)
		System.out.println(13>5 && 5<7);// true
	
	}

}
