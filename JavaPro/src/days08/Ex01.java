package days08;

public class Ex01 {

	public static void main(String[] args) {
		// [정보처리 기사 실기 시험]
		// 1+2+3+4+.. +10=55
		//  1 1 1 1   1
		
		// 항(term)
		// 1+2+4+7+11+16+22+29+..92=469
		//  1 2 3 4  5  6  7
		
		int sum = 0;
	      int term = 1;
	      int inc = 1;
	      
	      while ( term <= 100 ) {  // 1<=100 t
	         sum += term;
	         System.out.printf("%d+", term);    // 1+         
	         term += inc++;
	      } // while
	      System.out.printf("=%d", sum);
		
			
			
		
		
	} //main

} // class