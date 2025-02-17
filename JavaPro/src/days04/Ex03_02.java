package days04;

public class Ex03_02 {

	public static void main(String[] args) {
		// 학생의 이름을 여려명 저장 -> 배열 선언
		
		String [] names = null;
		//The [local variable] names may not have been initialized
	names = new String[10];
		names [0] = "홍길동";
		names [1] = "이창익";
		
		System.out.println(names [0]);
		//ArrayIndexOitofBoindsException
		//배열 첨자값 범위 벗어났다. 오류
		System.out.println(names[10] );
		
	}

}
