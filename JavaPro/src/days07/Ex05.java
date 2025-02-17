package days07;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오후 12:19:32
 * @subject 자바 1권 p 136 break 문
 * @content
 */

public class Ex05 {

	public static void main(String[] args) {
			//i는 1일때 for문 안으로 들어옴
			//
			
	        for (int i = 1; i <= 9; i++) {
	           for (int d = 2; d <= 9; d++) {  // 단
	        	   if( d ==5) break; //전체 for문에서 스탑 시킬수 있는 :
	              System.out.printf("%d*%d=%2d ", d, i, d*i);
	           } // for d
	           System.out.println();
	       }//for
	}//main

}//class
