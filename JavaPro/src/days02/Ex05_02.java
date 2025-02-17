package days02;

public class Ex05_02 {

	public static void main(String[] args) {
		
		// 기본형 - 논리형(blooleam)
		boolean gender; //(식별자 변수명)
		//	[	] 1바이트 true/false 저장
		//	gender
		
		//Type mismatch: cannot convert from int to boolean 
		//gender = 100;
		
		gender = true;
		
		//The local variable gender may not have been initialized (갑을 초기화 하라는 작업을 시행하라는 뜻)
		System.out.println(gender);
		//출력형식 : 성별은 true이다.
		System.out.println("성별은" + gender + "이다.");
		
		System.out.printf("성별은 %b1(1%B)(%1$s)이다.", gender);
		//boolean or Boolean <- conversion
		
	} //main
	
} // class
