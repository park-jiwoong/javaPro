package days03;

public class Ex07_06 {

	public static void main(String[] args) {
		// ?: 삼향연산자 or 조건연산자
		int x = 30, y;
		//y = x > 10 ? 1 : 2;
		y = (x > 5 ? (x < 10 ? 1 : 2): 200); //삼향연산자에 중첩으로 올 수 있다
		System.out.println( y );
		
		
		
		
	}// main

}// class
