package days22;
/**
 * 유닉스 histroy 명령어를 Queue를 이용해서 구현한 예제
 * 							FlOT 구조
 * 
 * 
 * 
 */
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex07_05 {
	// 객체 생성 X
	static Queue q = new LinkedList<>();
    static final int MAX_SIZE = 5;  // Queue에 최대 5개까지만 저장되도록 한다.
	
	public static void main(String[] args) {
		        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

		        while (true) {
		            System.out.print(">> ");
		            try {
		                // 화면으로부터 라인단위로 입력받는다.
		                Scanner s = new Scanner(System.in);
		                String input = s.nextLine().trim();

		                if ("".equals(input)) continue; // 공백이 되든 입력을 안하든 다시 메뉴로 돌아가게끔 설정 해줌

		                if (input.equalsIgnoreCase("q")) { // 대소문자 상관없이 q를 입력했다면 프로그램 종료하라는 메소드
		                    System.out.println("\t\t 프로그램 종료됨!!!");
		                	System.exit(0); // 프로그램 종료를 할 때 다른 프로세서에게 0이라는 값을 전달 하겠다는 뜻 (0,1,-1) 이런 식으로 프로세서에 알려줌
		                } else if (input.equalsIgnoreCase("help")) { // 대소문자 상관없이 help 입력되면 저렇게 나옴
		                    System.out.println("help - 도움말을 보여줍니다.");
		                    System.out.println("q 또는 Q - 프로그램을 종료합니다.");
		                    System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
		                } else if (input.equalsIgnoreCase("history")) { //
		                    int i = 0;
		                   

		                    // LinkedList의 내용을 보여준다.
		                    LinkedList tmp = (LinkedList) q;
		                    ListIterator it = tmp.listIterator();

		                    while (it.hasNext()) {
		                        System.out.println(++i + "." + it.next());
		                    }
		                    save(input);  // 입력받은 명령어를 저장하고,
		                } else {
		                    save(input);
		                    System.out.println(input);
		                }
		            } catch (Exception e) {
		                System.out.println("입력 오류입니다.");
		            }
		        }
		    }//main

		    public static void save(String input) {
		        // queue에 저장한다.
		        if (!"".equals(input)) // input 빈 문자열이 아니라면, 굳이 이 if는 필요가 없음
		            q.offer(input);

		        // queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		        if (q.size() > MAX_SIZE)  // size()는 Collection 인터페이스에 정의
		            q.remove();				// poll 로 보통 사용함
		    }

	}//class
