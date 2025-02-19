package days08;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		// 로또 번호를 채워주는 메소드
		// 중복 체크 메소드
		// 로또 출력 메소드
		// 메서드 선언만 하면 된다
		
		int[] lotto = new int[6]; // 이 배열에다 채워둔다

		fillLotto(lotto); // 채워두는 메소드라고 생각
		dispLotto(lotto); // 로또 번호 출력하는 함수

	}// main
		// [★시험문제★] 두 정수의

	  public static void fillLotto(int[] lotto) {
	      int index = 0, n;
	      lotto[index++] = getRandomInteger(1, 45); 
	      while ( index <= 5 ) {
	         n =  getRandomInteger(1, 45);              
	         if( !isDuplicateLotto(lotto, n, index) ) //중복되지 않는 값 랜덤으로 뽑힐 때...
	            lotto[index++] = n;
	      } // while


	}
	// [★시험문제★]
	private static boolean isDuplicateLotto(int[] lotto, int n, int index) {
		boolean flag = false;
		for (int i = 0; i < index; i++) {
			if (lotto[i] == n) {
				System.out.println("*");
				flag = true;
				break;
			}
		} // for i
		return flag;
	}
	// [★시험문제★] 임의 메소드 함수 입력
	public static int getRandomInteger(int min, int max) {
		return (int) (Math.random() * max - min + 1) + min;
	}

	private static void dispLotto(int[] lotto) { //수열 [] 값에 들어가 있는걸 하나씩 출력을 보여주기 위한 메소드
		System.out.print("1게임 :");
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);
		}
		System.out.println();
	}

}// class
