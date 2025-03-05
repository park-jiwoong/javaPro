import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	//출력형식
//		    		[1 게임]		[42][36][21][38][6][26]
//					[2 게임]		[11][7][19][2][25][15]
//					[3 게임]		[36][33][44][42][18][10]
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();
		
		HashSet lotto = new HashSet();
		
		while (lotto.size() < 6); {
			Random rnd = new Random();
			int n;
			n = rnd.nextInt(45);
		}
		
		
	}// main


}// class
