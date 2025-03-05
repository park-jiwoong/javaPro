package days22;

import java.util.Deque;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 스택 	활용 예 - 수식계산, 수식괄호검사, 웹브라우저 뒤로/앞으로 등
 * 큐	활용 예 - 최근사용문서, 인쇄작업 대기 목록 등
 * 
 *
 *
 */
public class Ex07_04 {

	public static void main(String[] args) {
	    if(args.length!=1) {
	        System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
	        System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
	        System.exit(0);
	    }

	    Stack st = new Stack();			// LIFO 구조 먼저 들어가고 가장 나중에 나옴
	    String expression = args[0];	//	(2+3)*1+3

	    System.out.println("expression:" + expression);

	    try {
	        for (int i = 0; i < expression.length(); i++) {
	            char ch = expression.charAt(i);

	            if (ch == '(') {
	                st.push(ch + ""); // "("
	            } else if (ch == ')') {
	                st.pop();			// pop에는 예외가 발생함
	            }
	        }

	        if (st.isEmpty()) {
	            System.out.println("괄호가 일치합니다.");
	        } else {
	            System.out.println("괄호가 일치하지 않습니다.");
	        }
	    } catch (EmptyStackException e) {
	        System.out.println("괄호가 일치하지 않습니다.");
	    }
	    
	    
	}

}