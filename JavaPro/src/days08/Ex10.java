package days08;

/**
 * @author kenik
 * @date 2025. 2. 12. - 오후 4:44:49
 * @subject 두 기억공간의 값을 바꾸기.
 * @content days03.Ex03.java
 *			매개변수를 가지고 메서드를 호출하는 방법
 *			1) Call By name	drawLine()
*		2) Call By Value	sum(10)	isLeayYear(i)
*		3) Call By Reference
*
*
*/						

public class Ex10 {

	public static void main(String[] args) {
		//매개변수와
		//리턴값은 자유롭게 사용
		int x = 10, y = 20;
		System.out.printf("> x=%d, y=%d\n", x, y);

		swap(x, y);
		
		System.out.printf("> x=%d, y=%d\n", x, y);

		
	}// main

	private static void swap(int x, int y) {
		System.out.printf("> x=%d, y=%d\n", x, y);
		int temp = x; // 10		
		x = y; // 20
		y = temp; // 10
		
	}

}// class
