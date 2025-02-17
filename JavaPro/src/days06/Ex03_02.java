package days06;

public class Ex03_02 {
	public static void main(String[] args) {
		
		int sum = 0, i = 0;

		while (i++ <= 10) {
			if (i % 2 == 0) continue;
			System.out.printf("%d+", i);
			sum += i;

			} // while
			
			System.out.printf("\b=%d\n", sum);

/*
		int sum = 0, i = 0;
		      while (i < 10) {
		         if (i++ % 2 != 0) {
		            continue;
		         }
		         System.out.printf("%d+", i);
		         sum += i;
		      } // while
		      System.out.printf("\b=%d\n", sum);
*/		
		
	}// main
}// class
