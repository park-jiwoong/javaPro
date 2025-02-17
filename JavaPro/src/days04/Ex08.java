package days04;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 * 반복문 : for문 / foreach 문
 *
 */

public class Ex08 {

	public static void main(String[] args) {
		// for / foreach 자주 사용하는 문법
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하시오 ?");
		
		String input = scanner.nextLine();
		String[] names = input.split(",\\s*"); 
		
		for (String name : names) {
			System.out.println(name);
		}
		
		scanner.close();
		
	}

}
