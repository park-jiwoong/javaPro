package days22;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 
 * Priority[Queue]
 * 우선순위
 * 	ㄴ FIFO 구조 X
 * 	ㄴ 저장된 순서에 상관없이 우선순위가 높은 것 부터 꺼내는 구조
 * 	ㄴ null 저장할 수 없다 (NullPointerException 발생)
 *
 */
public class Ex07_06 {

	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		
		// 숫자는 우선 순위가 높은 것 - (작은 숫자)
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		
		}//while
		
	}//main

}//class
