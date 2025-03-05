package days22;
/**
 * 
 * C → L → LinkedList 컬렉션 클래스
 * 		1. 배열의 단점
 * 			1) 배열 크기 자동(동적) 증가 X
 * 			2) [][][][3][→][→][][][]
 * 					← ← ←
 * 					10 삽입
 * 					삭제
 * 				데이터를 삽입, 삭제할 때 성능이 떨어진다.5
 * 		
 * 		2. 배열 장점
 * 			읽기 성능이 가장 빠르다
 * 
 * 		3. 배열의 단점 → LinkedList 컬렉션 클래스
 * 						(특징) 비연속적
 * 		노드(Node)
 * 		다음요소 주소 저장
 * 		0번째 요소		2번요소		3번 요소
 * 		[0x500]		[0x300]		[null]
 * 		[3]			[10]		[5]
 * 		0x100		0x200		0x300
 * 
 * 					1번 요소
 * 					[0x300]
 * 					[100]
 * 					0x500
 */		


public class Ex06 {

	public static void main(String[] args) {
		Node node1 = new Node();
		node1.value = 10;
		Node node2 = new Node();
		node2.value = 15;
		node1.next = node2;
		Node node3 = new Node();
		node3.value = 17;
		node2.next = node3;
		Node node4 = new Node();
		node4.value = 34;
		node3.next = node4;
		node4.next = null;
		
		//[문제] node2와 node3 사이에 node5(100) 정수값 value(가지는) 추가하는 코딩을 하세요.
		Node node5 = new Node();
		node5.value = 100;
		node5.next = node2.next;
		node2.next = node5.next;
		
		//[문제] node3 삭제
		node5.next = node4;
		
		Node node = node1;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		
		}//while

		
	}//main

}//class

// 단방향 링크드 list
class Node{
	//Node prev = null;
	int value = 0;
	Node next = null; //뒤의 노드의 주소를 저장할 참조변수
}