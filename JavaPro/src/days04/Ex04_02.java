package days04;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {

		String input = "1        fish  2fish red fish blue fish";
		// Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		Scanner s = new Scanner(input);
		s.useDelimiter("\\s*fish\\s*"); // 정규표현식(String regex)
		//문법 암기해두면 좋을 것 같다
		
		//               \s   공백
		//               *    반복횟수  0~여러번
		
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
		
		
		
	}

}
