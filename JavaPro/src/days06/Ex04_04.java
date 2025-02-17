package days06;

import java.util.Scanner;

public class Ex04_04 {

	public static void main(String[] args) {
		// [while] 두 정수(n, m)을 입력받아서 두 정수 사이의 합을 출력. 
				// n=2    m=5
				// 2+3+4+5=14
				
				int n, m ;
				Scanner scanner = new Scanner(System.in);
				System.out.print("> 양의 정수( n m ) 입력 ? ");
				n = scanner.nextInt();
				m = scanner.nextInt();	
				
				int sum = 0;
				 
				int min = n > m ? m : n ; // Math.min(n,m);
				int max = Math.max(n, m);
				
				if(min % 2==0) min++; // 홀수를 짝수로 바꾸자○
				
				// [2]
				while( min <= max) {
					if (min <= max)
					System.out.printf("%d+", min);
					sum += min;
					min+=2; //2식 증가를 하대↑
				} //

				/* [1]
				int i = min;
				while( i <= max) {
					System.out.printf("%d+", i);
					sum += i;
					i++;
				} //
				*/ 
				
				System.out.printf("\b=%d\n", sum);
		
	}
}
