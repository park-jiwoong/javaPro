package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
	 * 
	 * //Type Convert(형 변환)
		// 1) 자동 형 변환
		// 2) 강제 형 변환
	 *  int -> byte
	 *  byte -> long
	 * @author pjw55
	 *
	 */

public class Ex06_02 {

	public static void main(String[] args) throws IOException {
		// [시험문제]
		//이름, 국어, 영어, 수학 점수를 입력받아서
		//총점
		//평균
		//[ 출력 ]
		// 이름="홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33 
		String name;
		
		byte kor, eng, mat; // 국 영 수 총 점수 300점
		
		short tot; //크게 수를 넣을 수있다
		
		double avg;
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print("> 이름 입력 ? ");			//이름은 문자로 입력
		name = br.readLine();
		
		System.out.print("> 국어 입력 ? ");			//국어, 영어, 수학은 정수 (숫자를 입력해줘야함)
		kor = Byte.parseByte(br. readLine());
		
		System.out.print("> 영어 입력 ? ");
		eng = Byte.parseByte(br. readLine());

		System.out.print("> 수학 입력 ? ");
		mat = Byte.parseByte(br. readLine());

		//Type mismatch: cannot convert from int to short
		//short		(타입이 다른다)	int
		
		// 자바의 형 변환
		tot = (short) (kor + eng + mat); //cpu 내부에서 int 작은 자령을 연살할 때 내부적으로 
		avg = (double)tot/3; // 정수의 과목이라 소수점의 의미가 없다 (소수점 넣지 말자)
		
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%5.2f\n", name, kor, eng, mat, tot);
		
		
		

		
	}//main

}//class
