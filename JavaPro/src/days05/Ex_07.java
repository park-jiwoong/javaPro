package days05;

public class Ex_07 {

	public static void main(String[] args) {

		//자바에서 임의의 수를 발생시키는 코딩.
		// 1) Math.random() 메서드 *** 사용해서 발생
		// 2) Random 클래스	클래스 class
		
		//Math 클래스 : 수학과 관련된 기능이 구현된 클래스
		//System.out.println(Math.abs(10));		//10
		//System.out.println(Math.abs(-10));	//10
		
		/* 
		//Math.random(); // 0.0 <= 같거나 크고 [double] <1.0 보다 작은 수 표시
		for (int i = 0; i < args.length; i++) {
			System.out.println(Math.random());

		} // for i
		*/
		
		// 로또 번호 1~45 임의의 수 6개
		//doulbe -> int 형변환
		// 1 <= (int)(Math.random() * 45)+1 < 46
		
		
		//국어 0~100 발생시키는 작업
		
		/* [로또번호 중북 문제 예제]
		int lottoNumber;
		for (int i = 1; i <= 6; i++) {
			lottoNumber = (int)(Math.random()* 45)+1;
			System.out.printf("[%d]", lottoNumber);
			
	//} for i
		*/
		// 3 ~ 19
		Math.random();
        //3 <= (int)(Math.random() * (19 - 3 + 1)) + 3 <= 19

		 
		
	}//main

}//class
