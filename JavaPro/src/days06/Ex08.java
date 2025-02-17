package days06;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 이름 입력 ?");
		//name = scanner.nextLine(); // next 만 사용시 '홍'만 출력 / nextLine "홍 길동" 까지 출력
		name = scanner.next();
		
		System.out.println(name);
		System.out.println("end");
		
}//main
}//class
