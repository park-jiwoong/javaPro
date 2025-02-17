package days04;

import java.util.Scanner;

public class Ex04_04 {

	public static void main(String[] args) {

		// 이름(String), 나이(byte), 키(double), 성별(boolean) 입력받아서 출력.
	      // (출력형식)
	      // > 이름:홍길동, 나이:20살, 키:178.89, 성별:남자/여자
		
		
		String name;
		byte age;
		double height ;
		boolean gender;
		
		Scanner Scanner = new Scanner(System.in);
		
		// 홍길동 20 170.89 true
		System.out.print(">이름 나이 키 성별 입력 ?");
		name = Scanner.next();
		age = Scanner.nextByte();
		height = Scanner.nextDouble();
		gender = Scanner.nextBoolean();
		
		System.out.printf("> 이름:%, 나이:%살, 키:2f, 성별:%s\n"
				, name, age, height, gender? "남자":"여자");
		
		//[시험 체크] 홍길동, 20, 178,89,true, Scanner 의 구분자를 콤마(,) 설정...
		
		
	}

}
