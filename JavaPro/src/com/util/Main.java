package com.util;// 백준 할 때는 package 없이 올려야 컴파일러 오류 안남

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {//Main 무조건 지정

	public static void main(String[] args) {

//	5. 게임횟수를 입력받아서 로또번호를 출력하는 코딩을 하세요. 
//	  ( 조건 : ArrayList 와 LinkedHashSet 컬렉션 클래스 사용 )
//	  ( 조건 : main 메서드 안에 모든 코딩을 하세요. )

		
		/*	 
		 Scanner scanner = new Scanner(System.in);
	      System.out.print("> 게임 횟수 입력 ? ");
	      int gameNumber = scanner.nextInt();
	      
	      Random random = new Random();
      
	      for (int i = 0; i < gameNumber; i++) {
	    	  LinkedHashSet lotto = new LinkedHashSet();
	    	  
	    	  while (lotto.size() < 6) {
				int number = random.nextInt(45) + 1;
				lotto.add(number);
			}// while
	    	  
	    	  ArrayList lottoList = new ArrayList(lotto);
	    	  System.out.println("게임" + (i+1) + "의 로또 번호: " + lottoList);
	    	  
		}//for
		*/
		
		




//		6. "1차_조편성.txt" 파일을 읽어와서 
//		  컬렉션 클래스를 사용하여 
//		  아래와 같이 출력하는 코딩을 하세요.  
//		  (조건) 각 조원들을 컬렉션 클래스에 저장해서 출력하기.

/*		
		String fileName = "C:\\Users\\pjw55\\Desktop\\복습문제\\1차_조편성.txt";
		ArrayList teamMembers = new ArrayList();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName)) ){
			String line;
			while ((line = br.readLine()) != null){
				teamMembers.add(line);
			}
		} catch (IOException e) {
		
		}
		int teamNumber = 1;
		System.out.println("[" + teamNumber + "조]");
		char memberIdentifier = 'A';
		
		for (Object member : teamMembers) { // 제네릭을 사용하지 않을시 String에서 Object로 바꿔줘야함 ! 
			String memberStr = (String)member;
			
			if (memberStr.isEmpty()) {
				teamNumber++;
				memberIdentifier = 'A';
				System.out.println("\n[" + teamNumber + "조]");
			}else {
				System.out.println("\t" + memberIdentifier + ". " + memberStr);
			}
			
		}//for
*/
		
	}//main

}//class
