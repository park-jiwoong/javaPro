package days08;

public class Ex02 {

	public static void main(String[] args) {
		// [정보처리 기사 시험] 피보나치 Fibonnaci 수열
		//		10항의 합 ( 반복문 for /while )
		// 1+1(앞에 1+1은 고정)+2+3+5+8+13...

	      int firstTerm = 1, secondTerm = 1, thirdTerm;
	      int sum = firstTerm + secondTerm; // 2
	      System.out.printf("%d+%d+", firstTerm, secondTerm);
	      int termLength = 2;
	      
	      while (  termLength < 10 ) {
	         thirdTerm = firstTerm + secondTerm;         
	         System.out.printf("%d+", thirdTerm);
	         sum += thirdTerm;
	         
	         firstTerm = secondTerm; 
	         secondTerm = thirdTerm;         
	         termLength++;
	         
	      } // while
	      
	      System.out.printf("=%d", sum);
	      
	      
	      // [1] 1+1+2+3+5+8+13+21+34+55+=143

		
/*(내가 한 것)
 
		int sum = 0; // 수열의 합을 저장할 변수
		int a = 1; //첫 번째 항
		int b = 1; //두 번째 항
		int count = 10; //10항의 합 
	
		sum = a + b;
		
		for (int i = 3; i <= count; i++) {
			int next = a + b;
			sum += next; //sum = sum + next; 
			a = b;
			b = next;
			
		}// for i
		System.out.printf("%d", sum);
*/	
		
		
/*	
   int[] m = new int[10];
      m[0] = m[1] = 1;
      int sum = 2;
      System.out.printf("%d+%d+", m[0], m[1]);  // 1+1+      
      for (int i = 2; i < m.length; i++) {
         m[i] = m[i - 2] + m[i - 1]  ;
         sum += m[i];
         System.out.printf("%d+", m[i]);
      } // for
      System.out.printf("\b=%d", sum);
*/

	
		

	}//main

}//class
