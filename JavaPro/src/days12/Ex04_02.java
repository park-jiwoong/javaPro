package days12;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 2. 18. - 오후 2:00:32
 * @subject 
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
/*
 * [병합 정렬 (merge sort)]
 * ㄴ 1) 이미 정렬되어져 있는 두 개의 배열을 합쳐서 하나의 배열로 만드는 정렬 방식
 * 
 * 
 */
		int [] m = {1,3,6,10,14};
		int [] n = {2,4,7};
				
		// 이 m,n 두 배열을 병합 정렬 하면 : {1,2,3,4,6,7,10,14}
		//int [] mn = new int [m.length + n.length];
		int [] mn = mergeSoft(m,n); //매개변수로 준다
		
		
		System.out.println(Arrays.toString(mn));
		
	
	} // main

	private static int[] mergeSoft(int[] m, int[] n) { //매개변수 리턴 타입도 들어가 있는 메소드
		int [] mn = new int[m.length + n.length];
		//				↓ i
		//	int [] m = {1,3,6,10,14};
		//				↓ j
		//	int [] n = {2,4,7};
		 //                                ↓ k
	      // int [] mn = [1, 0, 0, 0, 0, 0, 0, 0] 
		for (int i = 0; i < mn.length; i++) {
			
		}
		int i,j,k;
		i = j = k = 0;
		/*
		if (m[i] > n[j]) {
			mn[k] =m[j];
		} else {
			mn[k] = m[i];
		}
		*/
		while (i < m.length && j< n.length) {
			mn[k++] = m[i] > n[j]? n[j++] : m[i++];
		  } // while
	      
	      if (i == m.length) { // 남은 배열 n
	         System.arraycopy(n, j, mn, k, n.length-j);
	      } else {  // 남은 배열 m
	         System.arraycopy(m, i, mn, k, m.length-i);
	      } // if
	      
	      System.out.println( Arrays.toString(mn));
	      return mn;

	}//mersgeSoft   
	
} // class
