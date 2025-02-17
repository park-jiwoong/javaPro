package days03;

/**
 * 
 * 비교연산자 : 크고 작음, 같고 다름을 비교
 * 		ㄴ 결과값 boolean (true/false)

 */



public class Ex07_03 {

	public static void main(String[] args) {
		int i = 30, j = 3;
		
		System.out.println(i > j); 	//true
		System.out.println(i < j); 	//false
		System.out.println(i >= j);	//true
		System.out.println(i <= j);	//false
		
		// i	j 같다고 했을 때
		//System.out.println(i = j);	//false
		System.out.println(i == j);		//false (같다 표기)
		System.out.println(i != j);
		//The operator ! is undefined for the argument type(s) int
		//System.out.println(i =! j);		//false (다르다 표기)

		
	}

}
