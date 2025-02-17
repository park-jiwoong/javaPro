package days09;

public class Ex03_02 {

	public static void main(String[] args) {
			// 주민등록번호 (Resident registration number)
			String rrn = "830412-1700001";
			// 1)		830412-*******
			String [] rrnArr = rrn.split("-");
			// + 문자열 연결연산자
			System.out.println(rrnArr[0]+"-*******");
			// String.concat() 문자열 연결 메서드
			System.out.println(rrnArr[0].concat("-*******"));
			
			// 2)		830412-1******
			System.out.println(rrnArr[0]+"-" +rrnArr[1].charAt(0)+ "******");
			// String.concat() 문자열 연결 메서드
			//rrnArr[0].concat("-").concat(rrnArr[1].charAt(0) +"").concat("******")
			//많은 문자열을 추가할때 concat 사용하니까 그냥 + 쓰는게...
	}//main

}//class
