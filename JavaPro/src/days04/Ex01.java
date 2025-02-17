package days04;

public class Ex01 {

	public static void main(String[] args) {

		// 연산자 : instancecof 연산자
		// >> >>> << 쉬프트 (shift) 연산자
		// 방향을 바꾸다, 이동시카다, 옮기다.
		// >>= <<= 복합대입연산자.

		System.out.println(15 >> 2); // 00001111>>2
										// 00000011
		System.out.println(15 >>> 2); // 00000011
		System.out.println(15 << 2); // 00111__ -> 0011100
//		

		// 00001111
		// String vb = Integer.toBinaryString(15); //어떤 열의 이진수의 문자열로 반환
		// //메소드 // 1111을 00001111로 만들기 오늘 연습★

		// System.out.println("%08s",Integer.parseInt(b) );

		System.out.println(Integer.toOctalString(15)); // 8진수 문자열
		System.out.println(Integer.toHexString(15)); // 16 진수 문자열
		
	}

}
