package days07;

/**
 * @author kenik
 * @date 2025. 2. 11. - 오후 12:19:32
 * @subject 
 * @content
 */
public class Ex04_03 {

   public static void main(String[] args) {
      // [for문] 구구단 출력 - (가로로 출력)
      // [for문] 구구단 출력 - (세로로 출력)
      // 2 3 4 5
      // 6 7 8 9
      
      // k=1   d = 2;    4*k-2
      // k=2   d = 6;  
      
      for (int k = 1; k <=2 ; k++) {
         for (int i = 1; i <= 9; i++) {
            for (int d = 4*k-2; d <= 4*k-2+3; d++) {  // 단
               System.out.printf("%d*%d=%2d ", d, i, d*i);
            } // for d
            System.out.println();
         } // for i   
         System.out.println();
      } // for k
      
      /* [1]
      for (int i = 1; i <= 9; i++) {
         for (int d = 2; d <= 5; d++) {  // 단
            System.out.printf("%d*%d=%2d ", d, i, d*i);
         } // for d
         System.out.println();
      } // for i   
      System.out.println();
      for (int i = 1; i <= 9; i++) {
         for (int d = 6; d <= 9; d++) {  // 단
            System.out.printf("%d*%d=%2d ", d, i, d*i);
         } // for d
         System.out.println();
      } // for i   
      */
     
/*
2*1=02 3*1=03 4*1=04 5*1=05 
2*2=04 3*2=06 4*2=08 5*2=10 
2*3=06 3*3=09 4*3=12 5*3=15 
2*4=08 3*4=12 4*4=16 5*4=20 
2*5=10 3*5=15 4*5=20 5*5=25 
2*6=12 3*6=18 4*6=24 5*6=30 
2*7=14 3*7=21 4*7=28 5*7=35 
2*8=16 3*8=24 4*8=32 5*8=40 
2*9=18 3*9=27 4*9=36 5*9=45 

6*1=06 7*1=07 8*1=08 9*1=09 
6*2=12 7*2=14 8*2=16 9*2=18 
6*3=18 7*3=21 8*3=24 9*3=27 
6*4=24 7*4=28 8*4=32 9*4=36 
6*5=30 7*5=35 8*5=40 9*5=45 
6*6=36 7*6=42 8*6=48 9*6=54 
6*7=42 7*7=49 8*7=56 9*7=63 
6*8=48 7*8=56 8*8=64 9*8=72 
6*9=54 7*9=63 8*9=72 9*9=81 
 */

	}//main

}//class
