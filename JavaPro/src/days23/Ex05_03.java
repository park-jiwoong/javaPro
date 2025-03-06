package days23;

import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;

public class Ex05_03 {

	public static void main(String[] args) {

		int[] score = {80, 98, 50 ,85 ,45 ,65 ,10 ,100};
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < score.length; i++) {
			ts.add(score[i]);			
		}//for

		// [10, 45, 50, 65, ]
		System.out.println(ts);
		
		//범위 검색 50 <= <80
		//[50, 65]
		System.out.println(ts.subSet(50, 80));
		
		//범위 검색 80 이상의 점수
		//[80, 85, 95, 100]
		System.out.println(ts.tailSet(80));
		
		//범위 검색 80 미만의 점수
		//[10, 45, 50, 65]
		System.out.println(ts.headSet(80));
		
		ts.descendingSet();
		ts.descendingIterator();
		
	}//main

}//class
