package days03;

public class Ex06_04 {

	public static void main(String[] args) {
		//int i = 100;
		
		int i = Integer.MAX_VALUE;
		int j = 200;
		long k = i + (long)j ;  // int	산술 오버플로워 발생...
		
		System.out.printf("%d + %d + %d \n", i, j, k);
		
		
		
	} //main

} //class
