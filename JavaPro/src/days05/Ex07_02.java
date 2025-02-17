package days05;

import java.util.Scanner;

public class Ex07_02 {
	//가위 바위 보 게임
	public static void main(String[] args) {
		int com, user;
	      Scanner scanner = new Scanner(System.in);

	      com = (int) (Math.random() * 3) + 1;

	      System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
	      user = scanner.nextInt();

	      System.out.printf("> com=%d, user=%d\n", com, user);

	      // 승자 판단해서 출력...
	      switch (user - com) {
	      case 0:
	         System.out.println("무승부");
	         break;
	      case 1:
	      case -2:
	         System.out.println("사용자 승리");
	         break;
	      case -1:
	      case 2:
	         System.out.println("컴퓨터 승리");
	         break;
	      } // switch

	}

}
