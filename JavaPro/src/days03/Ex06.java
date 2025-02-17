package days03;

public class Ex06 {

	public static void main(String[] args) {
		//Btye.parseByte("90") -> 90
		//int 가장 큰 값 : 2,147,483,647
		//long	"	:
		
		//래퍼클래스(Wrapper) 기본형을 사용하기 쉽도록 int -> 기능(메서드)이 구현된 클래스(물건,부품,객체,개체)
		System.out.println(Integer.MAX_VALUE); //문자열 "90"을 문자열으로 '90"반환시켜주는 역활
		String strKor = "90";
		// int kor = integer.parseInt(strKor)
		
		//byte -> Byte
		//byte kor = Byte.parseByte(strKor);
		
		//double -> double
		double kor = Double.parseDouble(strKor);
				
		//long -> Long
		//short -> Short
		//float -> Float
		//char -> Character
		
		
	}//main

}// class
